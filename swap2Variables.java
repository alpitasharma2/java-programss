package onlineprograms;
import java.util.Scanner;

public class swap2Variables {
	public static void main(String args[])
	{
		int temp;
		Scanner sc=new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println(a + " " + b);
		
		
	}

}
