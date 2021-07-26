package com.tunan.config.config;

import com.tunan.config.domain.Pet;
import com.tunan.config.domain.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 给容器中自动创建出这两个类型的组件、默认组件的名字就是全类名
@Import({User.class, Pet.class})
@Configuration(proxyBeanMethods = true)
public class ImportConfig {
}
