package stringPrac;

public class JavaProgramToCountTheTotalNumberOfCharactersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name is Mohit";
		charCount(str);

	}
	static void charCount(String str) {
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(str.length()-count);
	}

}
