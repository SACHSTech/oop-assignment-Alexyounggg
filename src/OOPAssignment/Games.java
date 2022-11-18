package OOPAssignment;

    /**
     * Games class file
     * @author A. Young
     * 
     */
public abstract class Games extends Products {

  
    // Instance variables
    private int playerCount;
    private int ageRate;
    
    /**
  * Constructor - creates new instance of an basketball object
  *
  * @param price - Product price
  * @param nameOfProduct- Name of the product
  * @param playerCount- Players who can play the game
  * @param ageRate- Minimum age to play the game
  */
    public Games (Double price, String nameOfProduct, int playerCount, int ageRate) {
        super(price, nameOfProduct);
        this.playerCount = playerCount;
        this.ageRate = ageRate;
    }

     /**
       * Returns the amount of players that can play
       * 
       * @return player count
       */
    public int getPlayer() {
        return this.playerCount;

    }

     /**
       * Returns the minimum age to play the game 
       * 
       * @return minimum age to play
       */
    public int getRate() {
        return this.ageRate;
    }
}
