package OOPAssignment;

public class Boardgames extends Games {
    
    private int boardDimensions;
    private String gameType;

    public Boardgames(Double price, String nameOfProduct, int playerCount, int ageRate, int boardDimensions, String gameType ){
        super (price, nameOfProduct, playerCount, ageRate);
        this.boardDimensions = boardDimensions;
        this.gameType = gameType;
    }

    public int getDimensions(){
        return this.boardDimensions;

    }

    public String getType() {
        return this.gameType;
    }
}
