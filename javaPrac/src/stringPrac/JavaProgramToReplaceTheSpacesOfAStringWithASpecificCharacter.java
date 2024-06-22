package stringPrac;

public class JavaProgramToReplaceTheSpacesOfAStringWithASpecificCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name is Mohit Kaushik";
		String ch = "-";
		spaceReplacer(str, ch);
		

	}
	static void spaceReplacer(String str, String ch) {
		str=str.replaceAll(" ", ch);
		System.out.println(str);
	}

}
