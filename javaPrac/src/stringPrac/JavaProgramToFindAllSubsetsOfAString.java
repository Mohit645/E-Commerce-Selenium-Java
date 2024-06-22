package stringPrac;

public class JavaProgramToFindAllSubsetsOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Funny";
		subsetString(str);

	}

	static void subsetString(String str) {
		String str1=null;
		int count = 0;
		int n = str.length();
		int totalPossibleSubsets = n*(n+1)/2;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if(j>=i)
					{str1 = str.substring(i, j+1);
				System.out.print(str1+" ");
				count++;
					}
			}
		}
		System.out.println();
		
		if(totalPossibleSubsets==count) {
			System.out.println("We have got all the possible subsets");
		}
		else {
			System.out.println("We did not get all the possible subsets");
		}
		
	}

}
