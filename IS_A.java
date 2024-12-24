package CoreJava;



class Account{
	double blc;
	String acc_no;
	String cust_name;
	
	void deposit(double amt)
	{
		blc+=amt;
	}
	
	void withdraw(double amt)
	{
		blc -= amt;
	}
	
	void blcEnquiry()
	{
		System.out.println("Available balance is : "+blc);
	}
	
	void roi() {
		System.out.println("Different in Different Account ");
	}
	
	void custDetails()
	{
		System.out.println("Name : "+cust_name);
		System.out.println("Acc no : "+acc_no);
		blcEnquiry();
	}
}

class SavingAccount extends Account{

	@Override
	void roi()
	{
		System.out.println("ROI is 6.5%");
	}
	
	void doorToDoor()
	{
		System.out.println("Cash Collection from Home");
	}
}



class CurrentAccount extends Account{
	Double odLimit;
//	overdraft limit
	int noOfTrans = 500;
	
	void roi() {
		System.out.println("Interest Charged @ 5.5%");
	}
	
}

public class IS_A {
	
	static void commonCaller(Account account)
	{
		if (account instanceof SavingAccount)
		{
		
//			SavingAccount acc = (SavingAccount) account;
//			acc.doorToDoor();
		}
		else {
//			CurrentAccount acc = (CurrentAccount) account;
//			acc.roi();
			
		}
	}
	
	public static void main(String[] args) {
		
		commonCaller(new CurrentAccount());
		
//		SavingAccount obj = new SavingAccount();
//		System.out.println(obj instanceof Account);
//		obj.acc_no = "98765432344";
//		obj.cust_name = "Mohit";
//		obj.blc = 25000;
//		obj.custDetails();
//		obj.doorToDoor();
//		obj.roi();
//		
//		System.out.println("********************************");
//		SavingAccount obj1 = new SavingAccount();
//		obj.acc_no = "987632432344";
//		obj.cust_name = "Amit";
//		obj.blc = 125000;
//		obj.custDetails();
//		obj.doorToDoor();
//		obj.roi();
//		
//		
//		System.out.println("********************************");
//		CurrentAccount obj2 = new CurrentAccount();
//		obj2.acc_no = "987632432344";
//		obj2.cust_name = "Amit";
//		obj2.blc = 125000;
//		obj2.custDetails();
//		obj2.roi();
	}
	
}
