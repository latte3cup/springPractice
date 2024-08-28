package main;

import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.CommentService;
import models.Comment;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(commentRepository,commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo Comment");

        commentService.publishComment(comment);





    }
}