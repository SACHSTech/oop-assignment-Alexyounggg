package OOPAssignment;

import java.util.ArrayList;

public class OnlineCart {
    
    private int numberOfItems;
    private Double totalCost;
    private Boolean emptyCart;
    private ArrayList<String> itemType = new ArrayList<String>();

    public OnlineCart (int numberOfItems, Double totalCost, Boolean emptyCart, ArrayList<String> itemType) {
        this.numberOfItems = numberOfItems;
        this.totalCost = totalCost;
        this.emptyCart = emptyCart;
        this.itemType = itemType;
    }

    public int getNumberOfItems() {
        return this.numberOfItems;
    }

    public Double getTotalCost() {
        return this.totalCost;
    }

    public Boolean emptyCart(){
        return emptyCart;
    }

    public ArrayList<String> itemType(){ 
        return this.itemType;
    }
}
