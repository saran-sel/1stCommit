package week6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*//Array List to add all the elements

		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("A");
		arrList.add("B");
		arrList.add("C");
		//iterating thru while loop w/o using iterator//
		int i =0;
		while(i<arrList.size()){
			System.out.println(arrList.get(i));
			i++;
		}

		//Iterator for arrlist
		Iterator<String> itr = arrList.iterator();
		//		System.out.println(itr.next());
		//		System.out.println(itr.next());
		//		System.out.println(itr.next());
		//System.out.println(itr.hasNext());
		//System.out.println(itr.next());
		while (itr.hasNext()){
			System.out.println("loop");
			System.out.println(itr.next());

		}*/

		//Map<String, String> map1 = new HashMap<String, String>();

		//Collection to add all elements
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "A");
		map.put("2", "B");
		map.put("3", "C");
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> ite = set.iterator();
		while (ite.hasNext()){
			Entry<String, String> s =ite.next();
			System.out.println(s.getKey());
			System.out.println(s.getValue());
			
		}
			
		
	}
}
