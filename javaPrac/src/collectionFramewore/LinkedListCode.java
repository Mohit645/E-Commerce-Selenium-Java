package collectionFramewore;

import java.util.*;

public class LinkedListCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LinkedList consists of elements where each element has a reference
		//with its next and previous element. Hence transversing becomes slow in LinkedList.
		//Usually select arraylist if operations are not required in middle and end.
		
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		LinkedListCode l1 =  new LinkedListCode();
		l1.addData(ll);
		l1.iterateForMe(ll);
		
		

	}
	
	public void addData(LinkedList<Integer> alis) {
		int i = 100;
		while (i > 9) {
			alis.add(i);
			i = i - 10;
		}
	}

	public void iterateForMe(LinkedList<Integer> alis) {
		for (Integer val : alis) {
			System.out.println(val);
		}
	}

}
