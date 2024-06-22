package stringPrac;

import java.util.Arrays;

public class JavaProgramToDetermineWhetherTwoStringsAreTheAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Brag";
		String str2 = "Grab";
		anagram(str, str2);
		

	}
	
	static void anagram(String str, String str2)
	{
		String flag = "Not Anagram";
		str = str.toLowerCase();
		str2= str2.toLowerCase();
		char[] ar1=str.toCharArray();
		char[] ar2=str2.toCharArray();

		
		if(str.length()==str2.length())
		{
			Arrays.sort(ar1);
			Arrays.sort(ar2);
			
			str = String.copyValueOf(ar1);
			str2 = String.copyValueOf(ar2);
			
			if(str.equals(str2))
			{
				flag="Anagram";
			}
			
		}
		System.out.println(flag);
	}

}
