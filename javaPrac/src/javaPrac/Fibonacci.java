package javaPrac;



public class Fibonacci {
	
	 
	public static void main(String[] args) {
		
	// writing code for fibonacci series for first n numbers.
		
		fib(3);
	    

	}
	
	static void fib(int n)
	{
		int num_1 = 1;
		int num_2 = 1;
		
		if(n==1) {
			System.out.println(num_1);
		}
		else if(n==2)
		{
		System.out.println(num_2);				
		}
		
		else
		{
			System.out.println(num_1);
			System.out.println(num_2);
			
			int temp = 1;
			int sum = 0;
			for (int i = 0; i <=n-3 ; i++) {
				
				
				sum = temp + num_2;
				temp = num_2;
				num_2 = sum;
				
				System.out.println(sum);
				
			}
		}
		
		
		
	}
}


