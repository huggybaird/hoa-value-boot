package com.hoavalue.springboot;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan("com.hoavalue")
@EntityScan("com.hoavalue.*")  
@EnableJpaRepositories("com.hoavalue.data")
//What spring looks for: @Component, @Service, @Controller, @RestController, @Repository
//spring-boot-starter-web is used for either MVC or RestControllers
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	ApplicationContext ctx = SpringApplication.run(App.class, args);
    	
        //System.out.println( "Hello World!" );
    }
    
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            //for (String beanName : beanNames) {
            //    System.out.println(beanName);
            //}
            System.out.println("Done inspecting beans provided by Spring Boot:");

        };
    }
}
