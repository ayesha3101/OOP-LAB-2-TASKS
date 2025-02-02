package lab2tasks;
import java.util.Scanner;
public class task10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of employees to evaluate");
        int size=scanner.nextInt();
        int[] employeeNum= new int[size];
        float[] monthlySales = new float[size];
        float[] attendPercent= new float[size];
        for(int i=0;i<size;i++){
            System.out.println("Employee # "+(i+1)+": ");
            System.out.print("Monthly sales: ");
            monthlySales[i]=scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Attendance percentage: ");
            attendPercent[i]=scanner.nextFloat();
            scanner.nextLine();
        }
        scanner.close();
        for(int i=0;i<size;i++){
            System.out.println("Employee # "+(i+1)+": ");
            System.out.println("Monthly sales: "+monthlySales[i]);
            System.out.println("Attendance percentage: "+attendPercent[i]);
            if(monthlySales[i]<5000){

                System.out.println("Result: Needs Improvement");
            }
            else if(monthlySales[i]>5000 && monthlySales[i]<=10000){
                if(attendPercent[i]>80){
                    System.out.println("Result: Satisfactory");
                }
                else if (attendPercent[i]<=80){
                    System.out.println("Result: Needs Improvement");
                }

            }
            else if(monthlySales[i]>10000){
                if(attendPercent[i]>90){
                    System.out.println("Result: Outstanding");
                }
                else if(attendPercent[i]>=75 && attendPercent[i]<=90){
                    System.out.println("Result: Satisfactory");
                }
                else if(attendPercent[i]<75){
                    System.out.println("Result: Needs Improvement");
                }

            }
        }

    }

}
