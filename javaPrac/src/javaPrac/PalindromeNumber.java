package javaPrac;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromeNumber(123454321);

	}
	
	static void palindromeNumber(int number)
	{
		String num = String.valueOf(number);
		String flag = "The number is not a palindrome";
		if(num.length()%2==0)
		{
			
			String firstHalfNum = null;
			String secondHalfNum = null;
			String reverseSecondHalf = null;
			
			firstHalfNum = num.substring(0, (num.length()/2));
			secondHalfNum = num.substring(num.length()/2, num.length());
			
			StringBuilder reverseSecondHalf_sb = new StringBuilder();
			reverseSecondHalf_sb.append(secondHalfNum).reverse().toString();
			
			reverseSecondHalf = reverseSecondHalf_sb.toString();
			
			if(firstHalfNum.equalsIgnoreCase(reverseSecondHalf)) {
				flag = ("The number is a palindrome");
			}			
		}
		else
		{
			String firstHalfNum = null;
			String secondHalfNum = null;
			String reverseSecondHalf = null;
			
			firstHalfNum = num.substring(0, (num.length()/2));
			secondHalfNum = num.substring(num.length()/2+1, num.length());
			
			StringBuilder reverseSecondHalf_sb = new StringBuilder();
			reverseSecondHalf_sb.append(secondHalfNum).reverse().toString();
			
			reverseSecondHalf = reverseSecondHalf_sb.toString();
			
			if(firstHalfNum.equalsIgnoreCase(reverseSecondHalf)) {
				flag = ("The number is a palindrome");
			}
		}
	System.out.println(flag);
	}

}
