package tictactoe;

public class Board {
  char[][] board;
  int n;

  Board(int n){
    this.n = n;
    this.board = new char[n][n];
    for(int i=0;i<n;i++) {
      for(int j=0;j<n;j++) {
        board[i][j] = '-';
      }
    }
  }

  public boolean isMovesOver() {
    for(int i=0;i<n;i++) {
      for(int j=0;j<n;j++) {
        if(board[i][j] == '-')
          return false;
      }
    }
    return true;
  }

  public void playMove(int x, int y, char symbol) {
    if(board[x][y] != '-')
      throw new IllegalArgumentException("Invalid Move!!");
    board[x][y] = symbol;
    for(int i=0;i<n;i++) {
      for(int j=0;j<n;j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  public boolean hasWinner() {
    for(int i=0;i<n;i++) {
      if(board[i][0] == board[i][1] && board[i][1] == board[i][2]
              && board[i][0] != '-')
        return true;
    }
    for(int i=0;i<n;i++) {
      if(board[0][i] == board[1][i] && board[1][i] == board[2][i]
              && board[0][i] != '-')
        return true;
    }
    if(board[0][0] == board[1][1] && board[1][1] == board[2][2]
            && board[0][0] != '-')
      return true;
    return board[0][2] == board[1][1] && board[1][1] == board[2][0]
            && board[2][0] != '-';
  }
}
