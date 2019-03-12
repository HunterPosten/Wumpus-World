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
}
