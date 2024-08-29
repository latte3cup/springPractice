package services;

import Aspects.ToLog;
import models.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;


@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public void publishComment(Comment comment){
        logger.info("Publishing comment: " + comment.getText());
    }

    public void deleteComment(Comment comment){
        logger.info("Deleting comment: " + comment.getText());
    }

    public void editComment(Comment comment){
        logger.info("Editing comment: " + comment.getText());
    }
}
