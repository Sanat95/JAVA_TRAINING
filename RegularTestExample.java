package regularexpressions;

public class RegularTestExample {

	public static void main(String[] args) {
		String patt = "www\\.(dezlearn|dez)\\.(com|us)";
		String str1 = "wwwlearn.us";
		
		System.out.println(str1.matches(patt));
	}

}
