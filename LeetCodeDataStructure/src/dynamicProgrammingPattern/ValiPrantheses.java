package dynamicProgrammingPattern;

import java.util.Stack;

public class ValiPrantheses {
	
	
public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
   for(char ch:s.toCharArray()) {
	  switch(ch) {
	  case '(':
	  case '{':
	  case '[':
		  stack.push(ch);
		  break;
	  case ')':
		  
		  
		  if(stack.isEmpty() || stack.pop() !='(') {
			  return false;
		  }
		  break;
		  
	  case '}':
		  if(stack.isEmpty() || stack.pop() !='{') {
			  return false;
		  }
		  break;
		  
	  case ']':
          if(stack.isEmpty() || stack.pop() != '[')
          {
              return false;
          }
          break; 
		  
	  
	  }
		   
   }
	
	
	
	return stack.isEmpty();
    }

	public static void main(String[] args) {
		String s= "()[]{}";
		ValiPrantheses vs = new ValiPrantheses();
		System.out.println(vs.isValid(s));
	}

}
