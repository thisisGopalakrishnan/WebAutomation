package gopal.org;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import io.cucumber.java.en.When;

public class JavaBasics {

	public void list() {
		ArrayList<String> f1 = new ArrayList<String>();
		LinkedList<Integer> num = new LinkedList<Integer>();
		ArrayList<String> f2 = new ArrayList<String>();
		HashSet<String> original = new HashSet<String>();
		
		
//		Animal.add("First Animal");
//		Animal.add("Second Animal");
//		Animal.add("Third Animal");
//		Animal.add("First Animal");
//		System.out.println("Animal list "+"  "+Animal);
//		
		

//LinkedList using integer
		num.add(27);
		num.add(20);
		num.add(78);
		num.add(27);
//
		System.out.println("Sysout num" + num);

		Iterator<Integer> iterator1 = num.listIterator(num.size());

//while (iterator1.hasPrevious()) {
//    // Get the previous element
//    Integer value = iterator1.previous();
//    System.out.println("Reverse Order: " + value);
//}

		while (((ListIterator<Integer>) iterator1).hasPrevious()) {
			Integer value = ((ListIterator<Integer>) iterator1).previous();
			System.out.println("Reverse Order" + value);
		}

//sorting
		Collections.sort(num);
		for (Integer integer : num) {
			System.out.println("Sorting" + integer);
		}

//ArrayList using String
		f1.add("carrot");
		f1.add("Banana");
		f1.add("Apple");
//		f1.add(2, "indexbased");
//		f2.add("Added new String ");
		f2.add("Banana");
		f1.addAll(f2);
		
	for(String AB : f1)	{
		
if(!original.add(AB)) { // only print duplicates
	System.out.println("Duplicate Animal is right" +"  "+original);
//	System.out.println("Duplicate F1is right"+"  "+f1);
};
	}
	Collections.sort(f1);
	System.out.println("After sorting " +" " + f1);
		
//Reverse using For loop
		for (int i = f1.size() - 1; i > 0; i--) {
			System.out.println("Reverse using for loop: " + f1.get(i));
		}

//Reverse Using collection
		Collections.reverse(f1);
		for (String string : f1) {
			System.out.println("reverse string useing collection" + "   " + string);
		}

//for using iterator
		for (String string : f1) {
			System.out.println("for using iterate over" + string);
		}
//for using iterator i initiallisaton and condition
		for (int i = 0; i < f1.size(); i++) {
			System.out.println("for using iterator i initiallisaton and condition" + "   " + f1);
		}
		Iterator<String> iterator = f1.iterator();
//While loop
		while (iterator.hasNext()) {
			System.out.println("iterort:" + iterator.next());
		}
		System.out.println("Index Based" + f1.get(3));
		System.out.println("print list of fruits:" + f1);
	}

	public static void main(String[] args) {
		JavaBasics obj = new JavaBasics();
		obj.list();

	}
}
