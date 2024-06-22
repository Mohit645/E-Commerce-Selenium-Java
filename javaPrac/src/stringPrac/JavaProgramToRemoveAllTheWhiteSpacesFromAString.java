package stringPrac;

public class JavaProgramToRemoveAllTheWhiteSpacesFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My name is Mohit Kaushik";
		whiteSpaceRemover(str);

	}
	
	static void whiteSpaceRemover(String str) {
		str = str.replaceAll(" ", "");
		System.out.println(str);
	}

}
