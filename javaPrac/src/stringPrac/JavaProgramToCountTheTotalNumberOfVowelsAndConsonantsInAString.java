package stringPrac;

import java.util.regex.Pattern;

public class JavaProgramToCountTheTotalNumberOfVowelsAndConsonantsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is Mohit Kaushik";
		vowelsConsonantsCounter(str);

	}
	
	static void vowelsConsonantsCounter(String str)
	{
		str = str.toLowerCase();
		int vowel = 0;
		int consonant = 0;
		for (int i = 0; i < str.length(); i++) {
			if(Pattern.matches("[aeiou]", str.subSequence(i, i+1)))
			{
				vowel++;
			}
			else if(Pattern.matches("[^aeiou ]", str.subSequence(i, i+1)))
			{
				consonant++;
			}
		}
		
		System.out.println("Total number of vowels and consonants in the string are "+vowel+" "+consonant+" respectively");
	}

}
