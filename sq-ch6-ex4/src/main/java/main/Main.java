package main;

import Aspects.ToLog;
import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import models.Comment;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo commit");
        comment.setAuthor("Natasha");

        service.publishComment(comment);


    }
}