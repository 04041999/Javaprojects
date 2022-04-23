package typecasting;

public class typeCasting {

	public static void main(String[] args) {
		//implicit typecasting
		char ch='B';
		int a=ch;
		System.out.println("Implicit type conversion:");
		System.out.println("value of a "+a);
		
		float f=ch;
		System.out.println("calue of f "+f);
		
		double d=ch;
		System.out.println("calue of d "+d);
		
		long l=ch;
		System.out.println("calue of l "+l);
		
		//explicit typecasting
		double d1=4.54687;
		System.out.println("value of d1 "+ d1);
		
		int a1=(int)d1;
		System.out.println("value of a1 "+ a1);

	}

}
