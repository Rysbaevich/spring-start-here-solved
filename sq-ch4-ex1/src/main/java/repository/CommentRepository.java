package repository;

import model.Comment;

public interface CommentRepository {
    void store(Comment comment);
}
