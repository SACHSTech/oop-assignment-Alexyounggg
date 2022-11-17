package OOPAssignment;

    /**
     * Laptop class file
     * @author A. Young
     * 
     */

public class Laptop extends Products {
    
 
    // Instance variables
    private String processor;
    private Boolean hasCamera;
    private String typeOfGPU;

      /**
  * Constructor - creates new instance of an keyboard class
  *
  * @param price- Product price
  * @param nameOfProduct- Name of product
  * @param processor - Laptop processor
  * @param hasCamera - If the laptop has a camera
  * @param typeOfGPU - What GPU the laptop has
  */
    public Laptop (Double price, String nameOfProduct, String processor, Boolean hasCamera, String typeOfGPU) {
        super(price,nameOfProduct);
        this.processor = processor;
        this.hasCamera = hasCamera;
        this.typeOfGPU = typeOfGPU;
    }

     /**
       * Returns the laptop processor 
       * 
       * @return processor
       */
    public String getProcessor() {
        return this.processor;

    }

     /**
       * Returns if the laptop has a camera
       * 
       * @return true or false depending on if the laptop has a camera 
       */

    public Boolean hasCamera() {
        return this.hasCamera;
    }

     /**
       * Returns the GPU of the computer 
       * 
       * @return computer GPU
       */
    public String typeOfGPU() {
        return this.typeOfGPU;
    }
}
