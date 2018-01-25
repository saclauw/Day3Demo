import java.util.Scanner;

public class CodingChallengeDay3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				

		for(int i = 1; i <= 100; i++) {
		
		 if (i % 15 == 0 ) {
			System.out.println(i + " Fizz Buzz");
		}
		else if (i % 5 == 0) {
			System.out.println(i + " Buzz");
		}
		else if (i % 3 == 0) {
			System.out.println(i + " Fizz");
			
		}  else System.out.println(i);
		
		} 
	}
}
	
	
	
	

