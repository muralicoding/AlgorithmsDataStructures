
public class DLLRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLList list = new DLList();
		list.addAtHead(6000);
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		list.add(700);
		
		list.addAtHead(0);
		list.addAtHead(1000);
		list.add(7000);
		list.addAtIndex(1, 1500);
		list.addAtIndex(0,8888);
		list.addAtIndex(20, 6666);
		
		// 300 is output
		
		list.show();
		
		System.out.println();
	
		list.deleteAtIndex(0);
		list.show();
		System.out.println();
		
		list.showReverse();
	}

}
