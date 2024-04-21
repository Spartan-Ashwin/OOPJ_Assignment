//package Assignment08;
//import java.util.*;
//
//class User{
//	
//	String name;
//	String email;
//	int password;
//    User(String name, String email, int password) {
//		super();
//		this.name = name;
//		this.email = email;
//		this.password = password;
//	}
//    
//    int[][] bookings=new int[5][5];
//    int[][] utr=new int[5][5];
//    int total;
//		
//}
//
//class MovieTicketManagentSystem{
//	Scanner sc=new Scanner(System.in);
//	static String adminUser="admin";
//	static int  adminpassword=123;
//	static int[][]  ticket=new int[5][5];
//	static int sold=0;
//	static User[] user=new User[25];
//	static int userIndex=0;
//	
//	
//	void start() {
//		
//		System.out.println("*****Welcome to Movie Ticket Management System*****");
//		
//		while(true) {
//			System.out.println("1.Customer");
//			System.out.println("2.Admin");
//			System.out.println("3.EXIT");
//			int n=sc.nextInt();
//			if(n==3) {
//				System.out.println("Thank You...");
//				break;
//			}else if(n==1) {
//			 customer();
//			}else if(n==2) {
//				admin();
//			}else {
//				System.out.println("Invalid");
//			}
//		}
//	}
//	
//	void admin() {
//		System.out.println("Welcome Admin....");
//		System.out.println("Enter username");
//		String username=sc.next();
//		System.out.println("Enter password");
//		int pass=sc.nextInt();
//		
//		if(username.equals(adminUser) && pass==adminpassword) {
//			System.out.println("Total Sold out seatst : "+sold);
//			System.out.println("Pirce of each seat    : "+100+"RS.");
//			System.out.println("Total Revenue         : "+(sold*100)+"Rs.");
//			
//			System.out.println("Chart of Seats...");
//			displayChart();
//			
//		}else {
//		System.out.println("Invalid Credential...");
//		}
//		
//	}
//	
//	void customer() {
//		
//		while(true) {
//			System.out.println("1.SignUP");
//			System.out.println("2.Login");
//			System.out.println("3.EXIT");
//			int n=sc.nextInt();
//			if(n==3) {
//				break;
//			}else if(n==1) {
//				signup();
//			}else if(n==2) {
//				login();
//			}else {
//				System.out.println("Invalid");
//			}
//			
//		}
//		
//	}
//	
//	void loginHome(User u) {
//		
//		while(true) {
//			System.out.println("Hi, "+u.name);
//			
//			System.out.println("1.Chart of availabel and sold seats");
//			System.out.println("2.Book Ticket");
//			System.out.println("3.My Bookings");
//			System.out.println("4.Exit");
//			int n=sc.nextInt();
//			if(n==3) {
//				myBookings(u);
//			}else if(n==1) {
//				
//				displayChart();
//			}else if(n==2) {
//				
//				bookTicket(u);
//			}else if(n==4) {
//				break;
//			}else {
//				System.out.println("Invalid");
//			}
//		}
//		
//	}
//	
//	void myBookings(User u) {
//		
//		if(u.total==0) {
//			System.out.println("You have not booked any seat yet...");
//			return;
//		}
//		
//		System.out.println(u.name+" bookings : ");
//		
//		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				
//				if(u.bookings[i][j]!=0) {
//					System.out.println("Seat Numbr : "+i+"th row and "+j+" th column.");
//					System.out.println("UTR Number : "+u.utr[i][j]);
//				}
//			}
//		}
//		
//		
//	}
//	
//	void bookTicket(User u) {
//		
//		while(true) {
//			
//			System.out.println("1.Want to Book Ticket..");
//			System.out.println("2.EXIT");
//			int n=sc.nextInt();
//			if(n==1) {
//				
//				System.out.println("Enter Seat Position...");
//				System.out.println("Enter Row number : ");
//				int row=sc.nextInt();
//				System.out.println("Enter Column number : ");
//				int col=sc.nextInt();
//				
//				if(row>=5 || col>=5) {
//					System.out.println("Invalid Position");
//					return;
//				}
//				if(ticket[row][col]==0) {
//					ticket[row][col]=1;
//					u.bookings[row][col]=1;
//					int ut=(int)Math.ceil(Math.random()*99999);
//					u.utr[row][col]=ut;
//					u.total++;
//					sold++;
//				}else {
//					System.out.println("Seat is already sold....");
//				}
//				
//			}else if(n==2) {
//				break;
//			}else {
//				System.out.println("Invalid");
//			}
//		}
//		
//	}
//	
//	void displayChart() {
//		System.out.println("*****0==> Available 1==> Sold*****");
//		for(int i=0;i<ticket.length;i++) {
//			for(int j=0;j<ticket[i].length;j++) {
//				System.out.print(ticket[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//	}
//	
//	void login() {
//		System.out.println("Enter email : ");
//		String email=sc.next();
//		System.out.println("Enter password");
//		int pass=sc.nextInt();
//		
//		User u=check(email,pass);
//		
//		if(u==null) {
//			System.out.println("Invalid Credential");
//		}else {
//			loginHome(u);
//			
//		}
//		
//	}
//	
//	User check(String email,int pass) {
//		
//		for(int i=0;i<user.length;i++) {
//			User u=user[i];
//			if(u==null) {
//				continue;
//			}
//			String e=u.email;
//			int p=u.password;
//			if(e.equals(email) && p==pass) {
//				return u;
//			}
//		}
//		return null;
//	}
//	
//	void  signup() {
//		
//		System.out.println("Enter Name : ");
//		String name=sc.next();
//		System.out.println("Enter Email : ");
//		String email=sc.next();
//		System.out.println("Enter Password : ");
//		int pass=sc.nextInt();
//		User u=new User(name,email,pass);
//		user[userIndex]=u;
//		userIndex++;
//		System.out.println("Signup Successfully....");
//	}
//}
//
//public class Pro4 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		MovieTicketManagentSystem obj =new MovieTicketManagentSystem();
//		obj.start();
//
//	}
//
//}
