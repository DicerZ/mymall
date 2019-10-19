package com.zmz.malllearning.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by zmz on 2019/10/18.
 */
@Configuration
@MapperScan("com.zmz.malllearning.mbg.mapper")
public class MyBatisConfig {

}
