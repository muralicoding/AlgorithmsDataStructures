import java.util.*;

public class NumberOfIslands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] grid = {{'1','1','1','1','0'},
						 {'1','1','0','1','0'},
						 {'1','1','0','0','0'},
						 {'0','0','0','0','0'}};
		
		//System.out.println(numIslands(grid));    // breadth first search using Queue
		
		System.out.println(numIslands_DFS(grid));

	}
	
	
	public static int numIslands(char[][] grid) {
		int count = 0;
		
		int row = grid.length;
		int col = grid[0].length;
		Queue<int[]> queue = new LinkedList<int[]>();
		
		
		//Directions
		int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};
				
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				
				if(grid[i][j] == '1') 	{
					count = count + 1;
					queue.add(new int[]{i,j});
					
					//Mark this node as visited;
					grid[i][j] = '2';
					
					while(!queue.isEmpty()) {
						int[] curr = queue.poll();
						
						for(int[] dir: directions){
							int r = curr[0] + dir[0];
							int c = curr[1] + dir[1];
							
							if(r >= 0 && r < row && c >=0 && c < col && grid[r][c] == '1') {
								queue.add(new int[] {r,c});
								grid[r][c] = '2';		
							}
						}	
					}
				}
			}
		}
		return count; 
    }
	
	public static int numIslands_DFS(char[][] grid) {
		
		int count = 0;
		
		int row = grid.length;
		int col = grid[0].length;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				
				if(grid[i][j] == '1') {
					
					System.out.println(" I am here");
					count = count + 1;
					dfs(grid, i, j);
				}
				
				
			}
		}
		
		return count;
	}
	
	public static void dfs(char[][] grid, int i, int j) {
		
		if(i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == '1') {
			grid[i][j] = '2';
			showIsland(grid);
		}else {
			return;
		}
		
		System.out.println(" I am here");
		dfs(grid, i + 1, j);
		dfs(grid, i - 1, j);
		dfs(grid, i, j + 1);
		dfs(grid, i, j - 1);
	
		
	}
	
	public static void showIsland(char[][] grid) {
		for(int k = 0; k < grid.length; k++) {
			for(int m = 0; m < grid[0].length; m++) {
				System.out.print(grid[k][m] + " ");
			}
			System.out.println();
		}
	}
}
