package OOPAssignment;

 /**
     * Customer class file
     * @author A. Young
     * 
     */

public class Customer{

   
    // Instance variables
    private String firstName;
    private String lastName;
    private Address address;    
    private Boolean onApp;
    private Double moneyAmount;


/**
  * Constructor - creates new instance of an customer
  *
  * @param firstName - Customers first name
  * @param lastName- Customers last name
  * @param address - Customers address
  * @param moneyAmount - Money the customer has
  */
    public Customer (String firstName, String lastName, Address address, Double moneyAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.onApp = true;
        this.moneyAmount = moneyAmount;
    }
    /**
       * Returns the customer's first name
       * 
       * @return firstName
       */
    
    public String getFirstName() {
        return this.firstName;
    }

    /**
       * Returns the customer's last name
       * 
       * @return lastname
       */
    public String getLastName() {
        return this.lastName;
    }
/**
       * Returns the customer's amount of money
       * 
       * @return money amount
       */

    public Double getMoney() {
        return this.moneyAmount;
    }

    /**
       * Returns the customer's address
       * 
       * @return customers address
       */
    public String getAddress() {
        return this.address.toString();
    }
    
}