package homework;

public class Fibonacci {
	public static void main(String[] args) {
		int num = 50;
		int fibo = fibonacci(num);
		System.out.println("fibo of " + num + " = " + fibo);
		int fibo2 = (int) (1 / Math.sqrt(5)
				* (Math.pow((1 + Math.sqrt(5)) / 2, num) - Math.pow((1 - Math.sqrt(5)) / 2, num)));
		System.out.println(fibo2);
	}

	// fibo
	public static int fibonacci(int num) {
		int[] fibo = new int[num + 1];
		fibo[0] = 0;
		fibo[1] = 1;
		fibo[2] = 1;
		for (int i = 3; i <= num; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
		return fibo[num];
	}
	
	 public static int getFibonacciN(int n){
	        int fi_2 = 0;
	        int fi_1 = 1;
	        int fi = 0;
	        for(int i=2; i <= n; i++){
	            fi = fi_2 + fi_1;
	            fi_2 = fi_1;
	            fi_1 = fi;
	        }
	        return fi;
	    }
	 public static int getFibonacciUsingRecursion (int num) {
		 int[] fibo = new int[num + 1];
			if(num==0)
				return fibo[num] = 0;
			if(num==1)
				return fibo[num] = 1;
			if(num==2)
					return fibo[num] = 1;
			
		return getFibonacciUsingRecursion(num-1)+getFibonacciUsingRecursion(num-2);
		 
	 }
//	public static int getFibonacciNRecursive(int n, int prev, int curr) {
//		if (n == 1 || n == 2) {
//			return curr;
//		} else {
//			return getFibonacciNRecursive(n - 1, curr, prev + curr);
//		}
//	}
//
//	public static int getFibonacciNRecursiveConsecutive(int n, int i, int prev, int curr)
//	    {
//	        if( i == n ){
//	            return curr;
//	        } else {
//	            return getFibonacciNRecursiveConsecutive(n, i + 1, curr, prev + curr);
//	        }
//	    }
}
