import java.util.Scanner;

class StringNotValidException extends Exception {

    StringNotValidException(String message) {
        super(message);
    }
}

public class Lab5_3 {

    static void checkString(String str) throws StringNotValidException {

        boolean hasVowel = false;

        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                hasVowel = true;
                break;
            }
        }

        if (!hasVowel) {
            throw new StringNotValidException(
                "String does not contain any vowel."
            );
        }

        System.out.println("String is valid.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        try {
            checkString(str);
        }
        catch (StringNotValidException e) {
            System.out.println(
                "StringNotValidException: " + e.getMessage()
            );
        }

        sc.close();
    }
}