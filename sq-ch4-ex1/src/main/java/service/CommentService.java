package service;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import proxy.CommentNotificationProxy;
import repository.CommentRepository;

@Service
public class CommentService {
    private final CommentNotificationProxy commentNotificationProxy;
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(
            @Qualifier("Push") CommentNotificationProxy commentNotificationProxy,
            CommentRepository commentRepository) {
        this.commentNotificationProxy  = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment) {
        commentRepository.store(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
