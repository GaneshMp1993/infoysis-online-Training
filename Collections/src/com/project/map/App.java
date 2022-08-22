package com.project.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

//map-->used for adding pair of values(Key+Values)
//hasmap-->data is inserted based on the natural ordering,,,,,,,,,,
public class App {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(4, "Vamsi");
		map.put(6, "Ganesh");
		map.put(1, "Jaysurya");
		map.put(2, "Sampath");
		map.put(5, "Varaprasad");
		map.put(3, "Sairupesh");
		map.put(8, null);
//		map.put(null, "Vignesh");
		
		
		//by using for-each loop
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println("Keys: "+entry.getKey()+" Value: "+entry.getValue());
		}
		
		System.out.println("iterating over iterator interface,,,,,,,,,,,,");
		Iterator<Map.Entry<Integer, String>> itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getValue());
		}
	}

}
