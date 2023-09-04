package dynamicProgrammingPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SortingArrayList {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Mango");
		
		list1.add("Apple");list1.add("Apple");
		list1.add("banana");
		list1.add("apple");
		list1.add("mango");
		list1.add("Banana");
		
		
		Collections.sort(list1);
	  for(String fruits : list1) {
		  System.out.println(fruits);
	  }
		LinkedList<String> rev = new LinkedList<String>();
		rev.add("a");
		rev.add("b");
		rev.add("c");
		rev.add("d");
		rev.add("e");
		
		Iterator reverse = rev.descendingIterator();
		while(reverse.hasNext()){
			System.out.println(reverse.next());
		}
		
		
		
		
		
		
		
		

	}

}
