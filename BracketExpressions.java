package regularexpressions;

public class BracketExpressions {

	public static void main(String[] args) {
		
		String patt = "[+]dt";
		String str = "+dt";
		System.out.println(str.matches(patt));
		
		
		String patt1 ="[+]\\d\\s\\d{3}-\\d{3}-\\d{4}";
		String str1 = "+1 3452-574-67867";
		System.out.println(str1.matches(patt1));
		
		String patt2 = "[A-za-z0-9]";
		String str2 = "c";
		System.out.println(str2.matches(patt2));
		
		String patt3 ="[+]\\d{1,}\\s\\d{1,}-\\d{1,}-\\d{1,}";
		String str3 = "+1 3452-574-67867";
		System.out.println(str3.matches(patt3));

	}

}
