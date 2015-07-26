
public class ReverseNum {

	public static void main(String[] args) {
		int num = 12345;
		int reversenum = 0;
		
		
		// while loop is to get num value untill it becomes "0"
		while (num!=0){
			
			reversenum = reversenum *10;
			reversenum = reversenum + num%10;
			num = num/10;
			
		}
		System.out.println("reverse num = " +reversenum);
	}





}
