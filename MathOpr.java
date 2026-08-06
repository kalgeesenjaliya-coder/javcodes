import java.util.Scanner; 

public class MathOpr { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter the first number: "); 
        double num1 = sc.nextDouble(); 
        
        System.out.print("Enter the second number: "); 
        double num2 = sc.nextDouble(); 
        
        double sum = num1 + num2; 
        double difference = num1 - num2; 
        double product = num1 * num2; 
        
        
        double division = 0; 
        
        if (num2 != 0) { 
            division = num1 / num2; 
        } else { 
            System.out.println("Zero division error"); 
        } 
        
        System.out.println("Sum = " + sum); 
        System.out.println("Difference = " + difference); 
        System.out.println("Product = " + product); 
        
                if (num2 != 0) {
            System.out.println("Division = " + division); 
        }
        
        sc.close(); 
    } 
}
