import java.util.*;

public class perfectSquares {

	public static void main(String[] args) {

		int num = 3;
		
		System.out.println("Answer" + "---->" + perfectSquaresCount(num));
		
	}
	
	public static int perfectSquaresCount(int num) {
		int count = 1;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		Set<Integer> visited = new HashSet<Integer>();
		
		queue.add(1);
		
		visited.add(1);
		
		showQueue(queue);
		System.out.println();
		
		
		while(! queue.isEmpty()) {
			
			int size = queue.size();
			
			for(int j = 0; j < size; j++) {
				
				int curr = queue.poll();
				
				for(int i = 1; i * i <= num; i++) {
					
					int val = curr + i * i;
					
					if(val == num) {
						return count;
					}
					
					if(val > num) {
						break;
					}
					
					if(! visited.contains(val)) {
						queue.add(val);
						visited.add(val);
					}
					
					
				}
			}
			showQueue(queue);
			System.out.println();
			count++;
		}
		return -1;
	}
	
	public static void showQueue(Queue<Integer> queue) {
		for (Integer item: queue) {
            System.out.print(item + " ");
        }
	}

}
