package String;

public class StringConversion {

	public static void main(String[] args) {
		/*
		 * toString
		 * toBinaryString
		 * toHexaString
		 * toOctalString
		 * 
		 * 
		 */
         int num1=100;
         
         System.out.println(Integer.toString(num1));
         System.out.println(Integer.toBinaryString(num1));
         System.out.println(Integer.toHexString(num1));
         System.out.println(Integer.toOctalString(num1));
         
         String s1="100";
         String s2="101010";
         String s3="64";
         String s4="120";
         
         System.out.println(Integer .parseInt(s1));
         System.out.println(Integer.parseInt(s2, 2));
         System.out.println(Integer.parseInt(s3, 16));
         System.out.println(Integer.parseInt(s4, 8));
	}

}
