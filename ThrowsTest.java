package exceptiontest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ThrowsTest {

	public static void main(String[] args) throws FileNotFoundException {
		Test();

	}
public static void Test() throws FileNotFoundException {
		
		FileInputStream x = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\TEST\\abc.txt");
	}

}
