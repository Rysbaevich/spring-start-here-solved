package services;

import aspects.ToLog;
import models.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        System.out.println("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }

    @ToLog
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
