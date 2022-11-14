package OOPAssignment;

import java.io.*;

public class Main {
    

    public static void main(String[] args) throws IOException {

        //Objects
        Customer userCustomer;
        OnlineCart userCart;
        Basketball smallBall;
        Basketball bigBall;
        Keyboard blueSwitchKeyboard;
        Keyboard normalKeyboard;
        Laptop gamingLaptop;
        Laptop workLaptop;

        
        // Intialize variables
        String firstName;
        String lastName;
        String street;
        String city;
        String province;
        String country;
        Double moneyAmount;
        Boolean emptyCart;
        Double totalCost; 
        int[] itemSize = new int [20];
        String[] itemNames = new String [20];

        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to the Online Shopping App of Amazing");
        System.out.println("Before you continue, we would like to ask you for some personal information");
        System.out.print("Please enter your first name: ");
        firstName = key.readLine();
        System.out.print("Please enter your last name: ");
        lastName = key.readLine();
        System.out.print("Please enter your street: ");
        street = key.readLine();
        System.out.print("Please enter your city: ");
        city = key.readLine();
        System.out.print("Please enter your province");
        province = key.readLine();
        System.out.print("Please enter your country");
        country = key.readLine();
        System.out.print("We are almost finished! We would like to know how much money you want to put into the app. You can add or withdraw money later on: ");
        moneyAmount = Double.parseDouble(key.readLine());

        // Creating customer object

        userCustomer = new Customer (firstName, lastName, new Address(street, city, province, country), moneyAmount);
        
        // Creating cart object
        userCart = new OnlineCart(itemSize, totalCost, emptyCart, itemNames);
        
        System.out.print("Great job! You can now get started with shopping.");

        System.out.print("Items: ")

    }
}
