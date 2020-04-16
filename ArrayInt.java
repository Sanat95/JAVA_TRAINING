package arraytest;

public class ArrayInt {

	public static void main(String[] args) {
	
		String [] DayofWeek = {"Mon","Tues","Wed","Thur","Fri","Sat","Sun"};
		System.out.println(DayofWeek.length);
		System.out.println(DayofWeek[2]);

		DayofWeek[2] = "RRR";
		System.out.println(DayofWeek[2]);
		
		for (int i=0;i<=DayofWeek.length-1;i++) {
			System.out.println(DayofWeek[i]);
		}
		
		int [] arr1 = {0,2,4,6,8,10};
		char [] arr2 = {'a','e','i','o','u'};
	}

	

}
