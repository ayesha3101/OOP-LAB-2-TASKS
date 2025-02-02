package lab2tasks;
import java.util.Scanner;
public class task8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] items=  new String[5];
        float[] price = new float[5];
        char option='y';
        float total=0f;
        float discount=0f;
        while(option=='y'){
            for(int i=0;i<5;i++){
                System.out.println("enter the item number "+(i+1));
                items[i]=scanner.nextLine();
                System.out.println("enter the price for item number "+(i+1));
                price[i]=scanner.nextFloat();
                scanner.nextLine();
                total+=price[i];

            }
            System.out.println("total price: "+total);
            if(total>=500){
                System.out.println("Discount percent: 10 ");
                discount=10;
            }
            else if(total<500){
                System.out.println("Discount percent: 5  ");
                discount=5;
            }
            System.out.println("total discount: "+(total*(discount/100)));
            System.out.println("price after discount: "+(total-(discount/100)));
            System.out.println("Do you want to enter another reciept?(y/n");
            option=scanner.nextLine().charAt(0);


        }
        scanner.close();
    }

}
