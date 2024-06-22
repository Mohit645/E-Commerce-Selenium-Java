package dailyPracCodes;

import java.util.Arrays;
import java.util.HashSet;

public class CountUniqueElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Count Distinct ( Unique ) elements in an array
				int arr[] = {10, 20, 20, 10, 30, 10};
				HashSet<Integer> uniqueNumbers = new HashSet<Integer>();
				for(int i : arr)
				{
					uniqueNumbers.add(i);
				}
				System.out.println("The number of unique elements : "+uniqueNumbers.size());
				
				
				// Count Distinct ( Unique ) elements in an array
				int arr1[] = { 10, 20, 20, 10, 20 };
				int numberOfUniqueElements = 1;

				Arrays.sort(arr1);
				for (int i = 0; i < arr1.length - 1; i++) {
					System.out.println("The two elements are : " + arr1[i] + " and " + arr1[i + 1]);
					if (!(arr1[i] == arr1[i + 1])) {
						System.out.println("The two elements are : " + arr1[i] + " and " + arr1[i + 1]);
						numberOfUniqueElements++;
					}
				}
				System.out.println(numberOfUniqueElements);
	}

}
