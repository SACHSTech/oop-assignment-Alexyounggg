package OOPAssignment;

public class Keyboard {
    
    private int sizePercent;
    private Boolean ifLighting;
    private Boolean ifWireless;

    public Keyboard (int sizePercent, Boolean ifLighting, Boolean ifWireless) {
        this.sizePercent = sizePercent;
        this.ifLighting = ifLighting;
        this.ifWireless = ifWireless;
    }

    public int getSizePercent() {
        return this.sizePercent;

    }

    public Boolean getIfLighting() {
        return this.ifLighting;
    }

    public Boolean getIfWireless() {
        return this.ifWireless;

    }

    
}
