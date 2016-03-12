package cn.yunqitong.ms.ms.dao.client;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.yunqitong.ms.ms.dao.model.TRoleAuthority;
import cn.yunqitong.ms.ms.dao.model.TRoleAuthorityExample;
public interface TRoleAuthorityMapper {
    int countByExample(TRoleAuthorityExample example);

    int deleteByExample(TRoleAuthorityExample example);

    int insert(TRoleAuthority record);

    int insertSelective(TRoleAuthority record);

    List<TRoleAuthority> selectByExample(TRoleAuthorityExample example);

    int updateByExampleSelective(@Param("record") TRoleAuthority record, @Param("example") TRoleAuthorityExample example);

    int updateByExample(@Param("record") TRoleAuthority record, @Param("example") TRoleAuthorityExample example);
}