
public class InifiniteWhileLoop {

	public static void main(String[] args) {
		
	// this code will continue endlessly unless I add a stop condition
		
		while (true) {
			int randomNum = (int)(Math.random()*11); // this will generate a number from 0-10
			System.out.println(randomNum);
			
			if (randomNum == 10) {
				System.out.println("7 has been found -- exit loop");
				break;
			}
		}
		
	}
	
}
