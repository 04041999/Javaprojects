package collections;

import java.util.*;



public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> i1=new ArrayList<Integer>();
		i1.add(20);
		i1.add(21);
		i1.add(23);
		i1.add(12);
		/*
		 for(Integer i:i1) {
			 System.out.println(i);
		 }
		 Object[] ir=i1.toArray();
		 
		 int[] iarr=new int[i1.size()];
		 for(int i=0;i<i1.size();i++) {
			 iarr[i]=(int) ir[i];
		 }
		
		 for(int i:iarr) {
			 System.out.println(i);
		 }
		 */
		 
		 Iterator<Integer> iter = i1.iterator();
		 
		 while(iter.hasNext()) {
			 System.out.println(iter.next());
		 }
		 	

	}

}
