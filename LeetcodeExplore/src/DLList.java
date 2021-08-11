
public class DLList {
	DLLNode head;
	DLLNode tail;
	
	int size = 0;
	
	public void addAtHead(int val) {
		if (head == null) {
			add(val);
		}else {
			DLLNode node = new DLLNode(val);
			size = size + 1;
			head.prev = node;
			node.next = head;
			head = node;
		}
		
	}
	
	public void addAtIndex(int index, int val) {
		if(index == 0) {
			addAtHead(val);
		}else if(get(index) == -1){
			add(val);
		}else {
			DLLNode x = head;
			for(int i = 1; i < index; i++) {
				x = x.next;
			}
			DLLNode node = new DLLNode(val);
			size = size + 1;
			node.next = x.next;
			x.next.prev = node;
			x.next = node;
			node.prev = x;
		}
	}
	
	public void add(int val) {
		DLLNode node = new DLLNode(val);
		size = size + 1;
		
		if (head == null) {
			node.next = null;
			node.prev = null;
			head = node;
		}else {
			DLLNode curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = node;
			node.prev = curr;
			node.next = null;
			tail = node;
		}
	}
	
	public void show() {
		DLLNode x = head;
		while(x != null) {
			System.out.print(x.val + " ");
			x = x.next;
		}
	}
	
	public void showReverse() {
		DLLNode x = tail;
		while(x != null) {
			System.out.print(x.val + " ");
			x = x.prev;
		}
	}
	
	public int get(int index) {
		if(index >= size) return -1;
		DLLNode x = head;
		for(int i = 0; i < index; i ++) {
			x = x.next;
		}
		return x.val;
	}
	
	public void delete(){
		DLLNode x = tail;
		tail = x.prev;
		tail.next = null; 
	}
	
	public void deleteAtIndex(int index) { //5
		DLLNode node = head;
		for(int i = 0; i < index; i++){  
			node = node.next;
		}
		node.prev.next = node.next;
		node.next.prev = node.prev;
		node.next = null;
		node.prev = null;
	}
	
}
