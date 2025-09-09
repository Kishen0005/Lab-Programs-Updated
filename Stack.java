package Person;

public class Stack {
	  private Person arr[];
	  private int top;
	  private int capacity;

	 Stack(int size) {
		 this.top=-1;
		 this.capacity=size;
		 this.arr=new Person[this.capacity];
	}
	Stack(Person[] inputarr) {
		this.capacity=inputarr.length;
		this.arr = new Person[capacity];
		for (int i= 0;i<inputarr.length;i++) {
            this.arr[i] = inputarr[i];
        }
		this.top=inputarr.length-1;
	 }
	void push(Person p) {
		if(top==arr.length-1) {
			System.out.println("stack overflow");
		}
		else {
			arr[++top]=p;
		}
	}
	void push(Person p1,Person p2) {
		 push(p1);
	     push(p2);
	}
	Person pop() {
		if(top==-1) {
			System.out.println("stack is empty");
			return null;
		}
		else {
			return arr[top--];
		}
	}
	void pop(int n) {
		if(top==-1) {
		System.out.println("Stack is empty");
        return ;
		}
		for(int i=0;i<n;i++) {
			pop();
		}
	}
	void display() {
		if(top==-1) {
			System.out.println("stack is empty");
		}
		for(int i=top;i>=0;i--) {
			arr[i].display_person();
		}
    }
	void display(int n) {
		if(top==-1) {
			System.out.println("stack is empty");
		}
		for (int i = top; i >= top - n + 1; i--) {
            arr[i].display_person();
        }
	}
}
