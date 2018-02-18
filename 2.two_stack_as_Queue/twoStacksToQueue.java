import java.util.*;
/**
Using two stack to implement a Queue with function add(), poll(), peek().
Queue is First In First Out. Stack is First In, Last Out.
stackPush, stackPop.
Rule 1: if push data of stackPush to stackPop, must push all data in stackPush to stackPop at one time.
Rule 2: if stackPop is not empty, stackPush must not push any data to stackPop!
*/

public class twoStacksToQueue{
	public Stack<Integer> stackPush;
	public Stack<Integer> stackPop;
	
	public twoStacksToQueue(){
		stackPush = new Stack<Integer>();
		stackPop = new Stack<Integer>();

	}

	public void add(int pushInt){
		stackPush.push(pushInt);
	}

	// Delete the top num in queue, and return it.
	public int poll(){
		if (stackPush.isEmpty() && stackPop.isEmpty()){
			throw new RuntimeException("Your queue is empty.");
		}else if(stackPop.isEmpty()){
			// Push all data in stackPush to stackPop
			while (!stackPush.isEmpty()){
				stackPop.push(stackPush.pop());
			}
		} 
		// Else do nothing: cause queue is FIFO, so we can pop data in stackPop util it is empty, 
		// then deal with the rest of data in stack push
		return stackPop.pop();
	}

	// Return the top num in queue
	public int peek(){
		if (stackPop.isEmpty() && stackPush.isEmpty()){
			throw new RuntimeException("Your queue is empty.");
		}else if(stackPop.isEmpty()){
			while (!stackPush.isEmpty()){
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.peek();
	}
}


