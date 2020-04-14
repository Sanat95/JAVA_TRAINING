package attra11;

public class Break_Cont {

	public static void main(String[] args) {
		int i= 0;
		while(i<100)
		{ i +=10;
			if(i==50)
			{
				break;
				
			}
			System.out.println(i);
			
			
		}
		System.out.println("Continue start");
       int j=0;
		while(j<100)
		{
			j+=10;
			if(j==50)
			{
				continue;
				
			}
			System.out.println(j);
			
			
		}
	}

}
