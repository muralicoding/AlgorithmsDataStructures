import java.util.ArrayList;
import java.util.Iterator;

public class MyStack {

	ArrayList<Integer> list = new ArrayList<Integer>();
	int top = 0;
	
	public void push(Integer data) {
		list.add(data);
		top++;
	}
	
	public void pop() {
		list.remove(--top);
	}
	
	public Integer peek() {
		return list.get(top - 1);
	}
	
	public boolean isEmpty() {
		if(top <= 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int search(Integer data) {
		int pos = 1;
		for(int i = top-1; i >=0; i--) {
			System.out.println(list.get(i));
			if (list.get(i).equals(data)) {
				return pos;
			}else {
				pos++;
			}
		}
		return -1;
	}
	
	public void show() {
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
			
		}
		System.out.println();
	}
}
