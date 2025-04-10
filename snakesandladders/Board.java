package snakesandladders;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
  int[] board;
  List<Snake> snakeList;
  List<Ladder> ladderList;
  Map<Integer,Integer> map;

  public Board(int size, List<Snake> snakeList, List<Ladder> ladderList) {
    this.board = new int[size];
    this.snakeList = snakeList;
    this.ladderList = ladderList;
    this.map = new HashMap<>();
    for(Snake snake: snakeList) {
      map.put(snake.getStart(), snake.getEnd());
    }
    for(Ladder ladder: ladderList) {
      map.put(ladder.getStart(), ladder.getEnd());
    }
  }

  public int move(int start, int num) {
    int end = start+num;
    if(end > 100)
      return start;
    else if(map.containsKey(end)) {
      System.out.println("Some snake or ladder came!!");
      return map.get(end);
    }
    else
      return end;
  }

}
