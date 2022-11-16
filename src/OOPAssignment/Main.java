package OOPAssignment;

import java.io.*;
import java.util.ArrayList;


public class Main {
    



    public static void main(String[] args) throws IOException {

        //Objects
        Customer userCustomer;
        OnlineCart userCart;
        Basketball smallBall;
        Basketball bigBall;
        MechanicalKeyboard blueSwitchKeyboard;
        Keyboard normalKeyboard;
        Laptop gamingLaptop;
        Laptop workLaptop;
        VideoGames minecraft;
        Boardgames monopoly;

        
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
        
        // Creating product objects
        
        smallBall = new Basketball(28.00, "Kids Basketball", 27.5, "yellow");
        bigBall = new Basketball(35.00, "Adults Basketball", 29.5, "brown");
        blueSwitchKeyboard = new MechanicalKeyboard(100.00, "Blue Switch Keyboard" ,100, true, "Blue Switch", true);
        normalKeyboard = new Keyboard(10.00, "Normal Keyboard" ,100, false);
        gamingLaptop = new Laptop (1500.00, "Gaming Laptop", "I9", true, "RTX 30");
        workLaptop = new Laptop(700.00, "Work Laptop" ,"I5", true, "None");
        minecraft = new VideoGames(35.00, "Minecraft", 5, 10, "PC", "Open world", true);
        monopoly = new Boardgames(20.00, "Monopoly", 8, 8, 400, "Dice" );
       
        
        System.out.print("Great job! You can now get started with shopping.  ");
        System.out.print("Some commands to assist you: Shop, moneyCheck, cartSize.");
        
        
        while(onApp == true) {
        userCustomer = new Customer (firstName, lastName, new Address(street, city, province, country), moneyAmount);
        userCart = new OnlineCart(itemSize, totalCost, emptyCart, itemNames);
        System.out.print("What would you like to do?: ");
        String command = key.readLine();

       

        if(command.equals("Shop")) {
            System.out.print("Items:\n 1. Small basketball\n 2. Big basketball \n 3. Blue switch keyboard \n 4. Membrane keyboard \n 5. Gaming laptop \n 6. Work laptop\n");
            System.out.print(" What would you like to purchase: ");
            String item = key.readLine();

            

            

            if (item.equals("Small basketball") && moneyAmount > 28){
                itemNames.add(item);
                itemSize = itemNames.size();
                n++;
                totalCost += 28;
                moneyAmount -= 28;
                System.out.print("You have purchased a small basketball for $" +smallBall.getPrice());
            }

            else if (item.equals("Big basketball") && moneyAmount > 35){
                itemNames.add(item);
                itemSize = itemNames.size();
                n++;
                totalCost += 35;
                moneyAmount -= 35;
                System.out.print("You have purchased a big basketball for $" +bigBall.getPrice());
            }

            else if (item.equals("Blue switch keyboard") && moneyAmount > 100){
                itemNames.add(item);
                itemSize = itemNames.size();
                n++;
                totalCost += 100;
                moneyAmount -= 100;
                System.out.print("You have purchased a blue switch keyboard for $" +blueSwitchKeyboard.getPrice());
            }

            
            else if (item.equals("Work keyboard") && moneyAmount > 10){
                itemNames.add(item);
                itemSize = itemNames.size();
                n++;
                totalCost += 10;
                moneyAmount -= 10;
                System.out.print("You have purchased a work keyboardfor $" +normalKeyboard.getPrice());
            }

            else if (item.equals("Gaming laptop") && moneyAmount > 1500){
                itemNames.add(item);
                itemSize = itemNames.size();
                n++;
                totalCost += 1500;
                moneyAmount -= 1500;
                System.out.print("You have purchased a gaming laptop for $" +gamingLaptop.getPrice());
            }

            else if (item.equals("Work laptop") && moneyAmount > 700){
                itemNames.add(item);
                itemSize = itemNames.size();
                n++;
                totalCost += 700;
                moneyAmount -= 700;
                System.out.print("You have purchased a work laptop for $" +workLaptop.getPrice());
            }

            else if (item.equals("Minecraft")){
                itemNames.add(item);
                itemSize = itemNames.size();
                n++;
                totalCost += 35;
                moneyAmount -= 35;
                System.out.print("You have purchased a Minecraft for $" + minecraft.getPrice());
            }

            else if(item.equals("Monopoly")){ 
                itemNames.add(item);
                itemSize = itemNames.size();
                n++;
                totalCost += 20;
                moneyAmount -= 20;
                System.out.print("You have purchased a work laptop for $" + monopoly.getPrice());
            }

            else{
                System.out.print("Invalid request");
            }

            



            
            
            
        }

        else if (command.equals("moneyCheck")) {
            System.out.println("You have $" + userCustomer.getMoney() +" left");
            
        }

        else if(command.equals("totalCost")){
            System.out.println("Total cost of $" + userCart.getTotalCost());
        }

        else if(command.equals("cartSize")){ 
            System.out.println("You have a total of " +userCart.getNumberOfItems() + " items");
        }

        else if (command.equals("Purchase")){
            System.out.println("Thank you for confirming your purhcase " +userCustomer.getFirstName() + "! We will ship everything to " + userCustomer.getAddress());
        }

        else if (command.equals("Balance")){
            System.out.println("Do you want to deposit or withdraw money from your account?: ");
            String balance = key.readLine();

            if (balance.equals("Deposit")){
                System.out.println("How much money are you going to deposit?: ");
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
                System.out.println(i + ". " +itemNames.get(i));

                
            }

            int takeOut = Integer.parseInt(key.readLine());
            System.out.println("You have removed " + itemNames.get(takeOut));

            
            if (itemNames.get(takeOut).equals("Small basketball")){
                totalCost -= 28;
              
            }

            else if (itemNames.get(takeOut).equals("Big basketball")){
                totalCost -= 35;
                
            }

            else if (itemNames.get(takeOut).equals("Blue switch keyboard")){
                totalCost -= 100;
            }

            
            else if (itemNames.get(takeOut).equals("Work keyboard")){
                totalCost -= 10;
     
            }

            else if (itemNames.get(takeOut).equals("Gaming laptop")){
                totalCost -= 1500;

            }

            else if (itemNames.get(takeOut).equals("Work laptop")){
                totalCost -= 700;
               
            }

            else if (itemNames.get(takeOut).equals("Minecraft")){
                totalCost -= 30;
            }

            else if (itemNames.get(takeOut).equals("Monopoly")){
                totalCost -= 20;
            }

            itemNames.remove(takeOut);
                
            
        }

        else if(command.equals("Cart items") && itemSize > 1){
            for (int i = 0; i < n; i++){
                System.out.println(itemNames.get(i));
            }
           
        }
      System.out.println("");
    }
    }
}
