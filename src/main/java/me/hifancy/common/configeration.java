package me.hifancy.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class configeration extends WebMvcConfigurerAdapter {
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        //spring.view.prefix=/WEB-INF/jsp/
        //spring.view.suffix=.jsp
        //registry.jsp("/WEB-INF/jsp/", ".jsp");
        //registry.freeMarker();
        //registry.velocity();
        //registry.groovy();
        registry.freeMarker();

    }
}
