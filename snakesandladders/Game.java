package snakesandladders;

public class Game {
  Board board;
  Player player1;
  Player player2;
  private static Game instance = null;

  private Game(Board board, Player player1, Player player2) {
    this.board = board;
    this.player1 = player1;
    this.player2 = player2;
  }

  public static synchronized Game getInstance(Board board, Player player1, Player player2) {
    if(instance == null)
      instance = new Game(board,player1,player2);
    return instance;
  }

  public boolean isFinished() {
    if(player1.getPosition() == 100)
      return true;
    else return player2.getPosition() == 100;
  }

  public void move(Player currentPlayer, int num) {
    int end = board.move(currentPlayer.getPosition(), num);
    currentPlayer.setPosition(end);
  }
}
