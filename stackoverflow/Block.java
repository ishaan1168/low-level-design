package stackoverflow;

public abstract class Block {
  String text;
  int vote;
  User user;
  Block(String text, int vote, User user) {
    this.text = text;
    this.vote = vote;
    this.user = user;
  }
  public void upvote() {
    this.vote = this.vote+1;
  }
  public void downvote() {
    this.vote--;
  }
}
