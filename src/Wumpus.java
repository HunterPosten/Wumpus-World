/**
 *
 *
 */
public class Wumpus implements  Boardable{

    Board board;

    Wumpus(Board board) {
        this.board = board;
    }

    @Override
    public boolean canShare(Boardable item) {
        return true;
    }

    @Override
    public boolean isVisible(){
        return false;
    }

    public String toString() {

        return "";
    }
}
