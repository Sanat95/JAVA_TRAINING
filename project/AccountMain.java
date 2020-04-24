package project;

import java.util.*;
import java.util.Scanner;

public class AccountMain {
	
	public static void main(String[] args) {
		
		ArrayList<Account> Data = new ArrayList<Account>();
		Scanner input = new Scanner(System.in);
	
        char  ch='Y';
        //int i=0;
      
    	  
		while(true)
		{
			Account account=new Account();
			int i=0;
		System.out.println("Please Select Account Type"+"\n" +"1.Saving" +"\n"+"2..Current");
		
		i=input.nextInt();
		
		switch(i)
		 {
			 case 1:  account.setAccount_type("SAVAING");
		      break;
			 case 2:account.setAccount_type("CURRENT");
			 break;
			 default : account.setAccount_type("SAVING");;
			
		 }
		input.nextLine();  //To consume new line
		 
		 
		System.out.println("Please Enter Full Name");
		String Name=input.nextLine();
		if(Name!=null && Name.length()>0) {
		account.setFull_Name(Name);
		}
		else {
			System.out.println("You Enter Worng Data");
			continue ;
		}
		System.out.println("Please Enter Account Number");
		String Acc_Num=input.nextLine();
		String s2="\\d{15,19}";
		if(Acc_Num.length()>14 && Acc_Num.matches(s2) )
		{
		account.setAcount_Number(Acc_Num);
		}
		else {
			System.out.println("You Entered Wrong Data");
			continue;
		}
		System.out.println("Please Enter Currency");
		String Cr_Type=input.nextLine();
		if(Cr_Type.length()==3)
		{	
			account.setCurrency_Type(Cr_Type);
		}
		else {
			System.out.println("We Enter Wrong Data");
			continue;
		}
		System.out.println("Please Enter Ammount");
		double Amt=input.nextDouble();
		account.setAmount(Amt);
		
		    
		
	        Data.add(account);
	        
	        int size = Data.size();    
	       
	        System.out.println("Number of Account open is " + size);

	        System.out.println("Are you want to Open another Account if Yes then Press Y or Else press N");
	       char c = input.next().charAt(0);
	       if(c=='Y')
	       {
	    	   continue;
	       }
	       else {
	    	   ch='N';
	    	  
	    	    break;
	       }
	       
		} 
		System.out.println("The Data Present inside ArrayList is ");
		System.out.println("------------------------------------");
		Iterator  Itr=Data.iterator();
		while(Itr.hasNext()){  
			System.out.println(Itr.next());  
			}  
	
       System.out.println("----------------------------");
       String Acc_Num1=input.nextLine();
     
      while(true)
      {
    	  System.out.println("Which operation you want to do "+"\n"+"1.  BALANCE INQURY"+"\n"+
    				"2.  DELETE THE ACCOUNT"+"\n"+"3.  DEPOSITE "+"\n"+"4.  CASH WITHDRWAL");
          
    	  System.out.println("Eneter The Opation");
          int K=input.nextInt();
          input.nextLine(); 
       switch(K)
       {
       case 1: System.out.println("Well come to  Balance Inquery");
               System.out.println("Please Enter The Account Number");
                Acc_Num1=input.nextLine();
    	   for (int j = 0; j < Data.size(); j++) {
	 	        if (Data.get(j).getAcount_Number().equals(Acc_Num1)) {
	 	          System.out.println(Data.get(j).getAmount());
	 	            break;
	 	        }
	 	        else {
	 	        	System.out.println("The Enter Account Numbver is Invaild");
	 	        }
	 	        }
    	   break;
       case 2:System.out.println("This operation Delete your account Permantly ");
        System.out.println("Enter The Account Number");
        Acc_Num1=input.nextLine();
           for (int j = 0; j < Data.size(); j++) {
	        if (Data.get(j).getAcount_Number().equals(Acc_Num1)) {
	             Data.remove(j);
	            break;
	        }
	        else {
	        	System.out.println("The Entered Account Number is Invalid");
	        }
	        }
       break;
       case 3:System.out.println("It is for Deposite");
              System.out.println("Enter the Ammount for Deposite");
              double x=input.nextDouble();
          for (int j = 0; j < Data.size(); j++) {
	        if (Data.get(j).getAcount_Number().equals(Acc_Num1)) {
	        	Data.get(j).setAmount((Data.get(j).getAmount()+x));
	            break;
	        }
	        else {
	        	System.out.println("The Entered Account Number is Invalid");
	        }
	        }
       
               break;
               
       case 4: System.out.println("It is for Cash Withdrawl");
       System.out.println("Enter the Ammount for Deposite");
       double y=input.nextDouble();
      for (int j = 0; j < Data.size(); j++) {
     if (Data.get(j).getAcount_Number().equals(Acc_Num1)) {
    	    if(Data.get(j).getAmount()<y)
    	    {
    	    	System.out.println("Insufficent fund");
    	    }
    	    else {
    	    	Data.get(j).setAmount((Data.get(j).getAmount()-y));
    	    }
    	    break;
     }
     else {
    	 System.out.println("The Entered Account Number is Invalid");
     }
     break;
     }
       default: System.out.println("Thanks you "); 
       }//Switch case end
       System.out.println("Are you want to Contunue the Operation Press Y for yes or Press N for no");
       char d = input.next().charAt(0);
       if(d=='Y')
       {
    	   continue;
       }
       else {
    	   ch='N';
    	  
    	    break;
       }
      } //While loop End
	}

	
}