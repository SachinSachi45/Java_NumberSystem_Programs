package Programs;

import java.util.Scanner;

public class IsArmStringUd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");//153
		int n = sc.nextInt();
		boolean rs=ArmString(n);
				if(rs==true)
				System.out.println(n+" is a armString");
				else
					System.out.println(n+" is not a armString");
	}
	
	static boolean ArmString(int x)
	{
	int ct = countDigits(x);//3
	int sum=0,t=x;
	do {
	int d=x%10;
	sum = sum+getPower(d,ct);//3,3
	x=x/10;
	}while(x!=0);
	return sum==t;
	}
	
	static int countDigits(int n)
	{
		int count=0;
		do {
			count++;
		   n=n/10;
		}while(n!=0);
		return count;
	}
	
	static int getPower(int n,int p)//3,3
	{
		int prod=1;
		while(p!=0)
		{
			prod=prod*n;//1*3=3,3*3=9,9*3=27
			p--;
		}
		return prod;
	}
}
