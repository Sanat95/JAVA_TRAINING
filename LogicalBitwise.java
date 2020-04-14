package attra11;

public class LogicalBitwise {

	public static void main(String[] args) {
		/* && -- Logical And
		 * || --  Logical OR
		 * ! -- Logical Not
		 * & -- Bitwise And
		 * | -- Bitwise OR
		 * ~  -Bitwise Compliment 
		 */

		
		boolean a= true;
		boolean b= false;
		
		System.out.println(a&&b);
		System.out.println(a||b);
		System.out.println(!a);
		
		int num1= 45;
		int num2=35;
		
		System.out.println(num1&num2);
		System.out.println(num1|num2);
		System.out.println(~num2);
	}

}
