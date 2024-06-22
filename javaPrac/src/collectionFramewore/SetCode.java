package collectionFramewore;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s = new HashSet<Integer>();
		SetCode s1 = new SetCode();
		s1.addData(s);
		
		for(Integer ele : s)
		{
			System.out.println(ele);
		}
		System.out.println(s);
		//Doesn't allow duplicate values to get stored.

	}
	
	public void addData(Set<Integer> s)
	{
		Random rand = new Random();
		
		int i = 0;
		while(i<10)
		{
			s.add(rand.nextInt(10));
			i++;
		}
	}

}
