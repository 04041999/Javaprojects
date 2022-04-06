package mypackage;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50;
		boolean[] bool=new boolean[n+1];
		//initializing bool array
		for(int i=0;i<=n;i++) {
			bool[i]=true;
		}
		int count=0;
		
		for(int i=2;i*i<=n;i++) {
			
			if(bool[i]!=false) {
				for(int j=i*i;j<=n;j+=i) {
					bool[j]=false;
				}
			}
			count++;
		}
		
		for(int i=0;i<=n;i++) {
			if(bool[i]!=false)
				System.out.print(i+" ");
			
			
		}
		System.out.println(count);

	}

}
