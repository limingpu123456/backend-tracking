package com.example.mpdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//这个可以设置所有mapper的扫描路径，就不用在每个dao文件夹下面的代码中写mapper注解了
@MapperScan("com.example.mpdemo.dao")
public class    MpDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpDemoApplication.class, args);
    }

}
