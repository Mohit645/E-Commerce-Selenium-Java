package stringPrac;

public class JavaProgramToReplaceLowercaseCharactersWithUppercaseAndViceversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name is Mohit Kaushik";
		caseChanger(str);

	}
	
	static void caseChanger(String str) {
		String str2 = "";
		char [] strChar = str.toCharArray();
		
		for (int i = 0; i < strChar.length; i++) {
			if(Character.isUpperCase(strChar[i]))
			{
			str2 = str2+String.valueOf(str.charAt(i)).toLowerCase();
			}
			else {
				str2 = str2+ String.valueOf(str.charAt(i)).toUpperCase();
			}
				
		}
		System.out.println(str2);
	}

}
