public class CVCount {
    public static void main(String[] args) {


        String sentence = "Learn coding in Java";
        
   
        int vowelsCount = 0;
        int consonantsCount = 0;
        
        
        String lowerSentence = sentence.toLowerCase();
        
                for (int i = 0; i < lowerSentence.length(); i++) {
            char ch = lowerSentence.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            } 
                else if (ch >= 'a' && ch <= 'z') {
                consonantsCount++;
            }
        }
        
        
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Total Vowels: " + vowelsCount);
        System.out.println("Total Consonants: " + consonantsCount);
    }
}
