package org.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@Configuration
@ComponentScan(basePackages = "org.annotations")
public class AppConfig {

    @Bean
    public String getString(){
        return new String("485-741-9658");
    }
    @Bean
    public Phone getPhone(){
        return new Phone("142-367-4125");
    }
}
