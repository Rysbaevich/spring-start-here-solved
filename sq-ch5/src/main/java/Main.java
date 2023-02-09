import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var commentService = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Nurdoolot");
        comment.setText("Abc");
        commentService.sendComment(comment);
    }
}
