import java.util.ArrayList;
import java.util.LinkedList;


public class List {

	public static void main(String[] args) {
		 ArrayList<String> li = new ArrayList<String>();
		 
		 li.add("Pepsi");
		 li.add("Coke");
		 li.add("Pepsi");
		 li.add(null);
		 
		 System.out.println("***ArrayList***");
		 for (String temp : li){
			 System.out.println(temp);
		 }
		 
		 
		 LinkedList<Integer> lli = new LinkedList<Integer>();
		 
		 lli.add(null);
		 lli.add(1000);
		 lli.add(750);
		 lli.add(1000);
		 System.out.println("***LinkedList***");
		 for (int i = 0; i<lli.size();i++){
			 System.out.println(lli.get(i));
		 }
		 
	}
		
}
