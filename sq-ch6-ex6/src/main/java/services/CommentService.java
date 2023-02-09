package services;

import aspects.ToLog;
import models.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment) {
        logger.info("\u001B[32m" + "Publishing comment: " + comment.getText() + "\u001B[0m");
        return "SUCCESS";
    }

    public void deleteComment(Comment comment) {
        System.out.println("Deleting comment: " + comment.getText());
    }

    public void editComment(Comment comment) {
        System.out.println("Editing comment: " + comment.getText());
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
