package OOPAssignment;

public class Products {
    
    /**
     * Products class file
     * @author A. Young
     * 
     */

    private Double price;
    private String nameOfProduct;

    public Products (Double price, String nameOfProduct) {
        this.price = price;
        this.nameOfProduct = nameOfProduct;
    }

    public Double getPrice() {
        return this.price;
    }

    public String getProductName() {
        return this.nameOfProduct;
    }
}
