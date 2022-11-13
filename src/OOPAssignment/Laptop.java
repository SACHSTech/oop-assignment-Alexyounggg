package OOPAssignment;

public class Laptop {
    
    private String processor;
    private Boolean hasCamera;
    private String typeOfGPU;
   
    public Laptop (String processor, Boolean hasCamera, String typeOfGPU) {
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
