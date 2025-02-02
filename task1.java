package lab2tasks;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner( System.in);
        int size;
        System.out.println("enter the number of elements in the array");
        size= scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter element "+(i+1));
            arr[i]=scanner.nextInt();
        }
        int max= arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("the max element is "+max);
        scanner.close();


    }