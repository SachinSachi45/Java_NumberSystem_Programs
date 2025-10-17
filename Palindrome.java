package Programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		boolean res= isPalindrome(n);{
			if(res==true)
			System.out.println(n+" is a palindrome number");
			else
			System.out.println(n+" is not a palindrome number");	
		}
	}
	
	static boolean isPalindrome(int x)
	{
		int rev=0,t=x;
		do {
			int d=x%10;
			rev=rev*10+d;
			x/=10;
		}while(x!=0);
		return rev==t;
	}
}
