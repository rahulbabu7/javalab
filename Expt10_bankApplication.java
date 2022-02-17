package lab21;

import java.util.Scanner;
class bankAcc
{
	Scanner sc = new Scanner(System.in);
	int accNum,bal,accNum2,accNumd,accNumw,dep,take;
	String acctype,name;
	
	void details()
	{
		System.out.print("Enter Account No: ");
		accNum = sc.nextInt();
		System.out.print("Enter Account type: ");
		acctype = sc.next();
		System.out.print("Enter Name: ");
		name = sc.next();
		System.out.print("Enter Balance: ");
		bal = sc.nextInt();
	}
	
	void display()
	{
			System.out.println("Name of account holder: "+name);
			System.out.println("Account no.: "+accNum);
			System.out.println("Account type: "+acctype);
			System.out.println("Balance: "+bal);
	}
	
	void search(bankAcc[] num ,int accNum2,int n)
	{
		int k=0;
		for (int i=0;i<n;i++){
			if (num[i].accNum == accNum2){
				num[i].display();
				k=1;
			}
		}
		if (k != 1)
			System.out.println("Invalid Account Number !");
	}
	
	void deposit(bankAcc[] num ,int accNumd,int n)
	{
		int k=0;
		for (int i=0;i<n;i++){
			if (num[i].accNum == accNumd){
				k=1;
				num[i].display();
				
				try {
					System.out.print("Enter the amount you want to deposit: ");
					dep = sc.nextInt();
					if (dep <= 0) {
						throw new InvalidAmountException ("Invalid amount; amount<=0");
					}
					num[i].bal+=dep;
					System.out.println("Balance after deposit: "+num[i].bal);
				}
				catch (InvalidAmountException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		if (k != 1) {
			System.out.println("Invalid Account Number !");
		}
	}
	
	void withdraw(bankAcc[] num ,int accNumw,int n)
	{
		int k=0;
		for (int i=0;i<n;i++){
			if (num[i].accNum == accNumw){
				k=1;
				num[i].display();
				
				try {
					System.out.print("Enter the amount you want to withdraw: ");
					take = sc.nextInt();
					
					if (take <= 1000) {
						throw new InvalidAmountException ("Invalid amount; amount<=1000");
					}
					else if (take >= num[i].bal) {
						throw new InsufficientFundsException ("Your balance is less than "+num[i].bal+"\n	Transaction failed...!!");
					}
					
					num[i].bal-=take;
					System.out.println("Balance after withdrawal: "+num[i].bal);
				}
				catch (InvalidAmountException e) {
					System.out.println(e.getMessage());
				}
				catch (InsufficientFundsException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		if (k != 1) {
			System.out.println("Invalid Account Number !");
		}
	}
}

public class Expt10_bankApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		bankAcc b = new bankAcc();
		
		System.out.println("How many number of customers do you want to input? ");
		int n = sc.nextInt();
		bankAcc [] customer = new bankAcc[n];
		for (int i=0; i<n; i++)
		{
			customer[i] = new bankAcc();
			customer[i].details();
			System.out.println();
		}
		
		do {
			System.out.println("\n  **Banking System Application**");
			System.out.println(" 1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5. Exit \n");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice)
			{
				case 1:
					for (int i=0; i<n; i++)
					{
						customer[i].display();
						System.out.println();
					}
					break;
					
				case 2:
					System.out.print("Enter account no. you want to search: ");
					int accNum2 = sc.nextInt();
					customer[0].search(customer,accNum2,n);					
					break;
					
				case 3:System.out.print("Enter Account no. : ");
					int accNumd = sc.nextInt();
					customer[0].deposit(customer,accNumd,n);
					break;
					
				case 4:System.out.println("Enter Account No. : ");
					int accNumw = sc.nextInt();
					customer[0].withdraw(customer,accNumw,n);
					break;
					
				case 5:System.out.println("See you soon...\r\n"
						+ "***********\r\n"
						+ "    Thank You :) Visit again\r\n"
						+ "************\r\n"
						+ "");
					return;
				default:System.out.println("# enter number between 1 and 5.");
				break;
			}
		}while(choice!=5);
	}
}

class InvalidAmountException extends Exception{
	private String message;
	public InvalidAmountException(String msg){
		message = msg;
	}
	public String getMessage(){
		return message;
	}
}
class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String s){
		super(s);
	}
}
