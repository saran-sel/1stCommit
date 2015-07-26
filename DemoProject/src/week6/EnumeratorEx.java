package week6;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<String> daysVect = new Vector<String>();
		daysVect.add("Sunday");
		daysVect.add("Monday");
		daysVect.add("Tuesday");
		daysVect.add("Wednesday");
		daysVect.add("Thursday");
		daysVect.add("Friday");
		daysVect.add("Saturday");

		//daysVect.remove(1);
		daysVect.add(0, "zero");
		System.out.println(daysVect);
		
		/*//for loop
		for (int i = 0; i<daysVect.size();i++){
			System.out.println(daysVect.get(i));
		}*/
		// for each
		
		for ( String temp:daysVect){
			System.out.println(temp);
		}
		// Enumetrator
		/*Enumeration<String> enumDays = daysVect.elements();
		while (enumDays.hasMoreElements()){
			System.out.println(enumDays.nextElement()); 
		}*/
	}
}


