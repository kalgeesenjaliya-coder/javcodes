import java.util.Scanner;

public class NamePyramid {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        
        int length = name.length();
               for (int i = 0; i < length; i++) {
            
          
            for (int j = 0; j < length - i - 1; j++) {
                System.out.print(" ");
            }
            
                       for (int k = 0; k <= i; k++) {
                System.out.print(name.charAt(k) + " ");
            }
            
                       System.out.println();
        }
        
        scaner.close();
    }
}
