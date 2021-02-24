package com.xawl.helloworld.config;

import com.xawl.helloworld.bean.Pet;
import com.xawl.helloworld.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    
    @Bean   //给容器中添加组件，方法名就是组件id
    public User user01(){
        return new User("zhangsan",19);
    }
    
    @Bean("tom")
    public Pet pet(){
        return new Pet("wangcai");
    }
}
