import java.util.*;

public class MyStack1{
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	
	public MyStack1() {
		this.stackData = new Stack<Integer>();
		this.stackMin = new Stack<Integer>();
	}

	public void push(int newNum){
		this.stackData.push(newNum);
		if(this.stackMin.isEmpty()){
			this.stackMin.push(newNum);
		}else if(newNum < this.getMin()){
			this.stackMin.push(newNum);
		}else{
			int newMin = this.stackMin.peek();
			this.stackMin.push(newMin);
		}
	}

	public int pop(){
		if (this.stackMin.isEmpty()) {
			throw new RuntimeException("Your stackMin is empty.");
		}
		this.stackMin.pop();
		return this.stackData.pop();
	}

	public int getMin(){
		if (this.stackMin.isEmpty()) {
			throw new RuntimeException("Your stackMin is empty.");
		}
		return this.stackMin.peek();
	}
}

