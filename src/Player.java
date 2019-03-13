/**
 *
 */

public class Player implements  Boardable {

    Player() {


    }


    @Override
    public boolean canShare(Boardable item) {
        return false;
    }

    @Override
    public boolean isVisible() {
        return true;
    }

    public String toString() {
        return "P";
    }
}
