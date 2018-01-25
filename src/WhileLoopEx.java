import java.util.Scanner;

public class WhileLoopEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		
		while (cont.equalsIgnoreCase("y")) {
			//Your code should start here
			//
			// make sure variables have been declared
			//
			// This is where your code should end
			
			System.out.println("Do you want to continue? (y/n) ");
			cont = scan.nextLine();
			if (!cont.equalsIgnoreCase("y")) {
			System.out.println("Goodbye!");
			}
			
		}
		
		scan.close();
	}
}
