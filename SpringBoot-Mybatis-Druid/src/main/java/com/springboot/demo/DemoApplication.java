package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableConfigurationProperties(TestConfigBean.class)
//@EnableAutoConfiguration
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
//        app.setBannerMode(Banner.Mode.OFF);   //控制是否打印banner
//        app.setAddCommandLineProperties(false); //关闭命令行修改配置
        app.run(args);
    }
}
