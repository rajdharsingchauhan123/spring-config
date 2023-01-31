package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class PersonConfig {
    @Bean
    public Person getperson(){
        return new Person("raj","peter",12);
    }


}
