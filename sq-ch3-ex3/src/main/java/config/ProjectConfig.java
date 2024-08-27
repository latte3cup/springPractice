package config;

import main.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import main.Parrot;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot1(){
        System.out.println("Parrot1 has been created");
        Parrot p = new Parrot();
        p.setName("koko");
        return p;
    }
    @Bean
    @Primary
    public Parrot parrot2(){
        System.out.println("Parrot2 has been created");
        Parrot p = new Parrot();
        p.setName("mimi");
        return p;
    }


    @Bean
    public Person person(@Qualifier("parrot1") Parrot parrot) {
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot);
        return p;
    }


}