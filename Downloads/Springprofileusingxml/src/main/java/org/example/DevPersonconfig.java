package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevPersonconfig {
    @Bean
    public Person getperson(){
        return new Person("raj","monkey",14);
    }

}
