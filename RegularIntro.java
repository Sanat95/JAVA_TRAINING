package regularexpressions;

public class RegularIntro {

	public static void main(String[] args) {
		/*
		 * A regular expression (regex) defines a search pattern for strings.
		 * The pattern can be a simple characters ,a fixed string or a complex expression containing special characters and number
		 */
  String str1="+1-123-1223-(1234)";
		
  String str2=str1.replace("+","").replace("-", "").replace("(", "").replace(")","");
  
  //System.out.println(str2);
  
  String patt="[^A-Za-z0-9]";
  
  String str3=str1.replaceAll(patt, "");
  
  System.out.println("Test"+str3);
	}

}
