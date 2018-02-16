import java.util.*;
// Demo of MySatck1
public class MyStack1Demo{

	public static void main(String[] args) {
		MyStack1 mystack = new MyStack1();
		mystack.push(4);
		mystack.push(2);
		mystack.push(5);
		mystack.push(2);
		mystack.push(1);
		int min = mystack.pop(); 
		System.out.println("stack " + min);
		
	}
}
