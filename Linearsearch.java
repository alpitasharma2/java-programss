package onlineprograms;
import java.util.Scanner;

public class Linearsearch {
	public static int linearSearch(int [] arr,int key)
	{
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
			
		}
		return -1;
		
	}
	
	public static void main(String a[]) {
		
		Scanner sc=new Scanner(System.in);
		
		int []a1=new int[5];
		int key=sc.nextInt();
		
		System.out.println(linearSearch(a1,key));
	}
	

}
