package OOPAssignment;

import java.io.*;
import java.util.ArrayList;
import java.text.DecimalFormat;


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
        DecimalFormat dollarsDecimal = new DecimalFormat("0.00");
      

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
       
        
        System.out.println("Great job! You can now get started with shopping.  ");
        System.out.println("Commands: \n 1. Shop \n 2. Moneycheck \n 3. Totalcost \n 4. Cartsize \n 5. Purchase \n 6. Balance \n 7. Remove \n 8. Cart items \n 9. Command \n 10. Log off \n");
        
        
        while(onApp == true) {
        userCustomer = new Customer (firstName, lastName, new Address(street, city, province, country), moneyAmount);
        userCart = new OnlineCart(itemSize, totalCost, emptyCart, itemNames);
        System.out.print("What would you like to do?: ");
        String command = key.readLine();

       

        if(command.equalsIgnoreCase("Shop")) {
            System.out.print("Items:\n 1. Small basketball $28.00\n 2. Big basketball $35.00 \n 3. Blue switch keyboard $100.00 \n 4. Membrane keyboard $10.00 \n 5. Gaming laptop $1500.00\n 6. Work laptop $700.00\n 7. Minecraft $35.00 \n 8. Monopoly $20.00\n");
            System.out.print(" What would you like to purchase: ");
            String item = key.readLine();

            

            

            if (item.equalsIgnoreCase("Small basketball")){
                if (moneyAmount > 28){
                itemNames.add(item);
                itemSize = itemNames.size();
                n++;
                totalCost += 28;
                moneyAmount -= 28;
                System.out.print("You have purchased a small basketball for $" +dollarsDecimal.format(smallBall.getPrice()));
            }
            else{
                System.out.println("You do not have enough money to complete your order.");
            }
        }
            else if (item.equalsIgnoreCase("Big basketball")){
               if (moneyAmount > 35){
                itemNames.add(item);
                itemSize = itemNames.size();
                n++;
                totalCost += 35;
                moneyAmount -= 35;
                System.out.print("You have purchased a big basketball for $" +dollarsDecimal.format(bigBall.getPrice()));
            }
            else{
                System.out.println("You do not have enough money to complete your order.");
            }
                
            
        }

            else if (item.equalsIgnoreCase("Blue switch keyboard")){
                if (moneyAmount > 100){
                itemNames.add(item);
                itemSize = itemNames.size();
                n++;
                totalCost += 100;
                moneyAmount -= 100;
                System.out.print("You have purchased a blue switch keyboard for $" +dollarsDecimal.format(blueSwitchKeyboard.getPrice()));
            }
                else{
                    System.out.println("You do not have enough money to complete your order.");
                }
            }

            
            else if (item.equalsIgnoreCase("Work keyboard") && moneyAmount > 10){
                if (moneyAmount > 10){
                itemNames.add(item);
                itemSize = itemNames.size();
                n++;
                totalCost += 10;
                moneyAmount -= 10;
                System.out.print("You have purchased a work keyboardfor $" +dollarsDecimal.format(normalKeyboard.getPrice()));
                }

                else{
                    System.out.println("You do not have enough money to complete your order.");
                }
            }

            else if (item.equalsIgnoreCase("Gaming laptop")){
                if (moneyAmount > 1500){
                itemNames.add(item);
                itemSize = itemNames.size();
                n++;
                totalCost += 1500;
                moneyAmount -= 1500;
                System.out.print("You have purchased a gaming laptop for $" +dollarsDecimal.format(gamingLaptop.getPrice()));
                }
                else{
                    System.out.println("You do not have enough money to complete your order.");
                }
            }

            else if (item.equalsIgnoreCase("Work laptop")){
                if(moneyAmount > 700){
                itemNames.add(item);
                itemSize = itemNames.size();
                n++;
                totalCost += 700;
                moneyAmount -= 700;
                System.out.print("You have purchased a work laptop for $" +dollarsDecimal.format(workLaptop.getPrice()));
                }

                else{
                    System.out.println("You do not have enough money to complete your order.");
                }
            }

            else if (item.equalsIgnoreCase("Minecraft")){
                if(moneyAmount > 35){
                itemNames.add(item);
                itemSize = itemNames.size();
                n++;
                totalCost += 35;
                moneyAmount -= 35;
                System.out.print("You have purchased Minecraft for $" + dollarsDecimal.format(minecraft.getPrice()));
                }
                else{
                    System.out.println("You do not have enough money to complete your order.");
                }
            }

            else if(item.equalsIgnoreCase("Monopoly")){ 
                if (moneyAmount > 20){
                itemNames.add(item);
                itemSize = itemNames.size();
                n++;
                totalCost += 20;
                moneyAmount -= 20;
                System.out.print("You have purchased monopoly for $" + dollarsDecimal.format(monopoly.getPrice()));
                }
                else{
                    System.out.println("You do not have enough money to complete your order.");
                }
            }

            else{
                System.out.print("Invalid request");
            }

            



            
            
            
        }

        else if (command.equalsIgnoreCase("moneyCheck")) {
            System.out.println("You have $" + dollarsDecimal.format(userCustomer.getMoney())+" left");
            
        }

        else if(command.equalsIgnoreCase("totalCost")){
            System.out.println("Total cost of $" + dollarsDecimal.format(userCart.getTotalCost()));
        }

        else if(command.equalsIgnoreCase("cartSize")){ 
            System.out.println("You have a total of " +userCart.getNumberOfItems() + " items");
        }

        else if (command.equalsIgnoreCase("Purchase")){
            System.out.println("Thank you for confirming your purhcase "  + userCustomer.getFirstName() + "! We will ship everything to " + userCustomer.getAddress());
        }

        else if (command.equalsIgnoreCase("Balance")){
            System.out.println("Do you want to deposit or withdraw money from your account?: ");
            String balance = key.readLine();

            if (balance.equalsIgnoreCase("Deposit")){
                System.out.println("How much money are you going to deposit?: ");
                Double putMoney = Double.parseDouble(key.readLine());
                moneyAmount += putMoney;
                System.out.println("You have deposited $" +dollarsDecimal.format(putMoney));
            }

            if (balance.equalsIgnoreCase("Withdraw")){
                System.out.println("How much money are you going to take out?: ");
                Double withdrawMoney = Double.parseDouble(key.readLine());
                if (withdrawMoney > moneyAmount) {
                    System.out.print("Invalid request.");

                }
                else{
                    moneyAmount -= withdrawMoney;
                    System.out.println("You have withdrew $" + dollarsDecimal.format(withdrawMoney));
                }

            }
        }
        else if(command.equalsIgnoreCase("Remove")){
            System.out.println("Which item do you want to remove.");
            for (int i = 0; i < n ; i++) {
                System.out.println(i + ". " +itemNames.get(i));

                
            }

            int takeOut = Integer.parseInt(key.readLine());
            System.out.println("You have removed " + itemNames.get(takeOut));

            
            if (itemNames.get(takeOut).equalsIgnoreCase("Small basketball")){
                totalCost -= 28;
              
            }

            else if (itemNames.get(takeOut).equalsIgnoreCase("Big basketball")){
                totalCost -= 35;
                
            }

            else if (itemNames.get(takeOut).equalsIgnoreCase("Blue switch keyboard")){
                totalCost -= 100;
            }

            
            else if (itemNames.get(takeOut).equalsIgnoreCase("Work keyboard")){
                totalCost -= 10;
     
            }

            else if (itemNames.get(takeOut).equalsIgnoreCase("Gaming laptop")){
                totalCost -= 1500;

            }

            else if (itemNames.get(takeOut).equalsIgnoreCase("Work laptop")){
                totalCost -= 700;
               
            }

            else if (itemNames.get(takeOut).equalsIgnoreCase("Minecraft")){
                totalCost -= 30;
            }

            else if (itemNames.get(takeOut).equalsIgnoreCase("Monopoly")){
                totalCost -= 20;
            }

            itemNames.remove(takeOut);
            n--;
                
            
        }

        else if(command.equalsIgnoreCase("Cart items") && itemSize > 0){
            for (int i = 0; i < n; i++){
                System.out.println(itemNames.get(i));
            }
           
        }

        else if(command.equalsIgnoreCase("Command")) {
            System.out.print("Commands: \n 1. Shop \n 2. Moneycheck \n 3. Totalcost \n 4. Cartsize \n 5. Purchase \n 6. Balance \n 7. Remove \n 8. Cart items \n 9. Command \n 10. Log off");
        }

        else if(command.equalsIgnoreCase("Log off")) {
            System.out.println("You will now log off. Thank you for shopping on our app!");
            onApp = false;
        }

        else{
            System.out.print("Invalid request. Please type one of the listed commands.");
        }
      System.out.println("");
    }
    }
}
