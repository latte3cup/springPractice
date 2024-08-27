package main;

import config.ProjectConfig;
//import config.ProjectConfigTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot x = new Parrot();
        x.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> x;

        //context.registerBean("parrot1", Parrot.class, parrotSupplier);

        context.registerBean("parrotWithProgramming",
                Parrot.class,
                parrotSupplier,
                bc -> bc.setPrimary(true));  /// Primary  설정

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

    }

}


