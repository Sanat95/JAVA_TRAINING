package listtest;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListItrTest {

	public static void main(String[] args) {
		LinkedList<String> List=new LinkedList<String>(); 
		
		List.add("ABC");  
		List.add("XYZ");  
		List.add("TYU");  
		List.add("UIJH");  

	/*	ListIterator itr = List.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		ListIterator itr = List.listIterator(List.size());
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		System.out.println(List);
		
	}

}
