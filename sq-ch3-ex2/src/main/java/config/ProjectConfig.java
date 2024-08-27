package config;

import main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import main.Parrot;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot(){
        System.out.println("Parrot has been created");
        Parrot p = new Parrot();
        p.setName("koko");
        return p;
    }

    @Bean
    public Person person() {
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot());
        return p;
    }


}