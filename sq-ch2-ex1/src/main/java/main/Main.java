package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //spring context Object
        var context = new AnnotationConfigApplicationContext();

        Parrot p = new Parrot();

    }
}
