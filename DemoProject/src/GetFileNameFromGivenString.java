import java.io.File;


public class GetFileNameFromGivenString {

	public static void main(String[] args) {
		String str  = "level";
		String dtr =str.substring(0, 3);
		//str = "level2";
		System.out.println(dtr);
		//StringBuffer sbr;

		// first method is converting String to StringBuffer and using substring to skip the path and retreive only 
		// file name

		// to convert String to StringBuffer
		//System.out.println(str.equals("level2"));
		//System.out.println(str.toCharArray());
		/*char[] ch =str.toCharArray();

		for (int i=0;i<ch.length;i++){
			System.out.println(ch[i]);

		}*/


		//sbr = new StringBuffer(str);


		// System.out.println("Using Substring method: "+sbr.substring(12));
		/*System.out.println(sbr.replace(0, 3, "vow"));
		System.out.println(sbr);*/


		// this method is converting STring object to file object and using inbuilt method (getname();) to retreive file name
		/*File file = new File("C:\\Programs\\TextFile.txt");
		System.out.println("using file object conversion method: "+file.getName());*/

	}


	//sample

}
