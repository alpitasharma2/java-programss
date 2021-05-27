package onlineprograms;
import java.util.Scanner;

public class add1toeachdigit {
	public static void main(String args[])
	{
		int i=1,p=0,s=0,n;
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		while(num>0)
		{
			p=num%10;
			if(p!=9) {
				s = s+(p+1)*i;
				num=num/10;
				i=i*10;
			}
		}
		System.out.println(s);
		
		
	}

}
