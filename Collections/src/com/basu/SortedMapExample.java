package com.basu;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
		SortedMap<Integer,String> smap=new TreeMap<>();
		smap.put(1, "C");
		smap.put(2, "C++");
		smap.put(3, "JAVA");
		
		Set s=smap.entrySet();
		Iterator i=s.iterator();
		
		while(i.hasNext()) {
			Map.Entry m=(Map.Entry) i.next();
			
			int key=(int) m.getKey();
			String value=(String) m.getValue();
			
			System.out.println("Key: "+key+"\t"+"value: "+value);
		}
	}

}
