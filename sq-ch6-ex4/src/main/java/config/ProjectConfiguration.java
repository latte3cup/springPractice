package config;

import Aspects.LoggingAspect;
import Aspects.SecurityAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"services"})
@EnableAspectJAutoProxy
public class ProjectConfiguration{
    @Bean
    public LoggingAspect logAspect(){
        return  new LoggingAspect();
    }

    @Bean
    public SecurityAspect secAspect(){
        return new SecurityAspect();
    }
}
