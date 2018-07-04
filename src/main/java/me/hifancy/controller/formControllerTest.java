package me.hifancy.controller;

import me.hifancy.domain.mapper.userMapper;
import me.hifancy.domain.pojo.User;
import me.hifancy.service.userService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author facny
 * @Description:
 * @Modify by:
 * @since Create in 18:13 2018/7/4
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class formControllerTest {
    @Autowired
    private userService userService;
    @Autowired
    private userMapper userMapper;
    @Test
    public void testForm(){
        String name = "admin";
        User user = userMapper.signinCheck(name);
        System.out.println(user.getPassword());
        if (userService.signin(user)){
            System.out.println("success");
        }
    }

    @Test
    public void testSignup(){
        User user = new User();
        String name = "zouguoliang";
        String password = "admin";
        user.setUserName(name);
        user.setPassword(password);
        userService.signup(user);

        System.out.println(userMapper.getUserList().toString());
    }
}
