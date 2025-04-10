package snakesandladders;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Snake snake1 = new Snake(99,10);
    Snake snake2 = new Snake(10, 4);
    Snake snake3 = new Snake(43,20);
    List<Snake> snakeList = new ArrayList<>();
    snakeList.add(snake1);
    snakeList.add(snake2);
    snakeList.add(snake3);

    Ladder ladder1 = new Ladder(3,98);
    Ladder ladder2 = new Ladder(5,30);
    List<Ladder> ladderList = new ArrayList<>();
    ladderList.add(ladder1);
    ladderList.add(ladder2);

    Board board = new Board(100, snakeList, ladderList);
    Player player1 = new Player(1,"Ishaan", 0);
    Player player2 = new Player(2, "Shivam", 0);

    Game gameManager = Game.getInstance(board, player1, player2);

    Player currentPlayer = player1;
    Random random = new Random();

    while(!gameManager.isFinished()) {
      int num = random.nextInt(1, 7); //Use dice instead of using this
      gameManager.move(currentPlayer, num);
      System.out.println(currentPlayer.getName() + " is on position " + currentPlayer.getPosition());
      if(currentPlayer.getPosition() == 100) {
        System.out.println("Winner is " + currentPlayer.getName());
        break;
      }
      if (currentPlayer == player1)
        currentPlayer = player2;
      else
        currentPlayer = player1;
    }
  }
}
