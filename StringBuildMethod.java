package Math;

public class StringBuildMethod {

	public static void main(String[] args) {
		//Insert,replace,delete,reverse
		
		StringBuilder s1= new StringBuilder("I am fine");
		
		s1.insert(4, "Java");
		
		System.out.println(s1);
		
		s1.replace(3, 6,"Testing");
		System.out.println(s1);
		System.out.println(s1.deleteCharAt(0));
		System.out.println(s1.delete(3, 6));
		
		System.out.println(s1.reverse());
	}

}
