package stackoverflow;

import java.util.ArrayList;
import java.util.List;

public class StackOverflow {
  public List<Question> questionList;
  public static StackOverflow instance = null;
  private StackOverflow() {
    questionList = new ArrayList<>();
  }
  public static synchronized StackOverflow getInstance() {
    if(instance == null)
      instance = new StackOverflow();
    return instance;
  }
  public void addQuestion(Question question) {
    questionList.add(question);
  }
  public void answerQuestion(Question question, Answer answer) {
    question.addAnswer(answer);
  }
  public void upVote(Block block) {
    block.upvote();
    block.user.upvote();
  }
  public void downVote(Block block) {
    block.downvote();
    block.user.downvote();
  }
}
