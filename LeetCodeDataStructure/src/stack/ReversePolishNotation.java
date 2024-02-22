package stack;

import java.util.Stack;

public class ReversePolishNotation {
public int evalRPN(String[] tokens) {
	int result=0;
	Stack<Integer> stack = new Stack<>();
	
	for(String token :tokens) {
		if(token.equals("+")) {
			stack.add(stack.pop()+stack.pop());
		}
		else if(token.equals("-")) {
			int a = stack.pop();
			int b = stack.pop();
			stack.add(b-a);
		}
		
		else if(token.equals("*")) {
			stack.add(stack.pop()*stack.pop());
		}
		else if(token.equals("/"))
		{
			int a = stack.pop();
			int b = stack.pop();
			stack.add(b/a);
		
		}
		else {
			stack.add(Integer.parseInt(token));
		}
	}
	
	
	
	return stack.pop();
    }

}
