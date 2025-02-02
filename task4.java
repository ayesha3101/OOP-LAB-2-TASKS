package lab2tasks;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number of numbers you want to enter");
        int no=scanner.nextInt();
        int[] arr = new int[no];
        System.out.println("enter your numbers");
        int oddSum=0;
        int evenSum=0;
        for(int i=0;i<5;i++){
            arr[i]=scanner.nextInt();
            scanner.nextLine();
            if(arr[i]%2==0){
                evenSum+=arr[i];
            }
            else{
                oddSum+=arr[i];
            }
        }
        scanner.close();
        System.out.println("the sum of even numbers is "+evenSum);
        System.out.println("the sum of odd numbers is "+oddSum);
    }

}