package stringPrac;

public class JavaProgramToDivideAStringInNEqualParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MyNameIsMohitKaushik";
		int divide = 4;
		stringDivider(str, divide);

	}
	static void stringDivider(String str, int divide)
	{
		int length = str.length();
		String str2 = "";
		
		if(length%divide!=0) {
			System.out.println("The string cannot be divided into equals parts.");
		}
		else {
			for(int i=0; i<length; i++)
			{
				if(i%divide==0 && i!=0) {
					System.out.print(str2);
					System.out.println();
					str2= "";
				}
				str2 =str2+str.charAt(i);				
			}
			System.out.print(str2);
		}
	}

}
