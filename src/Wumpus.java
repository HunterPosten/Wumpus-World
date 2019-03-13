import java.util.Random;

/**
 *
 *
 */
public class Wumpus implements  Boardable{

    Board board;

    Random rand = new Random();

    private int[] xPlaces;
    private int[] yPlaces;

    Wumpus(Board board) {
        this.board = board;
        xPlaces = new int[this.board.getHeight()];
        yPlaces = new int[this.board.getWidth()];

        fillPlaces(xPlaces, yPlaces);
        this.board.placeItem(this, placeWumpusX(), placeWumpusY());

    }

    private void fillPlaces(int[] x, int[] y){
        for (int i = 2; i < xPlaces.length; i++) {
            x[i] = i;
            y[i] = i;
        }

    }

    @Override
    public boolean canShare(Boardable item) {
        return true;
    }

    @Override
    public boolean isVisible(){
        return true;
    }

    public String toString() {

        return "W";
    }

    private int placeWumpusX() {
        return xPlaces[rand.nextInt(this.xPlaces.length)];
    }

    private int placeWumpusY() {
        return yPlaces[rand.nextInt(this.yPlaces.length)];
    }
}
