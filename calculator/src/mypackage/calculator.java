package mypackage;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		mathOps m1=new mathOps();
		//addidtion
		System.out.println(m1.add(5,10,4,8,6));
		
		//substraction
		System.out.println(m1.substract(num1,num2));
		
		//multiplication
		System.out.println(m1.multiply(num1,num2,10));
		
		//division
		System.out.println(m1.divi(num1, num2));

	}

}
