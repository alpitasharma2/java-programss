package ifElsePrograms;
import java.util.Scanner;

public class countNumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<10 && num>=1) {
			System.out.println("one digit number");
		}
		else if(num<100 && num >=10) {
			System.out.println("2 digit number");
		}
		else if(num<1000 && num>=100) {
			System.out.println("3 digit number");
		}
		else if(num<10000 && num>=1000) {
			System.out.println("4 digit number");
		}
		else if(num <100000 && num>=10000) {
			  System.out.println("Its a five digit number");			
			}
			else {
			  System.out.println("number is not between 1 & 99999");			
			}
	}
}
