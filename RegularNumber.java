package regularexpressions;

public class RegularNumber {

	public static void main(String[] args) {
		
		String patt = "[0-9][0-9]?";
		String str1 = "89";
		System.out.println(str1.matches(patt));
		String patt1 = "[0-9][0-9]?[0-9]?|1000";
		String str2 = "567";
		System.out.println(str2.matches(patt1));
		
		
		
		String patt2 = "99|[1-9][0-9][0-9][0-9]?";
		String str3 = "2993";
		System.out.println(str3.matches(patt2));
	
		String patt3= "2[5-9]|[3-6][0-9]|7[0-5]";
		String str4 = "28";
		System.out.println(str4.matches(patt3));
		
		String patt4= "2[2-6][0-9]|240";
		String str5 = "268";
		System.out.println(str5.matches(patt4));
	}

}
