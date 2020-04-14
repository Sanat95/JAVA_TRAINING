package String;

public class Basic_string_opraion {

	public static void main(String[] args) {
		/*Concatenate
		 * length
		 * Trim
		 * Upper case
		 * Lower Case
		 * Empty
		 */
         
		String s1="HII";
		String s2="Everyone";
		String s3="";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println("-----------------------");
		
		String s4="   dghgdh    ";
		System.out.println(s4);
		System.out.println(s4.trim());
		
		System.out.println("------------");
		String s5="AsddAADdd";
		
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		System.out.println("---------------");
		
		String s6="";
		System.out.println(s6.isEmpty());
		
	}

}
