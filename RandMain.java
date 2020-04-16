package Math;

import java.util.Random;

public class RandMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Random r1=new Random();
    
    for(int i=1;i<=100;i++)
    {
    	System.out.println(r1.nextInt(100));
    	System.out.println(r1.nextInt(100)+100);
    	System.out.println((int)(Math.random()*200+1000));
    }
	}

}
