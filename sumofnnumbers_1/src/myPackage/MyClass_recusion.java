package myPackage;

import java.util.Scanner;

public class MyClass_recusion{

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		// usinf formula
		//System.out.println((n*(n+1))/2);
		
		
		/*int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);*/
		
		
		System.out.println(func(n));
		
		
		
		scn.close();

	}
	
	public static int func(int num) {
		if(num!=0)
			return num+func(num-1);
		else 
			return num;
	}

}
