package OOPAssignment;

import java.io.*;

public class Main {
    

    public static void main(String[] args) throws IOException {

        String firstName;
        String lastName;
        String street;
        String city;
        String province;
        String country;
        Double moneyAmount;

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

        

    }
}
