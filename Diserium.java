package Programs;

import java.util.Scanner;

public class Diserium {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		boolean rs = isDiserium(n);
		{
			if(rs==true)
				System.out.println(n+" is diserium number");
			else
				System.out.println(n+" is not a diserium number");
		}
	}
	
	static boolean isDiserium(int x)
	{
		int ct=countDigits(x);
		int sum=0,t=x;
		do {
			int d=x%10;
			sum=sum+getPower(d,ct);
			ct--;
			x=x/10;
		}while(x!=0);
		return sum==t;
	}
	
	static int countDigits(int n)
	{
		int count=0;
		do {
			count++;
			n/=10;	
		}while(n!=0);
			return count;
	}
	
	static int getPower(int n,int p)
	{
		int prod=1;
		while(p>0)
		{
			prod=prod*n;
			p--;
		}
		return prod;
	}

}
