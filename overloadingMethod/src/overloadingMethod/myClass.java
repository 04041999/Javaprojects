package overloadingMethod;

public class myClass {

	public static void main(String[] args) {
		overloadMethod m1=new overloadMethod();
		System.out.println("area of circleis: "+m1.area(10));
		System.out.println("area of the rectangle is: "+m1.area(10, 20));

	}

}
