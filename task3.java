package lab2tasks;
import java.sql.SQLOutput;
import java.util.Scanner;
public class task3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] items = new String[5];
        float[] price = new float[5];
        float total=0f;
        for(int i=0;i<5;i++){
            System.out.println("enter the name of item "+(i+1));
            items[i]=scanner.nextLine();
            System.out.println("enter the price of item "+(i+1));
            price[i]=scanner.nextFloat();
            scanner.nextLine();
            total+=price[i];
        }
        System.out.println("*******************************");
        System.out.println("             INVOICE           ");
        System.out.println("*******************************");

        for(int i=0;i<5;i++){
            System.out.println(items[i]+"     "    +price[i]);
        }
        System.out.println("-----------------------------");
        System.out.println("Subtotal: "+total);
        System.out.println("Discount: 10%");
        System.out.println("Discount amount: "+(0.1*total));
        System.out.println("Total before tax: "+(total-(total*0.1)));
        System.out.println("Sales tax(5%): "+(total*0.05));
        System.out.println("Invoice total: "+(total+(total*0.05)));
        scanner.close();





    }

}