import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 *
 */
public class Board {

    private Cell[][] board;

    private int height;

    private int width;

    HashMap<Cell, Boardable> whatIsInCell;


    public Board(int height, int width) {

        this.width = width;
        this.height = height;

        whatIsInCell = new HashMap<>();
        this.board = new Cell[this.height][this.width];

        this.fillBoard();

    }

    private void fillBoard (){

        for (int row = 0; row < this.height; row++){

            for (int col = 0; col < this.width; col++) {

                Cell temp = new Cell(row, col);
                this.board[row][col] = temp;
            }
        }

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

    public boolean placeItem(Boardable item, int row, int col) {

        Cell cell;

        // Were valid coordinate passed in?
        if(row < 0 || row > this.height-1 || col < 0 || col > this.width-1) {
            return false;
        }

        cell = this.board[row][col];
        cell.items.add(item);
        whatIsInCell.put(cell, item);
        return true;
    }



    private class Cell {

        int col;
        int row;
        boolean isVisible;
        ArrayList<Boardable> items;



        Cell(int row, int col) {

            this.row = row;
            this.col = col;
            this.isVisible = false;
            this.items = new ArrayList<> (  );

        }

        public boolean addElement(Boardable item){

            if (items.size() != 0){
                if (items.get(items.size()-1).canShare(item)){
                    items.add(item);
                    return true;
                }
                return false;
            }

            items.add(item);

            if(item.isVisible()) { this.isVisible = true; }

            return true;
        }

        public int getCol() { return this.col; }

        public int getRow() { return this.row; }

        public String toString() {
            if(this.isVisible){
                if(items.size() != 0) {
                    if (!(items.get(items.size() - 1).isVisible())) {
                        return "[" + items.get(items.size()-1).toString() + "]";
                    } else {
                        return items.get(items.size() - 1).toString();
                    }
                }
                return "[ ]";
            }
            return "[ ]";
        }




    }
}
