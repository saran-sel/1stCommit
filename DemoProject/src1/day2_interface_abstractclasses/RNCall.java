package day2_interface_abstractclasses;

public class RNCall implements Nissan{

	public static void main(String[] args) {
		/*Alliance al = new Alliance();
		al.koleos();
		al.scala();
		al.kwid();
		al.pulse();*/
		//wiotout calling method how it ll be i nvoke
		
		RNCall call = new RNCall();
		call.sunny();

	}

	@Override
	public void sunny() {
		System.out.println("This is : "+str);

	}

	@Override
	public void micra() {
		// TODO Auto-generated method stub

	}

	@Override
	public void terranno() {
		// TODO Auto-generated method stub

	}

	@Override
	public void xtrail() {
		// TODO Auto-generated method stub

	}

}
