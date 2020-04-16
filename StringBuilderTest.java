package Math;

public class StringBuilderTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="I";
		 s1=s1+"  Love";
		s1=s1+"  India";
		
		System.out.println(s1);

		StringBuilder s2= new StringBuilder("I");
		
		s2.append("Like");
		s2.append("Java");
		
		System.out.println(s2);
	}

}
