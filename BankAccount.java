import java.util.*;

public class BankAccount{

    public static void main(String[] args){
        Account a1 = new Account("Joe087", 100.0d);


        System.out.println("Welcome to Fab Bank");
        System.out.print("Please select an option: \n 1. Check Balance: \n 2. Withdraw Cash: \n 3. Lodge Cash: \n");

        Scanner menuOption = new Scanner(System.in);
        System.out.println(":");
        String userInput = menuOption.nextLine();

        switch(userInput){1
            case "1":
                System.out.println("Balance: ");
                System.out.println(a1.getBalance());
                break;
            case "2":
                System.out.println("Select Amount to withdraw: ");                
                break;
            case "3":
                System.out.println("Select Amount to lodge:  ");
                break;

        }




    }

}