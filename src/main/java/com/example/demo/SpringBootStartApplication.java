package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Zhangxin
 * @title: SpringBootStartApplication
 * @projectName testWar
 * @description: 修改启动类，继承 SpringBootServletInitializer 并重写 configure 方法
 * @date 2019/7/2  13:53
 */
public class SpringBootStartApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(YuanianApplication.class);
    }
}
