package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, Integer> m=new HashMap<Integer, Integer>();
		Map<Integer, Integer> m1=m;
		MapDemo m2=new MapDemo();
		MapDemo m3=m2;
		m.put(1, 123);
		m.put(2, 234);
		m.put(3, 345);
		m.put(4, 456);
		System.out.println(m);
		System.out.println("20:"+m.containsKey(20));
		System.out.println("4:"+m.containsKey(4));
		System.out.println(m.hashCode()==m1.hashCode());
		System.out.println(m2.hashCode()==m3.hashCode());
		System.out.println("123:"+m.containsValue(123));
		Set s=m.entrySet();
		System.out.println(s);
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry<Integer, Integer> m4=(Map.Entry)i.next();
			System.out.println(m4.getKey()+" = "+m4.getValue());
			/*System.out.println(m4);
			m4.setValue(20);
			System.out.println(m4);*/
			if(m4.getKey().equals(4))
				m4.setValue(9040);
			System.out.println(m4);
			
		}
		System.out.println(m.get(4));
	}

}
