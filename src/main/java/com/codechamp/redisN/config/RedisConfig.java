package com.codechamp.redisN.config;

import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisConfig {
    private static final String redisURL="redis://127.0.0.1:6379";

    @Bean
    public Config config(){
        Config config = new Config();
        config.useSingleServer()
                .setAddress(redisURL);
        return config;
    }
}
