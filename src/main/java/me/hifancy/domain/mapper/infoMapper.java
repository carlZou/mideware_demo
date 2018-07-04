package me.hifancy.domain.mapper;

import me.hifancy.domain.pojo.Guy;
import me.hifancy.domain.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author facny
 * @Description:
 * @Modify by:
 * @since Create in 0:14 2018/7/5
 */
@Repository
public interface infoMapper {
    @Select("SELECT g_name,dept_no,email,tel FROM guys_info")
    @Results({
            @Result(property = "gName", column = "g_name"),
            @Result(property = "deptNo", column = "dept_no"),
            @Result(property = "email", column = "email"),
            @Result(property = "tel", column = "tel")
    })
    public List<Guy> getGuyList();

    @Insert("INSERT INTO guys_info(g_name, dept_no, email,tel) VALUES(#{gName}, #{deptNo}, #{email}, #{tel})")
    public int addGuy(Guy guy);
}
