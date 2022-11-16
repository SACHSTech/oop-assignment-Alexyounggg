package OOPAssignment;

public class Laptop extends Products {
    
    private String processor;
    private Boolean hasCamera;
    private String typeOfGPU;
   
    public Laptop (Double price, String nameOfProduct, String processor, Boolean hasCamera, String typeOfGPU) {
        super(price,nameOfProduct);
        this.processor = processor;
        this.hasCamera = hasCamera;
        this.typeOfGPU = typeOfGPU;
    }

    public String getProcessor() {
        return this.processor;

    }

    public Boolean hasCamera() {
        return this.hasCamera;
    }

    public String typeOfGPU() {
        return this.typeOfGPU;
    }
}
