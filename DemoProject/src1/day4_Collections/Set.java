package collections;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.bouncycastle.pqc.crypto.gmss.Treehash;

public class Set {

	public static void main(String[] args) {
		
		// Unordered = hashset
		
		HashSet<String> set = new HashSet<String>();
		set.add(null);
		set.add(null);
		set.add("Mirinda");
		
		for (String temp:set){
			System.out.println(temp);
		}
		
		// Insertion order = LinkedHashset
		
	//	LinkedHashSet<Integer> hash = new LinkedHashSet<Integer>();
		TreeSet<Integer> hash = new TreeSet<Integer>();
		hash.add(67);
		hash.add(78);
		hash.add(98);
		hash.add(34);
		
		for (Integer temp: hash){
			System.out.println(temp);
			
			
		}
	}


}
