package com.zhouyu;

import com.zhouyu.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public OrderService orderService(){
        return new OrderService();
    }

}
