package org.javasource;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    public Student getStudent(){
        return new Student(64641,"Kaymon McCain");
    }
    @Bean(name = "myAddress")
    public Address getAddress(){
        return new Address("Lincoln","NE","US","68548");
    }
    @Bean
    public Phone getPhone1(){
        return new Phone("741-648-3145");
    }

    @Bean
    public Phone getPhone2(){
        return new Phone("568-452-6774");
    }

    @Bean
    public Phone getPhone3(){
        return new Phone("874-458-962");
    }
}
