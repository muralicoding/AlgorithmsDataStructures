
public class longestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs = {"flower","flow","flight"};
	
		
		//Horizontal
		//String prefix = strs[0];
		/*
		 * System.out.println(prefix.length());
		 * 
		 * System.out.println(strs[1].indexOf(strs[0]));
		 * 
		 * for(int i = 1; i < strs.length; i++) {
		 * 
		 * while(strs[i].indexOf(prefix) != 0) {
		 * 
		 * prefix = prefix.substring(0, prefix.length() - 1); if(prefix.isEmpty()) {
		 * System.out.println(""); } } } System.out.println(prefix);
		 */
		
		
		//Vertical
		if (strs == null || strs.length == 0) 
			System.out.println("");
	    for (int i = 0; i < strs[0].length() ; i++){
	        char c = strs[0].charAt(i);
	        System.out.println(c);
	       
	        for (int j = 1; j < strs.length; j ++) {
	        	System.out.println(strs[j].length());
	        	System.out.println(strs[j].charAt(i));
	            if (i == strs[j].length() || strs[j].charAt(i) != c) {
	            	System.out.println("------");
	            	System.out.println(strs[0].substring(0, i));
	            	i = strs[0].length();
	            }
	                //System.out.println(strs[0].substring(0, i));              
	        }
	    }
	    //System.out.println(strs[0]); 
	}
	
}
