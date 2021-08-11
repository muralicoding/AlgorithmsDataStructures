import java.util.*;

public class SymmetricTree {
	public TreeNode root;
	
public boolean isSymmetric(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root.left);
        queue.add(root.right);
        
        TreeNode null_node = new TreeNode(500);
        
        
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            
            Integer[] val = new Integer[size];
            
            System.out.println();
            
            for(int i = 0; i < size; i++){
                TreeNode currentNode =  queue.remove();
                
                val[i] = currentNode.val;
                System.out.print(val[i] + " ");
                
                
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }else{
                    queue.add(null_node);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }else{
                    queue.add(null_node);
                }
                
            }
            if(!palindrome(val)){
                return false;
            } 
            
        }
        return true;
    }
    
    public static boolean palindrome(Integer[] val){
        int i = 0;
        int j = val.length - 1;
        System.out.println(val.length);
        while(i < j){
            if(val[i] != val[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SymmetricTree tree = new SymmetricTree();
		tree.root = new TreeNode(1);
		
		
		

	}
	
	
	class TreeNode {
		    int val;
		    TreeNode left;
		     TreeNode right;
		    TreeNode() {}
		    TreeNode(int val) { this.val = val; }
		    TreeNode(int val, TreeNode left, TreeNode right) {
		        this.val = val;
		         this.left = left;
		        this.right = right;
		     }
		 }

}
