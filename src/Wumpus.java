/**
 *
 *
 */
public class Wumpus implements  Boardable{

    Wumpus() {

    }

    @Override
    public boolean canShare(Boardable item) {
        return true;
    }

    @Override
    public boolean isVisible(){
        return false;
    }
}
