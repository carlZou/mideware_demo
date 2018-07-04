package me.hifancy.domain.mapper;

import me.hifancy.domain.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author facny
 * @Description:
 * @Modify by:
 * @since Create in 13:34 2018/7/4
 */
@Repository
public interface userMapper {
    @Select("SELECT u_name, u_password FROM user_account")
    @Results({
            @Result(property = "id", column = "u_id"),
            @Result(property = "userName", column = "u_name"),
            @Result(property = "password", column = "u_password")
    })
    public List<User> getUserList ();

    @Select("SELECT u_name,u_password FROM user_account WHERE u_name = '${userName}'")
    @Results({
            @Result(property = "userName", column = "u_name"),
            @Result(property = "password", column = "u_password")
    })
    public User signinCheck(@Param("userName")String userName);

    @Insert("INSERT INTO user_account(u_name, u_password) VALUES (#{userName}, #{password})")
    public int sginUp(User User);
}
