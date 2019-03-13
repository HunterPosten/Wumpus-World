import java.util.Random;

/**
 *
 *
 */
public class Wumpus implements  Boardable{

    Board board;

    Random rand = new Random();




    Wumpus(Board board) {
        this.board = board;

        boolean placed = false;

        while(!placed){
            int x = placeWumpusX();
            int y = placeWumpusY();

            if((x<=this.board.getWidth() || x>1) && (y<=this.board.getHeight() || y > 1)){
                this.board.placeItem(this, y, x);

                placed = true;
            }
        }


    }

    private class Stentch implements Boardable {

        public Stentch(Wumpus wumpus){

        }

        @Override
        public boolean canShare(Boardable item) {
            return true;
        }

        @Override
        public boolean isVisible() {
            return true;
        }

        @Override
        public String toString() {
            return "S";
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
        int y = rand.nextInt(this.board.getHeight());
        System.out.println(y);
        return y;    }

    private int placeWumpusY() {
        int x = rand.nextInt(this.board.getWidth());
        System.out.println(x);
        return x;
    }


}
