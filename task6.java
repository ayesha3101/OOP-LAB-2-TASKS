package lab2tasks;
import java.sql.SQLOutput;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        String pass;
        System.out.println("***********LOGIN***********");
        System.out.println("enter your username ");
        name=scanner.nextLine();
        System.out.println("enter your password ");
        pass=scanner.nextLine();
        // assuming whatever the user enters is correct
        System.out.println("***************************");
        System.out.println("Login Successful!Welcome "+name);
        System.out.println("***************************");
        System.out.println("Welcome to State Bank of Pakistan");
        int choice=0;
        char option='y';
        int amount=29000;
        while(option=='y'|| option=='Y'){
            System.out.println("1.Deposit money\n2.Withdraw amount\n3.Account status");
            System.out.println("enter your choice");
            choice=scanner.nextInt();
            if(choice==1){
                System.out.println("enter the amount: ");
                int deposit = scanner.nextInt();
                System.out.println("amount deposited succesfully. New balance: "+(amount+deposit));
            }
            else if(choice==2){
                System.out.println("enter the amount: ");
                int withdraw= scanner.nextInt();
                if (withdraw>amount) {
                    System.out.println("amount withdrawn successfully. New balance: "+(amount-withdraw));
                }
                else{
                    System.out.println("Sorry you dont have enough balance");
                }

            }
            else if(choice==3){
                System.out.println("Account status. Balance "+amount);
            }
            else{
                System.out.println("you have entered an invalid option");
            }
            System.out.println("do you want to continue?(Y/N");
            option=scanner.next().charAt(0);


        }


    }

}
