import java.util.ArrayList;

/**
 *
 *
 */
public class Board {

    private Cell[][] board;

    private int height;

    private int width;


    Board(int height, int width) {

        this.width = width;
        this.height = height;


    }

    synchronized public void printBoard()
    {
        for(int row = 0; row < this.height; row++)
        {
            for(int col = 0; col < this.width; col++)
            {
                System.out.print(board[row][col].toString());
            }
            System.out.println("");
        }
    }







    private class Cell {

        int col;
        int row;
        boolean isVisible;
        ArrayList<Boardable> elements;



        Cell(int row, int col) {

            this.row = row;
            this.col = col;
            this.isVisible = false;
            elements = new ArrayList<Boardable> (  );
        }

        boolean addElement(Boardable item){



            return true;
        }





    }
}
