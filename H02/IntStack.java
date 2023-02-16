
public class IntStack {
	// May create private data here.
	private Node head = new Node(0, null);
	private int storeHead = 0;
	//private int userInput = 0;
	public IntStack() {
		// TODO: Code to initialize your stack.
		 //IntStack molecularData = new IntStack();
	}

	public void push(int x) {
		// TODO: Code to push an item x onto the stack. The stack wlil never contain more than 100 elements.
		head = new Node(x, head);
	}

	public int pop() {
		// TODO: Code to pop and return an item from the top of the stack. If the stack is empty, return -1.
		storeHead = head.val;
		head = head.nextNode;
		if(head == null){
			//System.out.println("Stack is empty");
			return -1;
		}
		else{
			return storeHead;
		}
	}
}
