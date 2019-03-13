/**
 *
 *
 */
public class Driver {


    public static void main(String[] args) {

        Board board = new Board(4,4);
        Player player = new Player(board);
        Wumpus wumpus = new Wumpus(board);

        board.printBoard();

    }
}
