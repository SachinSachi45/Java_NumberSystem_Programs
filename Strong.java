package Programs;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		boolean res= isStrong(n);{
			if(res==true)
			System.out.println(n+" is a Strong number");
			else
			System.out.println(n+" is not a Strong number");	
		}
	}
		
		static boolean isStrong(int x)//145
		{
			int sum=0,t=x;
			do {
				int d=x%10;
				sum=sum+fact(d);
				x=x/10;
			}while(x!=0);
				return sum==t;
		}
				
				static int fact(int n) //n=5:120,n=4:24,n=1:1=120+45+1=145
				{
					int fact=1;
					while(n>0)
					{
						fact=fact*n;
						n--;
					}
					return fact;
		
	}
	
}
