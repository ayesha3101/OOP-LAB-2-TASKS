package lab2tasks;
import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int overdue = 0;
        String[] bookName = new String[5];
        char choice = 'y';
        while (choice == 'y' || choice == 'Y') {
            for (int i = 0; i < 5; i++) {
                System.out.println("enter name of book " + (i + 1));
                bookName[i] = scanner.nextLine();
                if (i % 2 != 0) {
                    overdue++;
                }
            }

        System.out.println("borrowed books:");
        for (int i = 0; i < 5; i++) {
            System.out.println(bookName[i]);
        }
        System.out.println("Overdue: " + (overdue * 2));
        //assuming that odd numbered index have overdue amount
        System.out.println("do you want to continue for another user?(y/n");
        choice = scanner.nextLine().charAt(0);
    }
        scanner.close();

    }

}
