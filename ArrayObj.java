package arraytest;

public class ArrayObj {

	public static void main(String[] args) {
      int [] arr1 = new int [10];
		
		arr1[0]  = 12;
		arr1[1] = 24;
		arr1[2] = 56;
		arr1[9] = 84;
		
		for(int i =0;i<=arr1.length-1;i++) {
		System.out.println(arr1[i]);
		}

	}

}
