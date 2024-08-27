package config;

import main.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import main.Parrot;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {

}