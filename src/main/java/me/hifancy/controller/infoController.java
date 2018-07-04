package me.hifancy.controller;

import me.hifancy.domain.mapper.infoMapper;
import me.hifancy.domain.pojo.Guy;
import me.hifancy.service.guyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * @author facny
 * @Description:
 * @Modify by:
 * @since Create in 1:19 2018/7/5
 */
@Controller
public class infoController {
    @Autowired
    private infoMapper infoMapper;
    @Autowired
    private guyService guyService;

    @RequestMapping(value = "addinfo",method = RequestMethod.POST)
    public String addInfo(@ModelAttribute("guy") Guy guy, HttpServletResponse response) {
        if (guyService.addGuy(guy)) {
            return response.encodeRedirectURL("/query");
        }else {
            return "/error";
        }
    }

    @RequestMapping(value = "/queryinfo", method = RequestMethod.POST)
    public String queryInfo(@ModelAttribute("guy")Guy guy, HttpServletResponse response){
        return response.encodeRedirectURL("queryByxx");
    }
}
