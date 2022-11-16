package OOPAssignment;

public class MechanicalKeyboard extends Keyboard {
    private String mechSwitch;
    private Boolean ifLighting;

    public MechanicalKeyboard (Double price, String nameOfProduct, int sizePercent, Boolean ifWireless, String mechSwitch, Boolean ifLighting){
        super(price, nameOfProduct, sizePercent, ifWireless);
        this.mechSwitch = mechSwitch;
        this.ifLighting = ifLighting;
    }

    public String getMechSwitch(){
        return this.mechSwitch;
    }

    public Boolean getLighting(){
        return this.ifLighting;
    }
}


