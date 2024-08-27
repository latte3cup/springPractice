package config;

import main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import main.Parrot;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("koko");

        return p;
    }

    @Bean
    public Person person() {
        Person p = new Person();
        p.setName("Ella");
        return p;
    }


}