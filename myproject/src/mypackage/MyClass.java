package mypackage;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		if(n%2==0)
			System.out.println("Even number");
		else 
			System.out.println("Odd number");
		
		scn.close();

	}

}
