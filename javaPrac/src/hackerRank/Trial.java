package hackerRank;

import java.util.Collections;
import java.util.LinkedList;

public class Trial {

	public static void main(String[] args) {
		
		int [] nums = {8,2,4};
		System.out.println(removeElement(nums, 7));

}
	
public static int removeElement(int[] nums, int val) {
    
	int count = 0;
	if(nums.length>0)
	{
	for(int j : nums)
	{
		if(j == val)
		{
			count++;
		}
	}
	}
	return nums.length-count;
    }
}
