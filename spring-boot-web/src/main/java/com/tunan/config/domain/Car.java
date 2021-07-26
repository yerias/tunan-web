package com.tunan.config.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
// 配置文件映射到Bean实例
@ConfigurationProperties(prefix = "mycart")
public class Car {
    private String name;
    private String price;
}
