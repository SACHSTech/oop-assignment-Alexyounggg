package OOPAssignment;

    /**
     * Basketball class file
     * @author A. Young
     * 
     */

public class Basketball extends Products{


    // Instance variables
    private Double size;
    private String colour;

/**
  * Constructor - creates new instance of an basketball object
  *
  * @param price - Product price
  * @param nameOfProduct- Name of the product
  * @param size- Size of basketball
  * @param colour- Colour of the basketball
  */
    public Basketball(Double price, String nameOfProduct, Double size, String colour) {
        super(price, nameOfProduct);
        this.size = size;
        this.colour = colour;
    
    }

    /**
       * Returns the basketball size
       * 
       * @return basketball size
       */

    public Double getSize() {
        return this.size;
    }

    /**
       * Returns the basketball colour
       * 
       * @return Basketball colour
       */

    public String getColour() {
        return this.colour;
    }

    /**
       * Prints out basketball information
       * 
       */
    public void getInfo(){
        System.out.println("Size of basketball is " +size+ "''");
        System.out.println("Colour of basketball is " + colour);
    }
}
