package lab2tasks;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args){
        Scanner scanner=  new Scanner(System.in);
        System.out.println("enter the number of student whose grades you want to process");
        int num=scanner.nextInt();
        float[] marks = new float[num];
        float avg=0f;
        int numPass=0;
        int numFail=0;
        for(int i=0;i<num;i++){
            System.out.println("enter the marks of student "+(i+1));
            marks[i]=scanner.nextInt();
            scanner.nextLine();
            avg+=marks[i];
            if(marks[i]>=60 && marks[i]<=100){
                numPass++;
            }
            else if(marks[i]<60 && marks[i]>=0){
                numFail++;
            }
        }
        scanner.close();
        System.out.println("**********STUDENT REPORT************");
        System.out.println("Average marks:      "+(avg/num));
        System.out.println("Student who passed: "+numPass);
        System.out.println("Student who failed: "+numFail);
        System.out.println("************************************");
    }
}
