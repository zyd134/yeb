package com.zhang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author thinkpad
 */
@SpringBootApplication
@MapperScan("com.zhang.mapper")
@ComponentScan("com.zhang")
public class YebServceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YebServceApplication.class,args);
    }

}
