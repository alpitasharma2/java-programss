package ifElsePrograms;
import java.util.Scanner;

public class posOrNeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("number is positive");
		}
		else if(num<0) {
			System.out.println("number is negative");
		}
		else if(num==0) {
			System.out.println("number is zero");
		}
	}
}
