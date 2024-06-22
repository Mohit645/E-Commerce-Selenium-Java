package stringPrac;

import java.util.regex.Pattern;

public class JavaProgramToCountTheTotalNumberOfPunctuationCharactersExistsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My*name?is}Mohit!;";
		punctuationCounter(str);

	}
	
	static void punctuationCounter(String str) {
		int count=0;
		for(int i=0; i<str.length()-1; i++) {
			if(Pattern.matches("[.?!,;:-_/[/]{}()]", str.subSequence(i, i+1)))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
