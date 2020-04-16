package arraytest;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		int [] arr = {6,8,11,37,78};
        int j =	arr.length-1;
        int temp = 0;
        
		for(int i = 0;i<=(arr.length-1)/2;i++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] =temp;
			j--;			
		}
		for(int n:arr) {
			System.out.println(n);		
		}

	}

}
