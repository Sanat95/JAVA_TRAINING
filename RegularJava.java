package regularexpressions;

public class RegularJava {

	public static void main(String[] args) {
		String patt= "abc*";
		String str1="ab";
		System.out.println("abc*" + " "+ str1.matches(patt));

		String patt1= "abc+";
		String str2="ab";
		System.out.println( "abc+... atleast one c should be in str2: " + " " +str2.matches(patt1));
		
		
		String patt2= "abc?";
		String str3="ab";
		System.out.println("abc?" + " " +str3.matches(patt2));
		
		
		String patt3= "ab(gae)?";
		String str4="ab";
		System.out.println( "ab(gae)?" + " " +str4.matches(patt3));
		
		String patt4= "ab(gae)+";
		String str5="ab";
		System.out.println("ab(gae)+..atleast one (gae) should be in str5:" + " " + str5.matches(patt4));
		
		String patt5= "ab(gae)*";
		String str6="ab";
		System.out.println("ab(gae)*" + " " +str6.matches(patt5));
		
		String patt6= "ab(ae){3}";
		String str7="abaeae";
		System.out.println("ab(ae){3} should have exactly 3 times (ae)" + " " +str7.matches(patt6));
		
		String patt7= "ab(ae){2,5}";
		String str8="abaeaeaeaeaeae";
		System.out.println("ab(ae){2,5} should have min 2 times and max 5 (ae)" + " " +str8.matches(patt7));

		String patt8= "ab(ae){2,}";
		String str9="abaeaeaeaeaeaeaeaeaeaeaeaeae";
		System.out.println("ab(ae){2,} should have min 2 times and max any (ae)" + " " +str9.matches(patt8));
	}

}
