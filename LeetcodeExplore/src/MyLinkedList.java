
public class MyLinkedList {
	
	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;	
		}else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index == 0) {
			insertAtStart(data);
		}else {
			Node n = head;
			for(int i = 0; i < index - 1; i++) { //0 1 2
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}
	
	public void deleteAtEnd() {
		Node node = head;
		Node prev = null;
		
		while(node.next != null) {
			prev = node;
			node = node.next;
		}
		prev.next = null;
	}
	
	public void deleteHead() {
		Node node = head;		
		head = node.next;
	}
	
	public void deleteAt(int index) {
		Node node = head;
		Node prev = null;
		
		if(index == 0) {
			deleteHead();
		}else {
			for(int i = 0; i < index; i++) {
				prev = node;
				node = node.next;
			}
			
			prev.next = node.next;
			node.next = null;
		}
	}
	
	public int get(int index) {
		Node node = head;
		
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		return node.data;
		
	}
	public void show() {
		
		Node node = head;
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
		
	}

}
