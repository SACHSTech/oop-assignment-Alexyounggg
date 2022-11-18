package OOPAssignment;

  /**
     * Boardgames class file
     * @author A. Young
     * 
     */

public class Boardgames extends Games {

  
    // Instance variables
    private int boardArea;
    private String gameType;

/**
  * Constructor - creates new instance of an boardgames object
  *
  * @param price - Product price
  * @param nameOfProduct- Name of the product
  * @param playerCount - Players who can play the game
  * @param ageRate - Minimum age to play the game
  * @param boardArea - Area of the board
  * @param gameType - Type of board game
  */
    public Boardgames(Double price, String nameOfProduct, int playerCount, int ageRate, int boardArea, String gameType ){
        super (price, nameOfProduct, playerCount, ageRate);
        this.boardArea = boardArea;
        this.gameType = gameType;
    }

     /**
       * Returns the board area
       * 
       * @return board area
       */
    public int getDimensions(){
        return this.boardArea;

    }

     /**
       * Returns the boardgame type
       * 
       * @return boardgame type
       */

    public String getType() {
        return this.gameType;
    }

    public void getInfo(){
        System.out.println("Area of the board is " +boardArea + "inches");
        System.out.println("The type of board game is " +gameType);
    }
}
