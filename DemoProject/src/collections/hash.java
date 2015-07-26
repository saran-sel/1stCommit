package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class hash {

	public static void main(String[] args) {

		final	String str = "sample1";
		str.concat(": note");
		System.out.println(str);


		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Fanta");
		map.put(2, "Mirinda");
		map.put(3, "Pepsi");
		map.put(4, "Coke");
		map.put(5, "Bovonto");

		Set<Entry<Integer, String>> set = map.entrySet();
		Iterator<Entry<Integer, String>> ite =	set.iterator();
		while (ite.hasNext()){
			Entry<Integer, String> s = ite.next();
			System.out.println(s.getKey());
			System.out.println(s.getValue());
		}

		Hashtable<Integer, String> tab = new Hashtable<Integer, String>();

		tab.put(1, "Fanta");
		tab.put(2, "Mirinda");
		tab.put(3, "Pepsi");
		tab.put(4, "Coke");
		tab.put(5, "Bovonto");

		Set<Entry<Integer, String>> itr = tab.entrySet();
		Iterator<Entry<Integer, String>> get =itr.iterator();
		while (get.hasNext()){
			Entry<Integer, String> s = get.next();
			System.out.println(s.getKey());
			System.out.println(s.getValue());
		}
	}

}















