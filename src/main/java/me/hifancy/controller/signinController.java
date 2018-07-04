package me.hifancy.controller;

import me.hifancy.domain.pojo.User;
import me.hifancy.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

/**
 * @author facny
 * @Description:
 * @Modify by:
 * @since Create in 15:59 2018/7/4
 */
@Controller
public class signinController {
    @Autowired
    private userService userService;

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String sigin() {
        return "sigin";
    }

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public String signin(@ModelAttribute(value = "user") User user, HttpServletResponse response) {
        if (userService.signin(user)) {
            return response.encodeRedirectURL("/hello");
        }
        return response.encodeRedirectURL("/");
    }

    @RequestMapping(value = "/signupform", method = RequestMethod.GET)
    public String signin(){
        return "signup";
    }

    @RequestMapping(value = "/signupform", method = RequestMethod.POST)
    public String signup(@ModelAttribute(value = "user") User user, HttpServletResponse response) {
        if (userService.signup(user)) {
            return response.encodeRedirectURL("/signin");
        }
        return response.encodeRedirectURL("/signup");
    }
}
