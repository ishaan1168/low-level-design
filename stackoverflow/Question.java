package stackoverflow;

import java.util.ArrayList;
import java.util.List;

public class Question extends Block{
  List<Answer> answerList;
  List<Comment> commentList;
  public Question(String text, int vote, User user) {
    super(text, vote, user);
    this.answerList = new ArrayList<>();
    this.commentList = new ArrayList<>();
  }
  public void addAnswer(Answer answer) {
    answerList.add(answer);
  }
  public void addComment(Comment comment) {
    commentList.add(comment);
  }

  @Override
  public String toString() {
    return "Question{" +
            "text='" + text + '\'' +
            ", vote=" + vote +
            ", user=" + user +
            '}';
  }
}
