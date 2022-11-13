package OOPAssignment;

public class Customer{

    private String firstName;
    private String lastName;
    private Address address;    
    private Boolean onApp;
    private Double moneyAmount;

    public Customer (String firstName, String lastName, Address address, Double moneyAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.onApp = true;
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