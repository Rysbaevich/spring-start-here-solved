package service;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private final ApplicationContext applicationContext;

    @Autowired
    public CommentService(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public void sendComment(Comment c) {
        CommentProcessor p = applicationContext.getBean(CommentProcessor.class);
        p.setComment(c);
        p.processComment();
        p.validateComment();
        c = p.getComment();
        System.out.println(c);
    }
}
