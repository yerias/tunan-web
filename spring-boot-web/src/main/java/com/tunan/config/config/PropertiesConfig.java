package com.tunan.config.config;

import com.tunan.config.domain.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
// 需要使用Car实例，就把Car实例和配置文件映射
//@EnableConfigurationProperties(Car.class)
public class PropertiesConfig {
}
