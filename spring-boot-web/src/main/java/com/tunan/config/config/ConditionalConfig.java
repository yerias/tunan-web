package com.tunan.config.config;


import com.tunan.config.domain.Pet;
import com.tunan.config.domain.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@ConditionalOnBean         	当给定的在bean存在时,则实例化当前Bean
//@ConditionalOnMissingBean  	当给定的在bean不存在时,则实例化当前Bean
//@ConditionalOnClass        	当给定的类名在类路径上存在，则实例化当前Bean
//@ConditionalOnMissingClass 	当给定的类名在类路径上不存在，则实例化当前Bean
@ConditionalOnMissingClass("pet1111111")
@Configuration(proxyBeanMethods = true)
public class ConditionalConfig {

    @Bean
    public Pet pet1111111(){
        return new Pet("tom");
    }


    @Bean
    // 由于容器中已经有了实例pet1111111，所以不实例化当前Bean
    @ConditionalOnMissingBean(name = "pet1111111")
    public User user1111111(){
        return new User("zhangsan",18);
    }

}
