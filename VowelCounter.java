import java.util.Scanner;

class VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a sentence (Type 'quit' to exit): ");
            String sentence = sc.nextLine();

            if (sentence.equalsIgnoreCase("quit")) {
                System.out.println("Program terminated.");
                break;
            }

            int capitalVowels = 0;
            int smallVowels = 0;

            for (int i = 0; i < sentence.length(); i++) {
                char ch = sentence.charAt(i);

                switch (ch) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        capitalVowels++;
                        break;

                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        smallVowels++;
                        break;
                }
            }

            System.out.println("Capital Vowels = " + capitalVowels);
            System.out.println("Small Vowels   = " + smallVowels);
            System.out.println();
        }

        sc.close();
    }
}