package Programs;

import java.util.Scanner;

public class NumberTo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n= sc.nextInt();
		
//		while(n>=0)
//		{
//			System.out.println(n);
//			n--;
//		}
//		System.out.println("ThankYou");
		
//		for(int i=n;i>0;i--)
//		{
//			System.out.println(i);
//		}
		int i=n;
		do {
			System.out.println(i);
			i--;
		}while(i>0);
	}

}
