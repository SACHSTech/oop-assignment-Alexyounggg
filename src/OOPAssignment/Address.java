package OOPAssignment;

public class Address {

    /**
     * Address class file
     * @author A. Young
     * 
     */
    
    private String customerStreet;
    private String customerCity;
    private String customerProvince;
    private String customerCountry;

    public Address(String customerStreet, String customerCity, String customerProvince, String customerCountry) {
        this.customerStreet = customerStreet;
        this.customerCity = customerCity;
        this.customerProvince = customerProvince;
        this.customerCountry = customerCountry;  
    }

    public String toString() {
        return this.customerProvince + ", " + this.customerCountry + " on " + this.customerCity + ", " + this.customerStreet;
    }
}
