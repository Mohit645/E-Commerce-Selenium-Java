package dailyPracCodes;

import java.util.HashSet;

public class PrintUniqueWordsInASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print all unique words of a String
				String str = "Java is great. Grails is also great";
				str = str.replace(".", "");
				HashSet<String> uniqueWords = new HashSet<String>();
				String[] strArray = str.split(" ");
				for (int i = 0; i < strArray.length; i++) {
					int counter = 0;
					for (String word : strArray) {
						if (strArray[i].equalsIgnoreCase(word)) {
							counter++;
						}
					}
					if (counter == 1) {
						uniqueWords.add(strArray[i]);
					}
				}
				System.out.println(uniqueWords);

	}

}
