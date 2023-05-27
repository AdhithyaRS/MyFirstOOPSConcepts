package functionalInterface;



class Stack{
	private int data;
	private int size;
	private Stack prev;
	private Stack next;
	

	public Stack() {
		
	}
	public Stack(int n) {
		this.data= n;
		this.next = null;
		this.prev = null;
	}
	
	
	public void push(int n) {
		
		System.out.println("Pushed " + n + " into Stack");
		if(this.size == 0) {
			this.data = n;
			this.size++;
			
			return;
		}
		Stack create = new Stack(n);
		this.size++;
		Stack temp = new Stack();
		temp=this;
		while(temp.next!=null) {
			temp= temp.next;
		}
		create.next = null;
		create.prev = temp;
		temp.next=create;
		return;
	}
	
	public void pop() {
		if(this.size == 0) {
			System.out.println("Stack is empty!!");
			return;
		}
		this.size--;
		Stack temp = new Stack();
		temp = this;
		while(temp.next!=null) {
			temp= temp.next;
		}
		System.out.println("The element popped " + temp.data);
		if(this.size==0) {
			temp=null;
			return;
		}
		temp=temp.prev;
		temp.next = null;
		return;
		
		
	}
	
	public void display() {
		if(this.size == 0) {
			System.out.println("Stack is empty!!");
			return;
		}
		Stack temp = new Stack();
		temp = this;
		System.out.print("Displaying Stack: ");
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		return;
	}
	
	public void peek() {
		if(this.size == 0) {
			System.out.println("Stack is Empty!!");
			return;
		}
		Stack temp = new Stack();
		temp = this;
		while(temp.next != null) {
			temp = temp.next;
		}
		System.out.println("The Top Element in Stack is " + temp.data);
		return;
	}
	
	public void size() {
		System.out.println("The size of Stack is: " + this.size);
	}
	
}

public class Main {
	
	
	public static void main(String args[]) {
		Stack stack = new Stack();
		stack.push(2);
		stack.push(5);
		stack.push(10);
		stack.peek();
		stack.push(1);
		stack.push(256);
		stack.display();
		stack.push(333);
		stack.peek();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.display();
		stack.size();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.peek();
		stack.size();
		stack.push(456);
		stack.display();
		stack.size();
		stack.peek();
		
	}

}

