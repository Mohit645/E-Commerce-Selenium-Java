package collectionFramewore;

import java.util.*;

public class ArraylistCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraylistCode a1 = new ArraylistCode();

		ArrayList<Integer> alis = new ArrayList<Integer>();
		a1.addData(alis);

		a1.iterateForMe(alis);

	}

	public void addData(ArrayList<Integer> alis) {
		int i = 100;
		while (i > 9) {
			alis.add(i);
			i = i - 10;
		}
	}

	public void iterateForMe(ArrayList<Integer> alis) {
		for (Integer val : alis) {
			System.out.println(val);
		}
	}

}
