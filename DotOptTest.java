package regularexpressions;

public class DotOptTest {

	public static void main(String[] args) {
		String patt = "ABC.";
		String str1 = "ABCD";
		String patt1 = "ABCD.*";
		String str2 = "ABCDskhfkjhgjsjsh";
		System.out.println(str1.matches(patt));
		System.out.println(str2.matches(patt1));
		

	}

}
