package exceptiontest;

public class FinallyTest {

	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 0;
		
		try {
			int num3 = num1/num2;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally Block code");
		}

	}

}
