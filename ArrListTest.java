package listtest;

import java.util.ArrayList;
import java.util.List;

public class ArrListTest {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		List<String> arr1 = new ArrayList<String>(); //Parent 
		
		     arr.add("Yellow");
	        arr.add("Green");
	        arr.add("White");
	        arr.add("red");
	        arr.add("Grey");
	        arr.add("White");
	        System.out.println(arr.get(0));
	        System.out.println(arr.get(5));
	        
	        arr.set(2, "red"); 
	        
	        System.out.println(arr.indexOf("red"));
	        System.out.println(arr.lastIndexOf("red"));
	        System.out.println(arr.contains("Grey")); 
	        
	       // arr.clear();
	        arr.remove("Grey");
	        
	        List<String> arr3 = arr.subList(2, 5);
	        System.out.println(arr3);
	        
	        for(String a:arr) {
	        	System.out.println(a);
	        }
	}

}
