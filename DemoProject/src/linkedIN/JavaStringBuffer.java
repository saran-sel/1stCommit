package linkedIN;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class JavaStringBuffer {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("String 1");
		// concatinating two strings using string buffer
		sb.append("  String 2");
		System.out.println(sb);
		//substring using beginindex
		String sub1 = sb.substring(1);
		System.out.println(sub1);
		//substring using beginindex and endindex
		String sub2 = sb.substring(1,5);
		//System.out.println(sub2);
		//reverse of String
		StringBuilder reverse = sb.reverse();
		//System.out.println(reverse);
*/		

       /* // List concept , it maintain order and allow duplicate
        List<String> testLeafTrainer = new ArrayList<String>();
        testLeafTrainer.add("Babu"); // 1st babu
        testLeafTrainer.add("Venu");
        testLeafTrainer.add("Bharathan");
        testLeafTrainer.add("Babu"); // 2nd time babu
        testLeafTrainer.add("yamini");
        for (String tempObj : testLeafTrainer) {
            System.out.println(tempObj);
        }
        for (int i =0;i<testLeafTrainer.size();i++) {
            System.out.println(testLeafTrainer.get(i));
        }
*/
       /* // Set concept, it doesn't maintain order doesn't allow duplicate

        Set<String> testLeafTrainerSet = new TreeSet<String>();
        testLeafTrainerSet.add("7"); // 1st babu
        testLeafTrainerSet.add("6"); // 1st babu
        testLeafTrainerSet.add("Venu");
        testLeafTrainerSet.add("bharathan");
        testLeafTrainerSet.add("Babu"); // 2nd time babu
        for (String tempObj : testLeafTrainerSet) {
            System.out.println(tempObj);
        }*/

		 Map<String, String> map = new HashMap<String, String>();
	        map.put("1", "Jan");
	        map.put("2", "Feb");
	        map.put("1", "Mar");
	        map.put("4", "Apr");
	        map.put("5", "May");
	        map.put("6", "Jun");
	        
	        System.out.println(map.get("1"));
	}

}
