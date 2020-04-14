package String;

public class String_Comparison {

	public static void main(String[] args) {
		/*
		 * Equals
		 * Compare
		 * Matches
		 */

		String s1="ABC";
		String s2="abc";
		String a="[A-Z]{1,}";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.matches(a));
				
		
		
	}

}
