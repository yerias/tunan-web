package com.tunan.config;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.tunan.config.config.BeanConfig;
import com.tunan.config.config.PropertiesConfig;
import com.tunan.config.domain.Car;
import com.tunan.config.domain.Pet;
import com.tunan.config.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * @author Tunan
 */
@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ConfigApplication.class, args);

        Pet tom1 = run.getBean("tom", Pet.class);
        Pet tom2 = run.getBean("tom", Pet.class);
        BeanConfig autoConfig = run.getBean(BeanConfig.class);
        User user01 = autoConfig.user01();
        User user02 = autoConfig.user01();

        User user = run.getBean("user01", User.class);
        Pet tom = run.getBean("tom", Pet.class);

        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }


        System.out.println(user.getPet() == tom);
        System.out.println(user01 == user02);
        System.out.println(tom1 == tom2);
        System.out.println(autoConfig);


        boolean user1111111 = run.containsBean("user1111111");
        boolean pet1111111 = run.containsBean("pet1111111");

        System.out.println("容器中包含组件user1111111: "+user1111111);
        System.out.println("容器中包含组件pet1111111: "+pet1111111);


        boolean haha = run.containsBean("haha");
        boolean hehe = run.containsBean("hehe");
        System.out.println("haha："+haha);
        System.out.println("hehe："+hehe);


        System.out.println("=============================");

        Car bean = run.getBean(Car.class);

        System.out.println(bean.getName() + " "+bean.getPrice());


    }
}