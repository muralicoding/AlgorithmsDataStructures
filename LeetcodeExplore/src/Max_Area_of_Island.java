
public class Max_Area_of_Island {

		static int max_area = 0;
  
	public static int maxAreaOfIsland(int[][] grid) {
        
        
        int row = grid.length;
        int col = grid[0].length;
        
       
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
            	System.out.println("i " + i + " j " + j + "-->" + grid[i][j]);
                if(grid[i][j] == 1){
                	System.out.println("******");
                	   System.out.println("max_area :"  + max_area);
                    int area = dfs(grid, i, j, 0, row, col);
                    max_area = Math.max(area, max_area);
                }
            }
        }
        System.out.println("max_area Final :"  + max_area);
        return max_area;
    }
    
    public static int  dfs(int[][] grid, int i, int j, int area, int row, int col){
        
    	System.out.println("dfs");
 
    	
    	if(i >= 0 && i < row && j >=0 && j < col && grid[i][j] == 1){
            grid[i][j] = 2;
            area = area + 1;
        }else{
            return area;
        }
        
        System.out.println("i " + i + " j " + j + "area " + area);
        
       
        
        area = dfs(grid, i, j + 1, area, row, col);
        area = dfs(grid, i, j - 1, area, row, col);
        area = dfs(grid, i + 1, j, area, row, col);
        area = dfs(grid, i - 1, j, area, row, col);
   
       return area;
        
    }
	
	
	public static void main(String[] args) {
		
		int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
						{0,0,0,0,0,0,0,1,1,1,0,0,0},
						{0,1,1,0,1,0,0,0,0,0,0,0,0},
						{0,1,0,0,1,1,0,0,1,0,1,0,0},
						{0,1,0,0,1,1,0,0,1,1,1,0,0},
						{0,0,0,0,0,0,0,0,0,0,1,0,0},
						{0,0,0,0,0,0,0,1,1,1,0,0,0},
						{0,0,0,0,0,0,0,1,1,0,0,0,0},};
		
		System.out.println(maxAreaOfIsland(grid));
		
	}

}
