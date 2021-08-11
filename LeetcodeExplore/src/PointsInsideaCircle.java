
public class PointsInsideaCircle {

	public static void main(String[] args) {
		int[][] points = {{1,3},
						  {3,3},
						  {5,3},
						  {2,2}};
		int[][] queries = {{2,3,1},{4,3,1},{1,1,2}};
		int[] output = countPoints(points, queries);
		for(int num: output) {
			System.out.println(num + " ");
		}
	}
	
    public static int[] countPoints(int[][] points, int[][] queries) {
        
        int[] output = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++){
            Integer x1 = queries[i][0];
            Integer y1 = queries[i][1];
            Integer r = queries[i][2];
            
            System.out.println("x1 " + x1 + " y1 " + y1 + " r " + r);
            for(int j = 0; j < points.length; j++){
                Integer x2 = points[j][0];
                Integer y2 = points[j][1];
                System.out.println("x2 " + x2 + " y2 " + y2);
                
                Integer temp = (y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1);
                
                System.out.println(temp);
                
                Double dist = Math.sqrt(temp);
                System.out.println(dist);
                if(dist <= r){
                    output[i] += 1; 
                }
            }
        }
        return output;
    }

}
