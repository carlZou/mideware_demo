package me.hifancy.domain.test;

import com.alibaba.fastjson.JSON;
import me.hifancy.domain.mapper.infoMapper;
import me.hifancy.domain.mapper.userMapper;
import me.hifancy.domain.pojo.Guy;
import me.hifancy.domain.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author facny
 * @Description:
 * @Modify by:
 * @since Create in 13:51 2018/7/4
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class userMapperTest {
    @Autowired
    private userMapper userMapper;
    @Autowired
    private infoMapper infoMapper;
    @Test
    public void testQuery(){
        User user = userMapper.signinCheck("admin");
        System.out.println(user.toString());

    }

    @Test
    public void testJson(){

        List<Guy> list = infoMapper.getGuyList();
        String str = "{\"code\":\"0\",\"message\":\" \",\"data\":" + JSON.toJSON(list) + "}";
        System.out.println(JSON.toJSON(str));
    }

    @Test
    public void testInsert(){
//        userMapper.sginUp(new User(1,"admin2","admin2"));
    }

    @Test
    public void getUserListTest(){
        List<User> list = userMapper.getUserList();
        System.out.println(list.toString());
    }
}
