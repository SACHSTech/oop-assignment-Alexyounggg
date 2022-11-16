package OOPAssignment;

public class Games extends Products {
    
    private int playerCount;
    private int ageRate;
    
    public Games (Double price, String nameOfProduct, int playerCount, int ageRate) {
        super(price, nameOfProduct);
        this.playerCount = playerCount;
        this.ageRate = ageRate;
    }

    public int getPlayer() {
        return this.playerCount;

    }

    public int getRate() {
        return this.ageRate;
    }
}
