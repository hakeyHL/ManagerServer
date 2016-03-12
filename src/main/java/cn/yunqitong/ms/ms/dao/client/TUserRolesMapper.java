package cn.yunqitong.ms.ms.dao.client;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.yunqitong.ms.ms.dao.model.TUserRoles;
import cn.yunqitong.ms.ms.dao.model.TUserRolesExample;
public interface TUserRolesMapper {
    int countByExample(TUserRolesExample example);

    int deleteByExample(TUserRolesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TUserRoles record);

    int insertSelective(TUserRoles record);

    List<TUserRoles> selectByExample(TUserRolesExample example);

    TUserRoles selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TUserRoles record, @Param("example") TUserRolesExample example);

    int updateByExample(@Param("record") TUserRoles record, @Param("example") TUserRolesExample example);

    int updateByPrimaryKeySelective(TUserRoles record);

    int updateByPrimaryKey(TUserRoles record);
}