
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack stack = new MyStack();
		
		System.out.println(stack.isEmpty());
		stack.push(100);
		stack.push(200);
		stack.push(100);	
		stack.push(400);
		stack.show(); 
		System.out.println(stack.search(100)); // 4
		
		System.out.println("Peek " + stack.peek());
		System.out.println(stack.isEmpty());
		stack.push(1000);
		stack.show();
		System.out.println("Peek " + stack.peek());
		
		stack.pop();
		stack.show();//100 200 300
		
		stack.pop();
		stack.show();//100 200
		
		stack.pop();
		stack.show();//100
		
		stack.pop();
		stack.show();//
		
		System.out.println(stack.isEmpty());
		
		stack.show();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		MyLinkedList list = new MyLinkedList();
//	    // Insert a node
//		list.insert(5);
//		list.insert(6);
//		list.insert(8);
//		list.insertAt(2, 7);
//		list.insertAt(3, 100);
//		list.insert(1000);
//		list.insertAtStart(0);
//		list.insertAt(0, 5500);
//		list.deleteAtEnd();
//		list.deleteHead();
//		list.show();
//		System.out.println("----------------------");
//		list.deleteAt(0);
//		list.show();
//		System.out.println(list.get(0));
		
	}

}
