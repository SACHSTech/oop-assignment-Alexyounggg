package OOPAssignment;

    /**
     * Keyboard class file
     * @author A. Young
     * 
     */

public class Keyboard extends Products {


    // Instance variables
    private int sizePercent;
    private Boolean ifWireless;

    /**
  * Constructor - creates new instance of an keyboard class
  *
  * @param price- Product price
  * @param nameOfProduct- Name of product
  * @param sizePercent - Size of the keyboard in percent
  * @param ifWireless - If the keyboard is wireless
  */
    public Keyboard (Double price, String nameOfProduct, int sizePercent, Boolean ifWireless) {
        super(price, nameOfProduct);
        this.sizePercent = sizePercent;
        this.ifWireless = ifWireless;
    }

     /**
       * Returns the size of the keyboard in percent 
       * 
       * @return keyboard size 
       */
    public int getSizePercent() {
        return this.sizePercent;

    }

     /**
       * Returns if the keyboard is wireless
       * 
       * @return true or false depending on if the keyboard is wireless
       */

    public Boolean getIfWireless() {
        return this.ifWireless;

    }

    /**
       * Prints out keyboard information
       * 
       */

    public void getInfo(){
        System.out.println("The size of the keyboard is " +sizePercent+ "%");
        if (ifWireless = true){
            System.out.println("The keyboard is wireless");

        }
        else{
            System.out.println("The keyboard is not wireless");
        }
    }

    
}
