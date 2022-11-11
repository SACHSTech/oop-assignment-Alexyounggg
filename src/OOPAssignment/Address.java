package OOPAssignment;

public class Address {
    
    String customerStreet;
    String customerCity;
    String customerProvince;
    String customerCountry;

    public Address(String customerStreet, String customerCity, String customerProvince, String customerCountry) {
        this.customerStreet = customerStreet;
        this.customerCity = customerCity;
        this.customerProvince = customerProvince;
        this.customerCountry = customerCountry;  
    }

    public String getAddress() {
        return this.customerProvince + "," + this.customerCountry + "on" + this.customerCity + "," + this.customerStreet;
    }
}
