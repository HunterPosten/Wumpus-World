/**
 *
 *
 */
public class Driver {


    public static void main(String[] args) {

        Board board = new Board(4,4);
        Player player = new Player();
        board.placeItem(player, 0, 0);
        board.printBoard();

    }
}
