import java.util.Scanner;

public class Lab5_2 {

    static void checkNumber(int number) {

        if (number % 2 != 0) {
            throw new NumberFormatException("Number is odd.");
        }

        System.out.println("Number is even.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        try {
            checkNumber(number);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        sc.close();
    }
}
