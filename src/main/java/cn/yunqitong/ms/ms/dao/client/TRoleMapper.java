package cn.yunqitong.ms.ms.dao.client;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.yunqitong.ms.ms.dao.model.TRole;
import cn.yunqitong.ms.ms.dao.model.TRoleExample;

public interface TRoleMapper {
	int countByExample(TRoleExample example);

	int deleteByExample(TRoleExample example);

	int deleteByPrimaryKey(String roleid);

	int insert(TRole record);

	int insertSelective(TRole record);

	List<TRole> selectByExample(TRoleExample example);

	TRole selectByPrimaryKey(String roleid);

	int updateByExampleSelective(@Param("record") TRole record, @Param("example") TRoleExample example);

	int updateByExample(@Param("record") TRole record, @Param("example") TRoleExample example);

	int updateByPrimaryKeySelective(TRole record);

	int updateByPrimaryKey(TRole record);
}