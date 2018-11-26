package com.learning.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan({"com.learning.springboot.mapper"})
public class MybatisConfiguration {
}
