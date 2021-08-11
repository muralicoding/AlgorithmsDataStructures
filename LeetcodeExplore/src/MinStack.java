import java.util.*;

public class MinStack {
	
	List<Integer> data;
	
	int top = 0;
	
	List<Integer> min;
	
	int min_top = 0;
	


	
	public MinStack() {
        data = new ArrayList<Integer>();
        min  = new ArrayList<Integer>();
    }
	
	public void push(int val) {
        
		data.add(val);
        top = top + 1;
        
        if(isEmpty()) {
        	min.add(val);
        	min_top = min_top + 1;
        }else if(val <= getMin()) {
        	min.add(val);
        	min_top = min_top + 1;
        }
        
        
    }
    
    public void pop() {
    	int value = data.remove(top - 1);
    	top = top - 1;
    	
    	if(value <= getMin()) {
    		min.remove(min_top - 1);
    		min_top = min_top - 1;
    	}
    	
    	
        
    }
    
    public int top() {
    	
    	return data.get(top - 1);
        
    }
    
    public int getMin() {
    	return min.get(min_top - 1);
        
    }
    
    public boolean isEmpty() {
    	if(min_top <= 0) {
    		return true;
    	}else {
    		return false;
    	}
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		minStack.getMin(); // return -3
		minStack.pop();
		System.out.println(minStack.top());    // return 0
		System.out.println(minStack.getMin()); // return -2

	}

}
