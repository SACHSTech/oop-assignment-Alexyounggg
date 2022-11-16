package OOPAssignment;

public class Keyboard extends Products {
    
    private int sizePercent;
    private Boolean ifWireless;

    public Keyboard (Double price, String nameOfProduct, int sizePercent, Boolean ifWireless) {
        super(price, nameOfProduct);
        this.sizePercent = sizePercent;
        this.ifWireless = ifWireless;
    }

    public int getSizePercent() {
        return this.sizePercent;

    }

    public Boolean getIfWireless() {
        return this.ifWireless;

    }

    
}
