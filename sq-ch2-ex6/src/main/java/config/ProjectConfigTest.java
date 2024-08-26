package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfigTest {

    @Bean
    Parrot parrot1(){
        var p = new Parrot();
        p.setName("koko_test");
        return p;
    }
    @Bean
    Parrot parrot2(){
        var p = new Parrot();
        p.setName("miki_test");
        return p;
    }
    @Bean
    Parrot parrot3(){
        var p = new Parrot();
        p.setName("Riki_test");
        return p;
    }

    @Bean
    String hello(){
        return "hello_test";
    }

    @Bean
    Integer ten(){
        return 11;
    }
}