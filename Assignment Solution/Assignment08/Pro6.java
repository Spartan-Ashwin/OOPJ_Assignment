//package Assignment08;
//
//import java.util.*;
//class SalesPerson{
//	
//	String name;
//	String id;
//	double[] sales=new double[12];
//}
//
//class SalesManagementSystem{
//	
//	Scanner sc=new Scanner(System.in);
//	static SalesPerson[] sp=new SalesPerson[10];
//	static int userIndex=0;
//	
//	void start() {
//	
//		System.out.println("Welcome Admin");
//		System.out.println("Enter username");
//		String username=sc.next();
//		System.out.println("Enter password");
//		int password=sc.nextInt();
//		String u="admin";
//		int p=123;
//		if(u.equals(username) && p==password) {
//			loginHome();
//		}else {
//			System.out.println("Invalid Credential....");
//		}
//	}
//	
//	void loginHome() {
//		
//		
//		while(true) {
//			System.out.println("1.Add a new Salesperson.");
//			System.out.println("2.Update an existing salesperson.");
//			System.out.println("3.View total sales for a salesperson");
//			System.out.println("4.View total sales for all salespersons");
//			System.out.println("5.Exit the program");
//			int n=sc.nextInt();
//			if(n==5) {
//				System.out.println("Thank You....");
//				break;
//			}else if(n==1) {
//				addSalesPerson();
//			}else if(n==2) {
//				updateSalesPerson();
//			}else if(n==3) {
//				
//				oneSalePersonSell();
//			}else if(n==4) {
//				allSalePersonSell();
//			}
//		}
//	}
//	
//	void allSalePersonSell() {
//		
//		System.out.println("Total Sales of each sales person : ");
//		
//		for(int i=0;i<sp.length;i++) {
//			
//			SalesPerson obj =sp[i];
//			if(obj!=null) {
//				double sum=totalSum(obj);
//				System.out.println(obj.id +" "+obj.name +" ==> "+sum);
//			}
//			
//		}
//	}
//	void oneSalePersonSell() {
//		
//
//		System.out.println("Enter salesperson id : ");
//		String id=sc.next();
//		SalesPerson obj=getPerson(id);
//		if(obj==null) {
//			System.out.println("User doesn't exist....");
//		}else {
//			
//			System.out.println("ID   : "+obj.id);
//			System.out.println("Name : "+obj.name);
//			for(int i=0;i<12;i++) {
//				System.out.println(i+1 +" ===> "+obj.sales[i]);
//			}
//			
//			System.out.println("****************************");
//			System.out.println("Total sum = "+(totalSum(obj)));
//			System.out.println("****************************");
//			
//			
//		}
//		
//	}
//	
//	double totalSum(SalesPerson obj) {
//		
//		double ans=0;
//		
//		for(int i=0;i<12;i++) {
//			ans+=obj.sales[i];
//		}
//		return ans;
//	}
//	void updateSalesPerson() {
//		
//		System.out.println("Enter salesperson id : ");
//		String id=sc.next();
//		SalesPerson obj=getPerson(id);
//		if(obj==null) {
//			System.out.println("User doesn't exist....");
//		}else {
//			int exit=-1;
//			do {
//				System.out.println("Enter month you want to updatate");
//				int month=sc.nextInt();
//				System.out.println("Enter sales amount ");
//				double amount=sc.nextDouble();
//				if(month>0)
//				obj.sales[month-1]=amount;
//				else
//					System.out.println("Invalid month");
//				System.out.println("Press 1 for continue");
//				System.out.println("Press 2 for exit");
//				exit=sc.nextInt();
//				if(exit==2) {
//					break;
//				}
//			}while(true);
//		}
//		
//	}
//	
//	SalesPerson getPerson(String ii) {
//		
//		for(int i=0;i<sp.length;i++) {
//			SalesPerson p=sp[i];
//			if(p==null) {
//				continue;
//			}
//			
//			String iii=p.id;
//			if(ii.equals(iii)) {
//				return p;
//			}
//		}
//		return null;
//	}
//	
//	void addSalesPerson() {
//		
//		System.out.println("Enter name : ");
//		String name=sc.next();
//		System.out.println("Enter id : ");
//		String id=sc.next();
//		if(isUnique(id)) {
//			SalesPerson obj=new SalesPerson();
//			obj.name=name;
//			obj.id=id;
//			System.out.println("Enter Past 12 months sales figure");
//			for(int i=0;i<12;i++ ) {
//				System.out.println(i+1 +" month");
//				obj.sales[i]=sc.nextDouble();
//				
//			}
//			if(userIndex<10) {
//				sp[userIndex]=obj;
//				userIndex++;
//			}else {
//				System.out.println("You can not add more sales person....");
//			}
//			
//			
//		}else {
//			System.out.println("on this id sales person is already exist...");
//		}
//	}
//	
//	boolean isUnique(String ii) {
//		
//			for(int i=0;i<sp.length;i++) {
//				
//				SalesPerson p=sp[i];
//				if(p==null) {
//					continue;
//				}
//				
//				String iii=p.id;
//				if(ii.equals(iii)) {
//					return false;
//				}
//			}
//		return true;
//	}
//}
//public class Pro6 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		SalesManagementSystem obj =new SalesManagementSystem();
//		obj.start();
//	}
//
//}
