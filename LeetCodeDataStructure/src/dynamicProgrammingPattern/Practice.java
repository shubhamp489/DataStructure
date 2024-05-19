package dynamicProgrammingPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {
	
	
	public  List<List<Integer>> PascalsTrainge(int numRows) {
		
		List<List<Integer>> result = new ArrayList<>();
		if(numRows== 0) return result;
		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);
		result.add(firstRow);
		if(numRows==1) return result;
		
		for(int i =1 ;i<numRows ;i++) {
			List<Integer> prevRow = result.get(i-1);
		
		ArrayList<Integer> row = new ArrayList<>();
		row.add(1);
		for(int j=0;j<i-1;j++) {
			row.add(prevRow.get(j)+prevRow.get(j+1));
		}
		row.add(1);
		result.add(row);
		}
		return result;
	}
	
	
	public static void main(String args[]) {
		
		Practice p = new Practice();
		System.out.println(p.PascalsTrainge(5));
		
		
		
		/*
	 * float num =-10.0f;
		float num2=10.1f;
		System.out.println(
		"Ceil----"+Math.ceil(num2)+"--------"+"Florr"+
		Math.floor(num)+"---------  exp"+
		Math.exp(num)+"------ max"+
		Math.max(num, num2)+"------    pow"+
		Math.pow(num,3)+"---------- random"+
		Math.random()+"-------- sqrt"+
		Math.sqrt(num2)+"--------  abs"+Math.abs(num)
);
				
	
		*/	
			
			}
}