import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year to check leap year: ");
        int year = sc.nextInt();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("your given year is a leap year");
        } else {
            System.out.print("Your given year is not leap year");
        }
    }
}
