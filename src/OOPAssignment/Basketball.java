package OOPAssignment;

public class Basketball extends Products{

    private Double size;
    private String colour;

    public Basketball(Double price, String nameOfProduct, Double size, String colour) {
        super(price, nameOfProduct);
        this.size = size;
        this.colour = colour;
    
    }

    public Double getSize() {
        return this.size;
    }

    public String getColour() {
        return this.colour;
    }
}
