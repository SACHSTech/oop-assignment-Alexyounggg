package OOPAssignment;

public class OnlineCart {
    
    int[] numberOfItems;
    Double totalCost;
    Boolean emptyCart;
    String[] itemType;

    public OnlineCart (int[] numberOfItems, Double totalCost, Boolean emptyCart, String[] itemType) {
        this.numberOfItems = numberOfItems;
        this.totalCost = totalCost;
        this.emptyCart = emptyCart;
        this.itemType = itemType;
    }

    public int getNumberOfItems() {
        return this.numberOfItems.length;
    }

    public Double getTotalCost() {
        return this.totalCost;
    }

    public Boolean emptyCart(){
        return emptyCart;
    }

    public String[] itemType(){ 
        return this.itemType;
    }
}
