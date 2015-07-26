package coreJava.Inheritance;

public class Samsung extends Moto {
	
	public String core(){
		
		System.out.println(super.core());
		String str2 = "Iam Samsung Galaxy";
		return str2;
	}

}
