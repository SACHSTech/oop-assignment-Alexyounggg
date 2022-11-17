package OOPAssignment;

    /**
     * Products class file
     * @author A. Young
     * 
     */

public class Products {
    


    private Double price;
    private String nameOfProduct;

/**
  * Constructor - creates new instance of an keyboard class
  *
  * @param price- Product price
  * @param nameOfProduct- Name of product
  */
    public Products (Double price, String nameOfProduct) {
        this.price = price;
        this.nameOfProduct = nameOfProduct;
    }

     /**
       * Returns the price of the product
       * 
       * @return product price
       */
    public Double getPrice() {
        return this.price;
    }

     /**
       * Returns the name of the product
       * 
       * @return product name
       */
    public String getProductName() {
        return this.nameOfProduct;
    }
}
