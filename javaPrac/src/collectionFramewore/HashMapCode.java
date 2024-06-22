package collectionFramewore;

import java.util.HashMap;
import java.util.Map;

public class HashMapCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//calling is done using key, so sorting and order do not stay same.

		map.put(4, "Four");
		map.put(11, "Eleven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		map.put(1, "One");
		map.put(3, "Three");
		map.put(10, "Ten");
		map.put(30, "Thirty");
		map.put(0, "Zero");

		// Duplicate key will overwrite the previous one.

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key= entry.getKey();
			String val = entry.getValue();
			
			System.out.println(key+" : "+ val);
		}

	}

}
