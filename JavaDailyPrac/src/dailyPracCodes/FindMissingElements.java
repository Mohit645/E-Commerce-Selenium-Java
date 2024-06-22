package dailyPracCodes;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find missing elements of a range
				int arr[] = { 1, 14, 11, 51, 15};
				int low = 50;
				int high = 55;
				boolean flag = false;
				HashSet<Integer> output = new HashSet<Integer>();

				Arrays.sort(arr);

				int countIndexOfLow = 0;

				for (int i : arr) {
					if (i >= low) {
						break;
					}
					++countIndexOfLow;			
				}
				while (low <= high) {
					for (int j = countIndexOfLow; j < arr.length; j++) {
						flag = false;
						if(arr[j]== low)
						{
							flag = true;
							break;
						}
					}
					if(flag == false)
					{
						output.add(low);
					}
					low++;
				}
				System.out.println(output);

	}

}
