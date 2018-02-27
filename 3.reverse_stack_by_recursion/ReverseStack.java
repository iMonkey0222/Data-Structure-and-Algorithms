
import java.util.*;

public class ReverseStack{
	
	public static int getAndRemoveLastElement(Stack<Integer> stack){
		int result = stack.pop();
		if(stack.isEmpty()){
			System.out.println("Stack is empty. Result:" + result);
			return result;
		}else{
			int last = getAndRemoveLastElement(stack);
			System.out.println("Last:" + last);
			stack.push(result);
			System.out.println("Stack peek:" + stack.peek());
			return last;
		}
	}

	public static void reverse(Stack<Integer> stack){
		if (stack.isEmpty()){
			return;
		}
		int i = getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
	}

	public static void main (String[] args){
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		int lastElementInStack = getAndRemoveLastElement(stack);
		System.out.println("The last element need to remove:" +lastElementInStack );
	}
}
