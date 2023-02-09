package repository;

import model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository {

    @Override
    public void store(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
