import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		System.out.println("Can you tell me how old you are: ");
		Scanner scan = new Scanner(System.in);
		int userAge = scan.nextInt();

		System.out.println("You are " + userAge + " years old.");

		if (userAge >= 18) {
			System.out.println("Congrats you are able to vote.  Get out there and excercise your right.");
		} else if ((userAge < 18) && (userAge >= 16)) {
			System.out.println("All right you teeny bopper.  You need to take some voter education classes.");
		} else {
			System.out.println("Sorry kid, you can't vote yet.  Do your research and be prepared when the time comes.");
		}

		scan.close();
	}

}
