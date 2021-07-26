package com.tunan.config.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

// 读取beans.xml中配置Bean(Srping中都是配置的XML)
@ImportResource("classpath:beans.xml")
@Configuration(proxyBeanMethods = true)
public class ImportResourceConfig {

}
