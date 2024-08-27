package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("----------------------------------");
        Person person = context.getBean(Person.class);
        Person person2 = context.getBean(Person.class);

        //Parrot parrot = context.getBean(Parrot.class);


        System.out.println(person.getParrot());
        System.out.println(person2.getParrot());
        //System.out.println(parrot);

        //System.out.println(person.getParrot());
        System.out.println(person == person2); // true, 싱글톤 인스턴스 비교
        System.out.println(person.getParrot() == person2.getParrot()); // true, 싱글톤 인스턴스 비교

//        String[] beanNames = context.getBeanDefinitionNames();
//        for (String beanName : beanNames) {
//            System.out.println(beanName);
//        }

    }


}


