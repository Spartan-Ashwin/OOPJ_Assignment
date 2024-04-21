package Assignment05;
import java.util.Scanner;
class Bank{
	
	Scanner sc=new Scanner(System.in);
	private String name;
	private int accountNumber;
	private double balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	void createAccount() {
		System.out.println("Enter name ");
		String name=sc.nextLine();
		int accNo=(int)Math.ceil(Math.random()*9999);
		this.name=name;
		this.setAccountNumber(accNo);
		this.setBalance(0);
		System.out.println("Account Created Successfully...");
		System.out.println("Your account number is "+ this.getAccountNumber());
	}
	
	void deposite() {
		System.out.println("Enter account Number");
		int accNo=sc.nextInt();
		if(accNo==this.getAccountNumber()) {
			System.out.println("Enter money");
			int money=sc.nextInt();
			this.setBalance(this.getBalance()+money);
			System.out.println("Amount Deposited successfully");
			
		}else {
			System.out.println("Invalid account Number");
		}
	}
	
	void withdraw() {
		System.out.println("Enter account Number");
		int accNo=sc.nextInt();
		if(accNo==this.getAccountNumber()) {
			System.out.println("Enter money");
			int money=sc.nextInt();
			if(this.getBalance()>=money) {
			System.out.println("Amount Withdraw successfully");
			this.setBalance(this.getBalance()-money);
			}else {
				System.out.println("Insufficient Balance");
			}
		}else {
			System.out.println("Invalid account Number");
		}
		
	}
	
	void info() {
		System.out.println("**********************************************");
		System.out.println("Name : "+this.getName());
		System.out.println("Account Number : "+this.getAccountNumber());
		System.out.println("Balance : "+this.getBalance());
		System.out.println("**********************************************");
	}
	
	void accoutBalance() {
		
		System.out.println("Enter account Number");
		int accNo=sc.nextInt();
		if(accNo==this.getAccountNumber()) {
			System.out.println("Balance is "+this.getBalance());
		}else {
			System.out.println("Invalid account Number");
		}
	}
}

class Pro06{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank b1=new Bank();
		while(true) {
			System.out.println("Enter Choice");
			System.out.println("1.Create a new account");
			System.out.println("2.Deposit money into an account");
			System.out.println("3.Withdraw money from an account");
			System.out.println("4.Display the account balance");
			System.out.println("5.Display the account holder's information");
			System.out.println("6.Exit");
			
			int n=sc.nextInt();
			if(n==1) {
				b1.createAccount();
			}else if(n==2) {
				b1.deposite();
			}else if(n==3) {
				b1.withdraw();
			}else if(n==4) {
				b1.accoutBalance();
			}else if(n==5) {
				b1.info();
			}else if(n==6) {
				System.out.println("Thank You.....");
				break;
			}
		}
	
	}
}