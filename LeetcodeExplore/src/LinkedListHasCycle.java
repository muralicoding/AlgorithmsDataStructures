import java.util.HashSet;

public class LinkedListHasCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		head = [3,2,0,-4]
		System.out.println(hasCycle());

	}
	
	
	public boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodeVisited = new HashSet<ListNode>();
        ListNode n = head;
        while(n.next != null){
            if(nodeVisited.contains(n)) {
            	return true;
            }else {
            	nodeVisited.add(n);
            }
        }
       return false;       
    }
	
	
	
	

	 //Definition for singly-linked list.
	 class ListNode {
	    int val;
	     ListNode next;
	     ListNode(int x) {
	         val = x;
	        next = null;
	     }
	  }
	

}
