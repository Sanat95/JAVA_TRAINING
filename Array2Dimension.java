package arraytest;

public class Array2Dimension {

	public static void main(String[] args) {
		String [][] arr= {{"x","y","z"},{"UK","USA"},{"IND","EGP","USD","PHP"}};
		System.out.println(arr.length);
		System.out.println(arr[1].length);
		System.out.println(arr[2][2]);
		
		for(String[] x: arr) {
			for(String y : x) {
				System.out.println(y);
			}
			System.out.println("--------------------");
		}
	}

}
