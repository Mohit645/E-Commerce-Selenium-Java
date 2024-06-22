package javaPrac;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To check whether a number is prime or not.
		int i=50;
		while(i>0)
		{
		primeNumberCheck(i);
		i--;
		}
		
	}
	
	static void primeNumberCheck(int n)
	{
		int num=n;
		String flag = "is a prime Number";
		if(num>1)
		{
		for(int i=2; i<=num-1; i++)
		{
			if(num%i==0) {
				flag = "is not a prime Number";
			}
				
		}
		
		System.out.println(n+" "+flag);
		}
		
		else {
			System.out.println(n+"is a Prime Number");
		}
	}

}
