package bong.flyway.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {


    @Value("${spring.config.activate.on-profile}")
    public String profile;


    @Bean
    public Object testtt() {
        System.out.println("profile : "+ profile);
        return "Hello";
    }
}
