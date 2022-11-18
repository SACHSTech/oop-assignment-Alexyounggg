package OOPAssignment;

     /**
     * MechanicalKeyboard class file
     * @author A. Young
     * 
     */

public class MechanicalKeyboard extends Keyboard {

 
    // Instance variables 
    private String mechSwitch;
    private Boolean ifLighting;

   /**
  * Constructor - creates new instance of an keyboard class
  *
  * @param price- Product price
  * @param nameOfProduct- Name of product
  * @param sizePercent - Size of the keyboard in percent
  * @param ifWireless - If the keyboard is wireless
  * @param mechSwitch - The switch the keyboard has
  * @param ifLighting - If the keyboard lights up
  */
    public MechanicalKeyboard (Double price, String nameOfProduct, int sizePercent, Boolean ifWireless, String mechSwitch, Boolean ifLighting){
        super(price, nameOfProduct, sizePercent, ifWireless);
        this.mechSwitch = mechSwitch;
        this.ifLighting = ifLighting;
    }

     /**
       * Returns the switch of the keyboard
       * 
       * @return keyboard switch
       */
    public String getMechSwitch(){
        return this.mechSwitch;
    }

     /**
       * Returns if the keyboard has lighting
       * 
       * @return true or false depending if the keyboard has lighting
       */
    public Boolean getLighting(){
        return this.ifLighting;
    }

    public void getInfo(){
        System.out.println("This keyboard has " +mechSwitch+ " switch");
        
        if (ifLighting = true){
            System.out.println("The keyboard can light up");

        }
        else{
            System.out.println("The keyboard cannot light up");
        }
}
}


