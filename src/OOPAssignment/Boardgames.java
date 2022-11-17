package OOPAssignment;

public class Boardgames extends Games {

    /**
     * Boardgames class file
     * @author A. Young
     * 
     */
    
    private int boardArea;
    private String gameType;

    public Boardgames(Double price, String nameOfProduct, int playerCount, int ageRate, int boardArea, String gameType ){
        super (price, nameOfProduct, playerCount, ageRate);
        this.boardArea = boardArea;
        this.gameType = gameType;
    }

    public int getDimensions(){
        return this.boardArea;

    }

    public String getType() {
        return this.gameType;
    }
}
