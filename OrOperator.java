package regularexpressions;

public class OrOperator {

	public static void main(String[] args) {

		String patt = "a(b|c|d|xyz|123)";
		
		String str = "a123";
		System.out.println(str.matches(patt));

	}

}
