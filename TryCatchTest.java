package exceptiontest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class TryCatchTest {

	public static void main(String[] args) {
		Test();
	}
	
	public static void Test() {
		try {
			FileInputStream x = new FileInputStream("C:\\\\Users\\\\User\\\\eclipse-workspace\\\\TEST\\\\abc.txt");
		} catch (FileNotFoundException e) { 
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		} catch (Exception e1) { 
			System.out.println(e1.getMessage());
		}
	}


}
