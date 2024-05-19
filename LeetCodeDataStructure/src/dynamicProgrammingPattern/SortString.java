package dynamicProgrammingPattern;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String[] str= {"yab","Banana","Apple","Donkey","Cat","zab"};

		for(int a = 0; a<str.length;a++) {
			for(int b = a+1 ;b<str.length-1;b++) {
				if(str[a].compareTo(str[b])>0) {
					String temp = str[b];
					str[b]=str[a];
					str[a]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(str));
		
		System.out.println("banana".compareTo("Apple"));
	}

}
