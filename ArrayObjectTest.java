package arraytest;

public class ArrayObjectTest {

	public static void main(String[] args) {
		 Object [][] arr = 
   	      {
   	      {"SKM",25,5.5,'M'},
   		  {"BJK",28,4.8,'M'},
   		  {"TKM",29,5.9,'M'},
   		  {"MKM",36,5.7,'F'},
   		  };
     for(Object [] x: arr) {
   	  for(Object y: x) {
   		  System.out.print(y+ " ");
   	  }
     System.out.println("\n");
     }

	}

}
