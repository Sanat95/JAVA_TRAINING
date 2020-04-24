package project;

public class Account {
	

	private String Account_type = "Savings";
    private String Full_Name = "";
    private String Acount_Number = "";
    private double Amount=0.0;
    private String Currency_Type="INR";
    
  
	public String getAccount_type() {
		return Account_type;
	}

	public void setAccount_type(String account_type) {
		Account_type = account_type;
	}

	public String getFull_Name() {
		return Full_Name;
	}

	public void setFull_Name(String full_Name) {
		Full_Name = full_Name;
	}

	public String getAcount_Number() {
		return Acount_Number;
	}

	public void setAcount_Number(String acount_Number) {
		Acount_Number = acount_Number;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public String getCurrency_Type() {
		return Currency_Type;
	}


	public void setCurrency_Type(String currency_Type) {
		Currency_Type = currency_Type;
	}
    
    
    
    

    
    public String toString(){
        return "[" + Account_type + "," + Full_Name +" ,"+Acount_Number+","+ Currency_Type+","+Amount+"]";
    }

}
