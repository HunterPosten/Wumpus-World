/**
 *
 */

public class Player implements  Boardable {

    Board board;

    Player(Board board) {
        this.board=board;
        this.board.placeItem(this, 3,0);
    }


    @Override
    public boolean canShare(Boardable item) {
        return true;
    }

    @Override
    public boolean isVisible() {
        return true;
    }

    public String toString() {
        return "P";
    }
}
