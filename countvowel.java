import java.util.Scanner; 

public class countvowel { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        
                System.out.print("Enter a sentence: "); 
        String name = scanner.nextLine(); 
        int length = name.length(); 
        
        int countvowel = 0; 
        int countspace = 0; 
        int countconsonent = 0; 
        
        for (int i = 0; i < length; i++) { 
            char ch = name.charAt(i); 
            
                        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || 
                		ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
                countvowel++; 
            } 
            
            else if (ch == ' ') { 
                countspace++; 
            } 
          
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) { 
                countconsonent++; 
            } 
        } 
        System.out.println("\nVowels: " + countvowel); 
        System.out.println("Consonants: " + countconsonent); 
        System.out.println("Spaces: " + countspace); 
    } 
}
