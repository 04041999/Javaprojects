package learningCollections;

import java.util.ArrayList;
import java.util.Collections;

public class collections_30_04_22 {

	public static void main(String[] args) {
		/*
		ArrayList<String> cars=new ArrayList<String>();
		
		//methods present in Arraylist class
		// method to add elemnts into  arraylist
		cars.add("Benz");
		cars.add("Rolls Royce");
		cars.add("Bugatti");
		
		//method to fetch an item in the list
		System.out.println(cars.get(0));
		System.out.println(cars.get(2));
		
		//method to change an item
		cars.set(0, null);
		cars.set(0, "Audi");
		System.out.println(cars.get(0));
		
		//to remove an item
		cars.remove(0);
		System.out.println(cars.get(0));
		
		//to clear entire list
		//cars.clear();
		//System.out.println(cars.get(0));
		
		cars.add("Pagani");
		
		//to get the size of a list
		System.out.println(cars.size());
		
		System.out.println();
		//looping through an list
		for(int i=0; i<cars.size();i++) {
		
			System.out.println(cars.get(i));
		}
		System.out.println();
		for(String i:cars) {
			System.out.println(i);
		}
		
		System.out.println();
		//Sorting an list
		Collections.sort(cars);
		for(String i:cars) {
			System.out.println(i);
		}
		
		Collections.reverse(cars);
		System.out.println();
		for(String i:cars) {
			System.out.println(i);
		}
		
		//Seraching for an element
		if(cars.contains("Pagani"))
			System.out.println("found the element");
		else
			System.out.println("Not found the element");*/
		
		//Copying list2 to list1
		ArrayList<Integer> list1= new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		ArrayList<Integer> list2= new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(7);
		//list2.add(9);
		//Collections.copy(list1,list2);
		//System.out.println("List1 "+list1);
		//System.out.println("List2 "+list2);
		
		//Shuffling the list
		Collections.shuffle(list1);
		System.out.println("List1 "+ list1);
		
		//Comparing two lists
		ArrayList<String> res=new ArrayList<String>();
		for(Integer i:list1) {
			res.add(list2.contains(i)? "yes":"no");
		}
		
		//System.out.println(res);
		
		//swaping two elements
		System.out.println(list1);
		Collections.swap(list1, 0, 2);
		System.out.println(list1);
		
		//cloning a list
		ArrayList<Integer> n= (ArrayList<Integer>)list1.clone();
		System.out.println(n);
		
		//emptying the list
		list2.removeAll(list2);
		System.out.println(list2);
		
		//to check if list is empty
		System.out.println(list1.isEmpty());
		System.out.println(list2.isEmpty());
		
		list1.add(null);
		System.out.println(list1.size());
		list1.trimToSize();
		System.out.println(list1.size());
		
		
		

	}

}
