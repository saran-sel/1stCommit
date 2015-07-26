
public class SwappingTwoNumbers {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("X value :"+x);
		System.out.println("Y value :"+y);

	}

}
