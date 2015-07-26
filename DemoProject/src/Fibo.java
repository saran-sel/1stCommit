
public class Fibo {
	
	static int n1=0;
	static int n2=1;
	static int n3;
	
	public static void Recursive(int count){
		if(count>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			count = count-1;
			Recursive(count);
		}
		
	}

	public static void main(String[] args) {
		int count =10;
		System.out.println(n1);
		System.out.println(n2);
		count = count-2;
		Recursive(count);
		
		
		

	}

}
