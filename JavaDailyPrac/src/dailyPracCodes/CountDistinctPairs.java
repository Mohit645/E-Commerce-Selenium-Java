package dailyPracCodes;

public class CountDistinctPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Count all distinct pairs with difference equal to k
				int arr[] = {8, 12, 16, 4, 0, 20}; 
				int diff = 4;
				int counter = 0;
				int loop = 0;
				
				for(int num1 : arr)
				{
					for(int i = loop; i < arr.length; i++)
					{
						if(Math.abs(arr[i]-num1) == diff)
						{
							++counter;
						}
					}
					loop++;
				}
				System.out.println(counter);
	}

}
