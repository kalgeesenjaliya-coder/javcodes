import java.util.Scanner;

public class PrStu {
    public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
  
		int totalSubject=6;
		double totalMarks=0;

		System.out.println("Enter the marks of 6 subjects");
		
	    for (int i = 1; i <= totalSubject; i++) {
            System.out.print("Subject " + i + ": ");
            double marks = sc.nextDouble();
            totalMarks += marks;
}
		
		double maxPossiblemarks = totalSubject*100;
		double percentage= (totalMarks/maxPossiblemarks)*100;

		System.out.println("\n ----RESULT----");
   		System.out.println("Marks obthained" + totalMarks + "out of 600");
		System.out.println("calculated Percentage=" + percentage);
		
	 sc.close();
    }

}