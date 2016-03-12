package cn.yunqitong.ms.ms.dao.client;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.yunqitong.ms.ms.dao.model.TUsers;
import cn.yunqitong.ms.ms.dao.model.TUsersExample;

public interface TUsersMapper {
	int countByExample(TUsersExample example);

	int deleteByExample(TUsersExample example);

	int deleteByPrimaryKey(Long id);

	int insert(TUsers record);

	int insertSelective(TUsers record);

	List<TUsers> selectByExample(TUsersExample example);

	TUsers selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") TUsers record, @Param("example") TUsersExample example);

	int updateByExample(@Param("record") TUsers record, @Param("example") TUsersExample example);

	int updateByPrimaryKeySelective(TUsers record);

	int updateByPrimaryKey(TUsers record);
}