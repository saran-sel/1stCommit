package Day1_coreJava;

public class ConstructorExample {
	
	String str = null;
	

	public ConstructorExample(int i)
	{

		System.out.println(i);	
	}

	public ConstructorExample(String j)
	{

		System.out.println(j);	
	}

	public ConstructorExample(int i, String string) {
		System.out.println(i);
		System.out.println(string);
	}

	// normal method.. 
	public void nonConstructor(int i){
		System.out.println(i);
	}

	public static void main(String[] args) {
		//While creating refernce itself we can call constructor method
		//mostly used to assing values while creating refernce
		
		ConstructorExample con1 = new ConstructorExample("June");
		ConstructorExample con = new ConstructorExample(10,"Saravanan");
		con.nonConstructor(20);
	}
}
