package week6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Pattern p = Pattern.compile(".a");
		Matcher match = p.matcher("da");
		boolean isMatch1 = match.matches();
		System.out.println(isMatch1);*/

		boolean isMatch2 = Pattern.matches(".a", "da");
		System.out.println(isMatch2);

		boolean isMatch3 = Pattern.matches(".a......n", "saravanan");
		System.out.println(isMatch3);

		boolean isMatch4 = Pattern.matches(".a[a-z]{6}n", "saravanan");
		System.out.println(isMatch4);

		//[abc]	a, b, or c (simple class)
		boolean isMatch5 = Pattern.matches("[^sarsadrgdfgfh]{3}","sar");
		System.out.println(isMatch5);

		//Any character except a, b, or c (negation)
		boolean isMatch6 = Pattern.matches("[^sar]", "v");
		System.out.println(isMatch6);

		//[a-zA-Z]	a through z or A through Z, inclusive (range)
		boolean isMatch7 = Pattern.matches("[a-zA-Z]", "9");
		System.out.println("7-"+isMatch7);
  
		//[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
		boolean isMatch8 = Pattern.matches("[a-d[U-Z]]{2}", "aU");
		System.out.println("8"+isMatch8);

		//[a-z&&[def]]	d, e, or f (intersection)
		boolean isMatch9 = Pattern.matches("[0-9&&456]", "4");
		System.out.println(isMatch9);

		//[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
		boolean isMatch10 = Pattern.matches("[a-z&&[^ioq]]", "q");
		System.out.println("10"+isMatch10);

		//[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)
		boolean isMatch11 = Pattern.matches("[a-z&&[^m-p]]", "a");
		System.out.println(isMatch11);

		//X?	X occurs once or not at all
		boolean isMatch12 = Pattern.matches("a?", "b");
		System.out.println("12"+isMatch12);

		//X+	X occurs once or more times
		boolean isMatch13 = Pattern.matches("a+", "b");
		System.out.println(isMatch13);

		//X*	X occurs zero or more times
		boolean isMatch14 = Pattern.matches("a*", "b");
		System.out.println("14"+isMatch14);

		//X{n}	X occurs n times only
		boolean isMatch15= Pattern.matches("a{5}", "aaaaa");
		System.out.println(isMatch15);

		//X{n,}	X occurs n or more times
		boolean isMatch16= Pattern.matches("a{5,}", "aaaaaa");
		System.out.println(isMatch16);

		//X{y,z}	X occurs at least y times but less than or equal to z times
		boolean isMatch17= Pattern.matches("a{5,9}", "aaaaaaaaa");
		System.out.println("17"+isMatch17);

		/*.	Any character (may or may not match terminator)
			\d	Any digits, short of [0-9]
			\D	Any non-digit, short for [^0-9]
			\s	Any whitespace character, short for [\t\n\x0B\f\r]
			\S	Any non-whitespace character, short for [^\s]
			\w	Any word character, short for [a-zA-Z0-9]
			\W	Any non-word character, short for [^\w]
			\b	A word boundary
			\B	A non word boundary*/

		System.out.println(Pattern.matches(".", "s"));
		System.out.println(Pattern.matches("\\d", "0"));
		System.out.println(Pattern.matches("\\D", "s"));
		System.out.println(Pattern.matches("\\s", "\t"));
		
		 String str = "Yamini is bad gril";
		  Pattern pattern = Pattern.compile("\\w+");
		    Matcher matcher = pattern.matcher(str);
		    while (matcher.find()) {
		      System.out.print("Start index: " + matcher.start());
		      System.out.print(" End index: " + matcher.end() + " ");
		      System.out.println(matcher.group());
		    }
		    // now create a new pattern and matcher to replace whitespace with tabs
		    Pattern replace = Pattern.compile("\\s+");
		    Matcher matcher2 = replace.matcher(str);
		    System.out.println(matcher2.replaceAll("****************************"));
		  
		
		
		
	}

}
