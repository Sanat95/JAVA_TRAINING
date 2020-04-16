package listtest;

import java.util.LinkedList;

public class LinklistTest {

	public static void main(String[] args) {
		
		LinkedList<Double> list=new LinkedList<Double>(); 
		
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		list.add(1.5);
		list.add(1.6);
		
		System.out.println(list.get(5));
		
		list.set(3, 4.5);
		System.out.println(list.get(3));
		//list.clear();
		System.out.println(list.peekFirst()); 
		System.out.println(list.peekLast());
		System.out.println(list.pollFirst());
		System.out.println(list.pollLast()); 
		
		System.out.println(list);

	}

}
