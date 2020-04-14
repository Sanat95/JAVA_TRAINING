package String;

public class StringSlice {

	public static void main(String[] args) {
           /*
            * Char at
            * Substring
            * Split
            */
		
		String s1="Abcdef";
		System.out.println(s1.charAt(0));

		System.out.println(s1.substring(3));
		System.out.println(s1.substring(2, 5));
		
		//Reverse a string 
		String temp="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			temp=temp+s1.charAt(i);
		}
		
		System.out.println(temp);
	}

}
