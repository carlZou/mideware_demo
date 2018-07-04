package me.hifancy.service;

import me.hifancy.domain.mapper.infoMapper;
import me.hifancy.domain.pojo.Guy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author facny
 * @Description:
 * @Modify by:
 * @since Create in 1:23 2018/7/5
 */
@Service
public class guyService {
    @Autowired
    private infoMapper infoMapper;

    public boolean addGuy(Guy guy){
        try {
            infoMapper.addGuy(guy);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
