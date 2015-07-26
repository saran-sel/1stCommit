package day2_interface_abstractclasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Alliance implements Renault {

	@Override
	public void koleos() {
		Set<String> set = new HashSet<String>();
		set.add("India");
		set.add("France");

		for (String temp:set){
			System.out.println(temp);
		}
	}

	@Override
	public void scala() {

		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(15489);
		li.add(12345);

		int i =0;
		while (i<li.size()){
			System.out.println(li.get(i));
			i++;
		}

	}

	@Override
	public String kwid() {
		
		String str = "New Launch";
		System.out.println(str);

		return str;
	}

	@Override
	public void pulse() {
		
		System.out.println("DS s pulse");


	}



}
