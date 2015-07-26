
public class Palindrome {

	public static void main(String[] args) {
		
		String str = "Level";
		String reverse1 = null;
		
		int length = str.length();
		for (int i=length-1;i>=0;i--){
			String reverse11 = reverse1 + str.charAt(i);
			System.out.println(reverse11);
		}
		

	}

}
