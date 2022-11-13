package OOPAssignment;

public class Customer{

    String firstName;
    String lastName;
    Address address;    
    Boolean onApp;
    Double moneyAmount;

    public Customer (String firstName, String lastName, Address address, Boolean onApp, Double moneyAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.onApp = onApp;
        this.moneyAmount = moneyAmount;
    }
    
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Boolean getOnApp(){
        return this.onApp;
    }

    public Double getMoney() {
        return this.moneyAmount;
    }
}