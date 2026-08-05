import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String[] words = str.split("\\s+");

        int capitalCount = 0;
        int smallCount = 0;

        for (String word : words) {
            if (word.length() > 0) {
                char ch = word.charAt(0);

                if (Character.isUpperCase(ch)) {
                    capitalCount++;
                } else if (Character.isLowerCase(ch)) {
                    smallCount++;
                }
            }
        }

        System.out.println("Words starting with Capital Letters: " + capitalCount);
        System.out.println("Words starting with Small Letters: " + smallCount);

        sc.close();
    }
}