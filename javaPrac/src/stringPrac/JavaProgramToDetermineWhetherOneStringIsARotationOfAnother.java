package stringPrac;

public class JavaProgramToDetermineWhetherOneStringIsARotationOfAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 = "deabc";
		stringRotationCheck(s1, s2);
	}
	
	static void stringRotationCheck(String str1, String str2)
	{
		String flag = "No";
		String concat = null;
		if(str1.length()==str2.length())
		{
			concat = str1+str1;
			if(concat.contains(str2))
			{
				flag="Yes";
			}
		}
		System.out.println(flag);
		
	}

}
