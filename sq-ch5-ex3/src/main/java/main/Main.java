package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before referencing the CommentService");
        var b = c.getBean(CommentService.class);
        System.out.println("After referencing the CommentService");


    }
}