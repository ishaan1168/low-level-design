package tictactoe;

import java.util.Scanner;

public class Game {
  private Player player1;
  private Player player2;
  private Player activePlayer;
  private Board board;
  private Scanner scanner;

  public Game() {
    player1 = new Player("Ishaan", 'X');
    player2 = new Player("Shivam", 'O');
    activePlayer = player1;
    board = new Board(3);
    scanner = new Scanner(System.in);
  }

  public void playGame() {
    while (!board.isMovesOver() && !board.hasWinner()) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      board.playMove(x, y, activePlayer == player1 ? 'X' : 'O');
      if (board.hasWinner()) {
        System.out.println("Winner Winner Chicken dinner! Player " + (activePlayer == player1 ? "1" : "2") + " wins!");
        return;
      }
      activePlayer = (activePlayer == player1) ? player2 : player1;
    }
  }

}
