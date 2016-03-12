package cn.yunqitong.ms.as.logic;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.yunqitong.exception.LogicException;
import cn.yunqitong.ms.as.dao.client.TVersionMapper;
import cn.yunqitong.ms.as.dao.model.TVersion;
import cn.yunqitong.ms.as.dao.model.TVersionExample;
import cn.yunqitong.ms.as.dao.model.TVersionExample.Criteria;
import cn.yunqitong.util.DateUtil;

@Service
public class VersionLogic {

	@Autowired
	TVersionMapper tVersionMapper;
	public  PageInfo getPageInfo(TVersion tVersion,Integer pageNum, Integer numPerPage){
		TVersionExample example = new TVersionExample();
		 Criteria c = example.createCriteria();
		//增加查询条件
		if(tVersion != null){
			if(tVersion.getName() != null && !tVersion.getName().equals("")){
				c.andNameLike("%"+tVersion.getName()+"%");
			}
			if(tVersion.getPlatform() != null && !tVersion.getPlatform().equals("")){
				c.andPlatformEqualTo(tVersion.getPlatform());
			}
			if(tVersion.getPublishTime() != null && !tVersion.getPublishTime().equals("")){
				String startTime = tVersion.getPublishTime()+" 00:00:00";
				String endTime = tVersion.getPublishTime()+" 23:59:59";
				try {
					c.andCreatetimeGreaterThanOrEqualTo(DateUtil.getDate(startTime));
					c.andCreatetimeLessThanOrEqualTo(DateUtil.getDate(endTime));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
		
		example.setOrderByClause("createtime desc");
		if(pageNum == null){
			pageNum=1;
		}
		if(numPerPage == null){
			numPerPage=20;
		}
		PageHelper.startPage(pageNum, numPerPage);
		List<TVersion> list = tVersionMapper.selectByExample(example);
		PageInfo pageInfo = new PageInfo(list);
		pageInfo.setPageSize(numPerPage);
		return pageInfo;
	}
	
	public void add(TVersion tVersion) throws LogicException{
		if(this.tVersionMapper.insertSelective(tVersion) < 1){
			throw new LogicException("保存失败");
		}
	}
}
