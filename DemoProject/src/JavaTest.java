
public class JavaTest {

	static int n1=0, n2=1,n3;
	

	public void biggest(){
		int a[] = {56,78,98};
		int temp =0;

		for (int i=0;i<a.length;i++){
			if(temp<a[i]){
				temp=a[i];
			}
		}
		System.out.println(temp);
	}
	
	public static void sum(){
		int num=1234;
		int r,sum;
		sum=0;
		
		while(num!=0){
			r=num%10;
			sum=sum+r;
			
			num=num/10;
			
		}
		System.out.println(sum);
	}

	public static void rverse(){
		int num=1234;
		int r,temp;
		temp=0;
		
		while(num!=0){
			r=num%10;
			temp=temp*10+r;
			num=num/10;
		}
		System.out.println(temp);
	}

	public static void palindrome(){
		int num=121;
		int r,n,temp;
		
		temp=0;
		n=num;
		 while(n!=0){
			 r=n%10;
			 temp=temp*10+r;
			 n=n/10;
		 }
		 System.out.println(n);
		 if (temp==num){
			 System.out.println("Palindrome");
		 }else{
			 System.out.println("Not a Palindrome");
		 }
	}
	
	public static void swapping(){
		int x=10;
		int y=20;
		
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x);
		System.out.println(y);
}
	
	
	public static void fibonacciNormal(){
		int n1=0,n2=1,n3;
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=2;i<10;i++){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
