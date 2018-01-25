import java.util.Scanner;

public class SwitchEx {
	
public static void main(String[] args) {

	 int caseSwitch = 3;
	 switch (caseSwitch) {
	  case 1:
	  case 3: // Layered
	    System.out.println("Case 1");
	    break;
	  case 2:
	  case 5: // Layered
	    System.out.println("Case 2");
	    break;
	  default:
	    System.out.println("Default case");
	    break;
	}
	
	 // the following is an example of a switch case statement that checks for a range
	 
	 Scanner scan = new Scanner (System.in);
	 System.out.println("Hey teach, can you please enter a grade: ");
	 double grade = scan.nextDouble();

	 switch ((int)grade / 10) {
	 case 1:
		 System.out.println("10 - 19");
		 break;
	 case 2:
		 System.out.println("20 - 29");
		 break;
	 case 3:
		 System.out.println("30 - 39");
		 break;
	 case 4:
		 System.out.println("40 - 49");
		 break;
	 case 5:
		 System.out.println("50 - 59");
		 break;
	 case 6:
		 System.out.println("60 - 69");
		 break;
	default:
	 }
	 System.out.println("Goodbye");
	 
	 
	 
	 
}

}
