import java.util.*;

public class Clone_Graph {

	public static Node cloneGraph(Node node) {
        
		Node answer = null;
        
        
        
        
        return cloneGraph_dfs(node);
    }
	
	public static Node cloneGraph_dfs(Node node, Node answer) {
		
		
		
		cloneGraph_dfs(node.remove)
		
		
		answer = new Node() 
		
		return answer;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Node {
	    public int val;
	    public List<Node> neighbors;
	    public Node() {
	        val = 0;
	        neighbors = new ArrayList<Node>();
	    }
	    public Node(int _val) {
	        val = _val;
	        neighbors = new ArrayList<Node>();
	    }
	    public Node(int _val, ArrayList<Node> _neighbors) {
	        val = _val;
	        neighbors = _neighbors;
	    }
	}

}
