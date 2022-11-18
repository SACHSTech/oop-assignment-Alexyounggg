package OOPAssignment;

   /**
     * OnlineCart class file
     * @author A. Young
     * 
     */

import java.util.ArrayList;

public class OnlineCart {

 
    // Instance variables
    private int numberOfItems;
    private Double totalCost;
    private Boolean emptyCart;
    private ArrayList<Products> itemType = new ArrayList<Products>();

 /**
  * Constructor - creates new instance of an keyboard class
  *
  * @param numberOfItems- Number of items in the cart
  * @param totalCost- Total cost of the online cart 
  * @param emtpyCart - If the cart is empty
  * @param itemType - The items in the cart
  */
    public OnlineCart (int numberOfItems, Double totalCost, Boolean emptyCart, ArrayList<Products> itemType) {
        this.numberOfItems = numberOfItems;
        this.totalCost = totalCost;
        this.emptyCart = emptyCart;
        this.itemType = itemType;
    }

     /**
       * Returns the number of items in the cart
       * 
       * @return number of items
       */

    public int getNumberOfItems() {
        return this.numberOfItems;
    }

     /**
       * Returns the total cost of items in the cart
       * 
       * @return total cost of items 
       */

    public Double getTotalCost() {
        return this.totalCost;
    }

     /**
       * Returns if the cart is empty
       * 
       * @return true or false depending on if the cart is empty
       */

    public Boolean getEmptyCart(){
        return emptyCart;
    }

     /**
       * Returns the items in the cart
       * 
       * @return array of items in the cart
       */

    public ArrayList<Products> getItemType(){ 
        return this.itemType;
    }

     /**
    * Adds cart balance by the product cost
    * @param cost - Cost of product
    * 
    */
    public void moneyPay(Double cost){
        totalCost += cost;
    }

      /**
    * Substracts cart balance by the product cost
    * @param cost - Cost of product
    * 
    */
    public void moneyTake(Double cost){
        totalCost -= cost;
    }

    public void cartChange(){
        numberOfItems = itemType.size();
    }
}
