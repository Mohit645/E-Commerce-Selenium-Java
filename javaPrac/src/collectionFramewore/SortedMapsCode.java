package collectionFramewore;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapsCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hm = new HashMap<Integer, String>();
		Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		SortedMapsCode s1 = new SortedMapsCode();
		s1.addAndIteData(lhm);

	}

	
	public void addAndIteData(Map<Integer, String> map) {
		
		map.put(4, "Four");
		map.put(11, "Eleven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		map.put(1, "One");
		map.put(3, "Three");
		map.put(10, "Ten");
		map.put(30, "Thirty");
		map.put(0, "Zero");
		
		for(Integer key: map.keySet())
		{
			String value = map.get(key);
			System.out.println(key+":"+value);
		}
	}
}
