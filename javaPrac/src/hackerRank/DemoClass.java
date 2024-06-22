package hackerRank;

import java.util.Arrays;


public class DemoClass {

	public static void main(String[] args) {
	
		
		System.out.println(romanToInt("LVIII"));
		
}
	public static String anagramChecker(String s1, String s2)
	{
		String flag = "Not Anagrams";
		s1 = stringSorter(s1);
		s2 = stringSorter(s2);
		if(s1.equals(s2))
		{
			flag = "Anagrams";
		}
		return flag;		
	}
	
	public static String stringSorter(String str)
	{
		str = str.toLowerCase();
		char[] chars = str.toCharArray();
		char temp;
		for (int i = 0; i < chars.length; i++) 
        {
            for (int j = i + 1; j < chars.length; j++) { 
                if (chars[i] > chars[j]) 
                {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
		
		
		
		
	    String sorted = new String(chars);
	    return sorted;
	
	}
	

    public static int[] twoSum(int[] nums, int target) {
    	int [] output = new int[2];
    	int temp2 = 0;
    	
    	for(int i=0;i<nums.length;i++) 
    	{
    		output[0] = i;
        	for(int j=1;j<nums.length;j++) 
        	{
        		if(j>i)
        		{
        			temp2 = nums[j];
        			if(temp2+nums[output[0]]==target)
        			{
        				output[1]=j;
        				return output;
        			}
        		}
        	}
    	}
		return output;
    	
        
    }
    
    public static int reverse(int x) {
    	
    	double reverse_Number = 0;
    	if((x <= (Integer.MAX_VALUE - 1)) || (x >= Integer.MIN_VALUE) )
    	{
    	String number = String.valueOf(x);
    	String reverseNumber = "";
    	
    	for(int i=number.length()-1;i>=0;i--)
    	{
    		reverseNumber = reverseNumber + number.charAt(i);
    	}
    	
    	if(reverseNumber.charAt(reverseNumber.length()-1) == '-')
    	{
    		reverseNumber = reverseNumber.substring(0, reverseNumber.length()-1);
    		reverseNumber = "-" + reverseNumber;
    	}
		
    	reverse_Number = Double.parseDouble(reverseNumber);
    	System.out.println("Value of the reverse number: "+reverse_Number);
    	System.out.println(reverse_Number > (Integer.MAX_VALUE - 1));
    	
    }
    	if(reverse_Number > (Integer.MAX_VALUE - 1) || reverse_Number < Integer.MIN_VALUE)
    	{
    		reverse_Number = 0;
    	}
    	return (int) reverse_Number;   	
    }
    
    public static int romanToInt(String s) {
     
	 int answer = 0;
	 s = s.toLowerCase();
	 for(int i = 0; i< s.length(); i++)
	 {
		 char c = s.charAt(i);
		 int number= 0;
		 switch (c) {
		case 'i':
			if(((i < s.length()-1) && s.charAt(i+1)=='v'))
			{
				number = 4;
				i = i+1;
			}
			
			else if((i < s.length()-1) && (s.charAt(i+1)=='x'))
			{
				number = 9;
				i = i+1;
			}
			else
			{
			number = 1;
			}
			answer = answer + number;
			break;
			
		case 'v':
			number = 5;
			answer = answer + number;
			break;
			
		case 'x':
			if(((i < s.length()-1) && s.charAt(i+1)=='l'))
			{
				number = 40;
				i = i+1;
			}
			
			else if((i < s.length()-1) && (s.charAt(i+1)=='c'))
			{
				number = 90;
				i = i+1;
			}
			else
			{
			number = 10;
			}
			answer = answer + number;
			break;
			
		case 'l':
			number = 50;
			answer = answer + number;
			break;
			
		case 'c':
			if(((i < s.length()-1) && s.charAt(i+1)=='d'))
			{
				number = 400;
				i = i+1;
			}
			
			else if((i < s.length()-1) && (s.charAt(i+1)=='m'))
			{
				number = 900;
				i = i+1;
			}
			else
			{
			number = 100;
			}
			answer = answer + number;
			break;
			
		case 'd':
			number = 500;
			answer = answer + number;
			break;	
			
		case 'm':
			number = 1000;
			answer = answer + number;
			break;	
		}
	 }
	 
	 return answer;
    }

    
    public static String longestCommonPrefix(String[] strs)
    {
		return null;
    	
    }
}
    


	