package lab2tasks;
import java.util.Scanner;
public class task9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float[] marks = new float[5];
        float total=0;
        char choice='y';
        float percentage=0;
        while(choice=='y' || choice=='Y') {

            for (int i = 0; i < 5; i++) {
                System.out.println("Enter marks of subject " + (i + 1));
                marks[i] = scanner.nextFloat();
                scanner.nextLine();
                total += marks[i];

            }
            System.out.println("total marks: "+total);
            percentage = (total*100)/500;
            System.out.println("Percentage: "+percentage);
            if(percentage>=90 && percentage<=100) {
                System.out.println("Grade: A+");
            }
            else if(percentage>=80 && percentage<=90) {
                System.out.println("Grade: A");
            }
            else if(percentage>=70 && percentage<=80) {
                System.out.println("Grade: B");
            }
            else if(percentage>=60 && percentage<=70) {
                System.out.println("Grade: c");
            }
            else if(percentage>=50 && percentage<=60) {
                System.out.println("Grade: D");
            }
            else if(percentage>=50 && percentage<=60) {
                System.out.println("Grade: E");
            }
            else if(percentage<50) {
                System.out.println("Grade: F");
            }
            System.out.println("Do you want to continue?(Y/N");
            choice=scanner.nextLine().charAt(0);

        }
        scanner.close();
    }

}
