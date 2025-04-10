package stackoverflow;

import java.util.ArrayList;
import java.util.List;

public class Answer extends Block{
  List<Comment> commentList;
  public Answer(String text, int vote, User user) {
    super(text, vote, user);
    this.commentList = new ArrayList<>();
  }
  public void addComment(Comment comment) {
    commentList.add(comment);
  }

  @Override
  public String toString() {
    return "Answer{" +
            "text='" + text + '\'' +
            ", vote=" + vote +
            ", user=" + user +
            '}';
  }
}
