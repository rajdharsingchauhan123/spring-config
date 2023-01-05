package Springproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Empconfig {
    @Bean
    public Employee employee(){


        return new Employee(  );
    }
}
