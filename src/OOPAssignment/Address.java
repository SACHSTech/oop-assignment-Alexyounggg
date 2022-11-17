package OOPAssignment;

   /**
     * Address class file
     * @author A. Young
     * 
     */

public class Address {

    // Instance variables
    private String customerStreet;
    private String customerCity;
    private String customerProvince;
    private String customerCountry;

/**
  * Constructor - creates new instance of an address
  *
  * @param customerStreet - The customer's street
  * @param customerCity- The customer's city
  * @param customerProvince- The customer's province
  * @param customerCountry- The customer's country
  */
    public Address(String customerStreet, String customerCity, String customerProvince, String customerCountry) {
        this.customerStreet = customerStreet;
        this.customerCity = customerCity;
        this.customerProvince = customerProvince;
        this.customerCountry = customerCountry;  
    }

      /**
       * Strings together parameters to form the customer's address
       * 
       * @return Sentence which represents the customer's address
       */
      
    public String toString() {
        
        return this.customerProvince + ", " + this.customerCountry + " on " + this.customerCity + ", " + this.customerStreet;
    }
}
