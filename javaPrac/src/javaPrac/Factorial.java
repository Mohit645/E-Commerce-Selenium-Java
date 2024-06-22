package javaPrac;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			factorial(i);
			
		}

	}
	
	static void factorial(int num) {
		
		int factorial = 1;
		
		for(int i=1; i<=num; i++)
		{
			factorial = factorial*i;
			
		}
		
		System.out.println("factorial of "+num+" is "+factorial);
		
	}

}
