import java.util.*;

public class twoStacksToQueueDemo{
	public static void main (String[] args){
		twoStacksToQueue myQueue = new twoStacksToQueue();
		myQueue.add(1);
		myQueue.add(2);
		myQueue.add(3);
		myQueue.add(4);
		myQueue.add(5);
		System.out.println("Add 1,2,3,4,5 to queue.");
		System.out.println("1. Peek is " + myQueue.peek());
		System.out.println("2. Poll: " + myQueue.poll());
		System.out.println("3. Poll: " + myQueue.poll());
		
		myQueue.add(6);
		myQueue.add(7);
		myQueue.add(8);
		myQueue.add(9);
		myQueue.add(10);
		System.out.println("Add 6,7,8,9,10 to queue.");
		System.out.println("4. Peek is " + myQueue.peek());
		System.out.println("5. Poll: " + myQueue.poll());
		System.out.println("6. Poll: " + myQueue.poll());
		System.out.println("7. Poll: " + myQueue.poll());
		System.out.println("8. Poll: " + myQueue.poll());
		System.out.println("9. Poll: " + myQueue.poll());
		System.out.println("10. Poll: " + myQueue.poll());
		System.out.println("11. Poll: " + myQueue.poll());
		System.out.println("12. Poll: " + myQueue.poll());
		//System.out.println("13. Poll: " + myQueue.poll()); // Queue is empty

	}
}