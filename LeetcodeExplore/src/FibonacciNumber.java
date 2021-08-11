
public class FibonacciNumber {

	static double result;
	
	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 
		System.out.println(myPow(2.00000, -2));

	}
	
	public static double myPow(double x, int n) {
		
		if( n < 0) {
			x = 1 / x;
			n = -1 * n;
		}
        
        if(n == 0){
            return 1;
        }else if(n == 1){
            return x;   
        }else{
            result = myPow(x, n - 1) * x;    
        }
       
        return result;
        
    }

}
