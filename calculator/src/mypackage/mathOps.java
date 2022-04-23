package mypackage;

public class mathOps {
	public int add(int...a) {
		int sum=0;
		for(int i:a) {
			sum=sum+i;
		}
		return sum;
	}
	
	public int substract(int a, int b) {
		return a-b;
	}
	
	public int multiply(int...a) {
		int res=1;
		for(int i:a) {
			res=res*i;
		}
		return res;
	}
	
	public double divi(int a, int b) {
		return a/b;
	}

}
