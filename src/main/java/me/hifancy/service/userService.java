package me.hifancy.service;

import me.hifancy.domain.mapper.userMapper;
import me.hifancy.domain.pojo.User;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author facny
 * @Description:
 * @Modify by:
 * @since Create in 16:46 2018/7/4
 */
@Service
public class userService {
    @Autowired
    private userMapper userMapper;

    public Boolean signin(User user){
        String locName = user.getUserName();
        String locPassword = user.getPassword();
        User dbUser = userMapper.signinCheck(locName);
        byte[] margent = Base64.decodeBase64(dbUser.getPassword());
        String dbpassword = new String(margent);
        if (locPassword.equals(dbpassword)){
            return true;
        }
        return false;
    }

    public Boolean signup(User user){
        try {
            String oldPassword = user.getPassword();
            String userName = user.getUserName();
            byte[] key = Base64.encodeBase64(oldPassword.getBytes(),true);
            String HEXPassword = new String(key);
            user.setUserName(userName);
            user.setPassword(HEXPassword);
            userMapper.sginUp(user);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
