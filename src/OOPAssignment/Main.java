package OOPAssignment;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    

    private static final String ArrayUtils = null;

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
        Boolean onApp = true;
        Boolean emptyCart = true;
        Double totalCost; 
        totalCost = 0.00;
        int n = 0;
        ArrayList<String> itemNames = new ArrayList<String>();
        int itemSize = 0;
      

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
        System.out.print("Please enter your province: ");
        province = key.readLine();
        System.out.print("Please enter your country: ");
        country = key.readLine();
        System.out.print("We are almost finished! We would like to know how much money you want to put into the app. You can add or withdraw money later on: ");
        moneyAmount = Double.parseDouble(key.readLine());      
        
        // Creating cart object
        

        smallBall = new Basketball(28.00, "Kids Basketball", 27.5, "yellow");
        bigBall = new Basketball(35.00, "Adults Basketball", 29.5, "brown");
       
        
        System.out.print("Great job! You can now get started with shopping.  ");
        System.out.print("Some commands to assist you: Shop, moneyCheck, cartSize.");
        
        
        while(onApp == true) {
        userCustomer = new Customer (firstName, lastName, new Address(street, city, province, country), moneyAmount);
        userCart = new OnlineCart(itemSize, totalCost, emptyCart, itemNames);
        System.out.println("What would you like to do?: ");
        String command = key.readLine();

       

        if(command.equals("Shop")) {
            System.out.print("Items: Small basketball, Big basketball ");
            System.out.print(" What would you like to purchase: ");
            String item = key.readLine();

            itemNames.add(item);
            itemSize = itemNames.size();
            n++;

            

            if (item.equals("Small Basketball") && moneyAmount > 28){
                totalCost += 28;
                moneyAmount -= 28;
                System.out.print("You have purchased a small basketball for $" +smallBall.getPrice());
            }

            else if (item.equals("Big Basketball") && moneyAmount > 35){
                totalCost += 35;
                moneyAmount -= 35;
                System.out.print("You have purchased a big basketball for $" +bigBall.getPrice());
            }
            
            
        }

        else if (command.equals("moneyCheck")) {
            System.out.println("You have $" + userCustomer.getMoney() +" left");
            
        }

        else if(command.equals("totalCost")){
            System.out.println("Total cost of $" + userCart.getTotalCost());
        }

        else if(command.equals("cartSize")){ 
            System.out.println("You have a total of " +userCart.getNumberOfItems() + "items");
        }

        else if (command.equals("Purchase")){
            System.out.println("Thank you for confirming your purhcase " +userCustomer.getFirstName() + "! We will ship everything to " + userCustomer.getAddress());
        }

        else if (command.equals("Balance")){
            System.out.println("Do you want to put or withdraw money from your account?: ");
            String balance = key.readLine();

            if (balance.equals("Put")){
                System.out.println("How much money are you going to put in?: ");
                Double putMoney = Double.parseDouble(key.readLine());
                moneyAmount += putMoney;
            }

            if (balance.equals("Withdraw")){
                System.out.println("How much money are you going to take out?: ");
                Double withdrawMoney = Double.parseDouble(key.readLine());
                if (withdrawMoney > moneyAmount) {
                    System.out.print("Invalid request.");

                }
                else{
                    moneyAmount -= withdrawMoney;
                }

            }
        }
        else if(command.equals("Remove")){
            System.out.println("Which item do you want to remove.");
            for (int i = 0; i < n ; i++) {
                System.out.println(itemNames.get(i));

                
            }

            int takeOut = Integer.parseInt(key.readLine());
            System.out.println("You have removed " + itemNames.get(takeOut));
            itemNames.remove(takeOut);
                

            
                
            
        }

        else if(command.equals("Cart items") && itemSize > 1){
            for (int i = 0; i < n; i++){
                System.out.println(itemNames.get(i));
            }
           
        }
      
    }
    }
}
