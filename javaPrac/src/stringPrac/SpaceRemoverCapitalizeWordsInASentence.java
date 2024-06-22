package stringPrac;

public class SpaceRemoverCapitalizeWordsInASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java Program to determine whether one string is a rotation of another";
		str = capitalizeAfterSpace(str);
	//	System.out.println(str);
		spaceRemover(str);

	}
	
	static void spaceRemover(String str) {
		for(int i=0; i <str.length(); i++) {
			if(!(str.charAt(i)==' '))
			{
				System.out.print(str.charAt(i));
			}
		}
	}
	
	static String capitalizeAfterSpace(String str) {
		
		String str1="";
		char c='\0';
		int temp =0;
		int count =0;
		for(int i=0; i <str.length(); i++) {
			
			if(count>temp) {
				c = Character.toUpperCase(str.charAt(i));
				temp=count;
			}
			if(c!='\0')
			{
				str1 = str1 + c;
				c='\0';
			}
			else
			{
				str1 = str1 + str.charAt(i);
			}
				
			
			
			if((str.charAt(i)==' '))
			{
				count++;
			}
			
		}
		
		return str1;
		
	}
	

}
