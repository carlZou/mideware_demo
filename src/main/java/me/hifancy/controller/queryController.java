package me.hifancy.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import me.hifancy.domain.mapper.infoMapper;
import me.hifancy.domain.mapper.userMapper;
import me.hifancy.domain.pojo.Guy;
import me.hifancy.domain.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * @author facny
 * @Description:
 * @Modify by:
 * @since Create in 23:15 2018/7/4
 */
@Controller
public class queryController {
    @Autowired
    private userMapper userMapper;
    @Autowired
    private infoMapper infoMapper;

    @ResponseBody
    @RequestMapping(value = "/query")
    public String qury() {
        List<Guy> list = infoMapper.getGuyList();
//        StringBuilder sb = new StringBuilder("{");
////        sb.append(" \"code\" : ").append()
//        String str = "{ \\\"code\\\":\"0\",\"message\":\" \",\"data\" : " + JSON.toJSON(list) + "}";
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",1);
        map.put("data",list);
        return JSON.toJSONString(map);
    }
}
