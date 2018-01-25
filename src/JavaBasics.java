public class JavaBasics {

public static void main(String[] args) {

final String TEST = "Hello";
	//TEST = "NO"; we cannot do this - the constant cannot be reassigned

final int TESTINT = 4;

//primitive type declarations

byte a = 127;
//byte b = 129; // outside of the primitive type range
short s = 32767;
//short t = 32768; // outside of primitive type range
int i = 1333333333;
float fl = (float)6.7; //need to cast as a float, because IDE may believe it is a double
float fl2 = 6.7f; // f after the number also cast as float
char c = 'x';
boolean bool = true;
Boolean boole = false;
long l = 99999999999999L; // long need to be cast as a long, because IDE may believe it is an int

//implicit conversion examples
int numOfItems = 5;
System.out.println(3.0/1.5);
System.out.println(3.0/2.0);
System.out.println((numOfItems + 10)/ 2);
System.out.println((numOfItems + 10)/ 2.0);


// explicit conversion examples
System.out.println(((double)numOfItems + 10)/ 2);
System.out.println((double)((numOfItems + 10)/ 2));

double x = (double) (3/5);
x = (double) 3 / (double) 5;
System.out.println(x);

// example 2 -- common error forgetting to cast
int kidsInFam1 = 3;
int kidsInFam2 = 4;
int numOfFams = 2;

//double avgKidsPerFam = (kidsInFam1 + kidsInFam2)/numOfFams; incorrect because right hand of the assignment doesn't explicitly cast it as a double
double avgKidsPerFam = (double)(kidsInFam1 + kidsInFam2)/numOfFams;

System.out.println(avgKidsPerFam);


}

}
