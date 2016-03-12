package cn.yunqitong.ms.as.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

import cn.yunqitong.dwz.ResultModel;
import cn.yunqitong.exception.LogicException;
import cn.yunqitong.ms.as.dao.model.TVersion;
import cn.yunqitong.ms.as.logic.VersionLogic;
import cn.yunqitong.util.MD5Util;
import cn.yunqitong.util.PropertyFactory;

@Controller
@RequestMapping("/as/version")
public class VersionController {
	
	private static final Logger logger = Logger.getLogger(VersionController.class);
	@Autowired
	VersionLogic versionLogic;
	
	@RequestMapping("/list")
	public ModelAndView list(TVersion tVersion,Integer pageNum, Integer numPerPage){
		ModelAndView mv = new ModelAndView("as/version/list");
		PageInfo  pageInfo = this.versionLogic.getPageInfo(tVersion,pageNum, numPerPage);
		mv.addObject("pageInfo", pageInfo);
		mv.addObject("model", tVersion);
		return mv;
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public ResultModel add(@RequestParam("vserionFile") MultipartFile vserionFile, TVersion tVersion){
			try {
				String uploadPath = PropertyFactory.getProperty("upload_real_path");
				String originalFilename = vserionFile.getOriginalFilename();
				File file = new File(uploadPath+originalFilename);
				vserionFile.transferTo(file);
				String md5Str = MD5Util.getFileMD5String(file);
				tVersion.setApppath(PropertyFactory.getProperty("upload_virtual_path"));
				tVersion.setCreatetime(new Date());
				//tVersion.setCreatetime(DateUtil.getDate("2011-11-11 01:01:01"));
				tVersion.setFilemd5(md5Str);
				tVersion.setFirewirename(originalFilename);
				FileInputStream in = new FileInputStream(file);
				byte [] buffer = new byte[in.available()];
				in.read(buffer);
				in.close();
				//tVersion.setFile(buffer);
				tVersion.setFirewiresize(vserionFile.getSize()+"");
				this.versionLogic.add(tVersion);
				return ResultModel.responseSuccess("保存成功");
			} catch (IllegalStateException e) {
				e.printStackTrace();
				return ResultModel.responseFaild("保存失败");
			} catch (IOException e) {
				e.printStackTrace();
				return ResultModel.responseFaild("保存失败");
			}catch (LogicException e) {
				e.printStackTrace();
				return ResultModel.responseFaild("保存失败");
			} 
	}
}
