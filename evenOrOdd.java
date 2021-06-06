package ifElsePrograms;
import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int num = sc.nextInt();
	if(num%2==0) {
		System.out.println("number is even");
	}
	else if(num%2!=0) {
		System.out.println("number id Odd");
	}
	}
}
