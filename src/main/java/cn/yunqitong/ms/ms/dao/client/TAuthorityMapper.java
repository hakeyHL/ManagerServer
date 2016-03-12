package cn.yunqitong.ms.ms.dao.client;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.yunqitong.ms.ms.dao.model.TAuthority;
import cn.yunqitong.ms.ms.dao.model.TAuthorityExample;

public interface TAuthorityMapper {
    int countByExample(TAuthorityExample example);

    int deleteByExample(TAuthorityExample example);

    int deleteByPrimaryKey(String authorityid);

    int insert(TAuthority record);

    int insertSelective(TAuthority record);

    List<TAuthority> selectByExample(TAuthorityExample example);

    TAuthority selectByPrimaryKey(String authorityid);

    int updateByExampleSelective(@Param("record") TAuthority record, @Param("example") TAuthorityExample example);

    int updateByExample(@Param("record") TAuthority record, @Param("example") TAuthorityExample example);

    int updateByPrimaryKeySelective(TAuthority record);

    int updateByPrimaryKey(TAuthority record);
}