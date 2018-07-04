package me.hifancy.domain.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @author facny
 * @Description:
 * @Modify by:
 * @since Create in 13:27 2018/7/4
 */

public class User {

    private String userName;
    private String password;

    @Override
    public String toString() {
        return "user{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
