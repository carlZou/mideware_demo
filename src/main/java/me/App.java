package me;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "me.hifancy")
@MapperScan("me.hifancy.domain.mapper")
@EntityScan("me.hifancy.domain.pojo")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
