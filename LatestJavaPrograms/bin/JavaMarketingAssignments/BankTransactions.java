package JavaMarketingAssignments2;

import java.util.Scanner;

public class BankTransactions {

	public static void main(String[] args) {
		
		BankTransactions b=new BankTransactions();
		System.out.println("Select the option from Below");
		System.out.println("1.OPEN  NEW ACCOUNT");
		System.out.println("2.DEPOSIT AMOUNT");
		System.out.println("3.WITHDRAW");
		System.out.println("4.UPDATE ACCOUNT");
		System.out.println("5.CLOSE");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		
		switch(option){
		case 1:b.accountOpen();
			
			break;
		case 2:b.deposit();
			
			break;
		case 3:b.withdraw();
		
			break;
		case 4:b.update();
		break;
		case 5: b.accountClose();
		break;
			
		
		}
		
		
	}
	public void deposit()
	{
		
	}
	public void accountOpen()
		{
		
		
	}
	
	public void accountClose()
	{
		
	}
	public void withdraw()
	{
		
	}
	
	public void update()
	{
		
	}
	

}
