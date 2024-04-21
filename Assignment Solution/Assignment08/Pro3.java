//package Assignment08;
//import java.util.*;
//
//class User{
//	
//	String name=" ";
//	String email=" ";
//	int  contactnumber;
//	int password;
//	int userindex=-1;
//	
//	User(String name,String emial,int contactnumber){
//		this.name=name;
//		this.email=email;
//		this.contactnumber=contactnumber;
//	}
//	void setPassword(int p){
//		
//		this.password=p;
//	}
//	
//	String vistara=null;
//	String indigo=null;
//	String airindia=null;
//	
//	int vistarai=-1;
//	int vistaraj=-1;
//	
//	int indigoi=-1;
//	int indigoj=-1;
//	
//	int airindiai=-1;
//	int airindiaj=-1;
//}
//
//
//
//
//class AirlineTickeManagementSystem{
//	
//	Scanner sc=new Scanner(System.in);
//	int curr=0;
//	static User[] user=new User[5];
//	
//	static int[][] vistara=new int[3][3];
//	static int[][] indigo=new int[3][3];
//	static int[][] airindia=new int[3][3];
//	
//	static int pos=0;
//	
//	void loginHome(User u) {
//		
//		System.out.println("Welcome "+u.name+"!!!");
//		
//		while(true) {
//			
//			System.out.println("1.Flight Availability");
//			System.out.println("2.SeatReservation");
//			System.out.println("3.View Reservation");
//			System.out.println("4.Cancel Reservation");
//			System.out.println("5.Exit");
//			int n=sc.nextInt();
//			if(n==5) {
//				break;
//			}
//			if(n==1) {
//				flightAvailability();
//			}else if(n==2) {
//				seatReservation(u);
//			}else if(n==3) {
//				viewReservation(u);
//			}else if(n==4) {
//				cancelReservation(u);
//			}
//		}	
//	}
//	
//	void cancelReservation(User u) {
//		
//		
//		if(u.userindex==-1) {
//			System.out.println("You haven't book any seat");
//			return;
//		}
//		
//		System.out.println("Which Airline ticket you want cancle...");
//		System.out.println("1.Vistara");
//		System.out.println("2.Indigo");
//		System.out.println("3.AirIndia");
//		int n=sc.nextInt();
////		System.out.println("Enter seat number of fligh");
////		System.out.println("Enter row of sit");
////		int row=sc.nextInt();
////		System.out.println("Enter column of sit");
////		int col=sc.nextInt();
////		boolean b=false;
////		if(row>=3 & col>=3) {
////			System.out.println("Invalid Seat Number..");
////			return;
////		}
//		
//		if(n==1) {
//			
//			if(u.vistara==null) {
//				System.out.println("You haven't booked vistara ticket");
//				return;
//			}
//			vistara[u.vistarai][u.vistaraj]=0;
//			u.vistara=null;
//			u.vistarai=-1;
//			u.vistaraj=-1;
//			System.out.println("Vistara Ticket Cancel Successfully");
//		}else if(n==2) {
//			
//			if(u.indigo==null) {
//				System.out.println("You haven't booked Indigo ticket");
//				return;
//			}
//			indigo[u.indigoi][u.indigoj]=0;
//			u.indigo=null;
//			u.indigoi=-1;
//			u.indigoj=-1;
//			System.out.println("Indigo Ticket Cancel Successfully");
//		}else if(n==3) {
//			
//			if(u.airindia==null) {
//				System.out.println("You haven't booked AirIndia ticket");
//				return;
//			}
//			airindia[u.airindiai][u.airindiaj]=0;
//			u.airindia=null;
//			u.airindiai=-1;
//			u.airindiaj=-1;
//			System.out.println("AirIndia Ticket Cancel Successfully");
//		}
//		
//	}
//	
//	void viewReservation(User u) {
//		
//		int userindex=u.userindex;
//		if(userindex==-1) {
//			System.out.println("You have not booked seat yet....");
//			return;
//		}
//		
//		if(u.vistara==null && u.indigo==null && u.airindia==null) {
//			System.out.println("You haven't booked yet....");
//			return;
//		}
//		System.out.println("Hello, "+u.name);
//		
//		System.out.println("Your Reservation.........");
//		
//		
//	
//		if(u.vistara!=null) {
//			System.out.println("Flight Name : "+u.vistara);
//			System.out.println("Seat Number : "+u.vistarai+" th row and "+u.vistaraj+" th column");
//		}
//		
//		if(u.indigo!=null) {
//			System.out.println("Flight Name : "+u.indigo);
//			System.out.println("Seat Number : "+u.indigoi+" th row and "+u.indigoj+" th column");
//		}
//		if(u.airindia!=null) {
//			System.out.println("Flight Name : "+u.airindia);
//			System.out.println("Seat Number : "+u.airindiai+" th row and "+u.airindiaj+" th column");
//		}
//		
//		
//		
//	}
//	
//	
//    void seatReservation(User u) {
//		
//		System.out.println("Which Airline you would like choose");
//		System.out.println("1.Vistara");
//		System.out.println("2.Indigo");
//		System.out.println("3.AirIndia");
//		int n=sc.nextInt();
//		if((n==1 && u.vistara!=null)) {
//			System.out.println("Vistara alredy booked...");
//			return;
//		}else if((n==2 && u.indigo!=null)) {
//			System.out.println("Indigo alredy booked...");
//			return;
//		}else if((n==3 && u.airindia!=null)) {
//			System.out.println("Airindia alredy booked...");
//			return;
//		}
//		if(n>3 || n<1) {
//			System.out.println("Invalid Choice");
//			return;
//		}
//		System.out.println("Enter seat number of fligh");
//		System.out.println("Enter row of sit");
//		int row=sc.nextInt();
//		System.out.println("Enter column of sit");
//		int col=sc.nextInt();
//		boolean b=false;
//		if(row>=3 & col>=3) {
//			System.out.println("Invalid Seat Number..");
//			return;
//		}
//		
//		if(n==1) {
//			if(vistara[row][col]==0 && u.vistara==null) {
//				vistara[row][col]=1;
//				u.vistara="Vistara";
//				u.vistarai=row;
//				u.vistaraj=col;
//				b=true;
//				System.out.println("Vistara Seat Booked Successfully...");
//				
//			}else {
//				System.out.println("Seat is already booked...");
//			}
//			
//			
//		}else if(n==2){
//			
//			if(indigo[row][col]==0 && u.indigo==null) {
//				indigo[row][col]=1;
//				u.indigo="indigo";
//				u.indigoi=row;
//				u.indigoj=col;
//				b=true;
//				System.out.println("Indigo Seat Booked Successfully...");
//				
//			}else {
//				System.out.println("Seat is already booked...");
//			}
//			
//		}else if(n==3) {
//			
//			if(airindia[row][col]==0 && u.airindia==null) {
//				airindia[row][col]=1;
//				u.airindia="airindia";
//				u.airindiai=row;
//				u.airindiaj=col;
//				b=true;
//				System.out.println("AirIndia Seat Booked Successfully...");
//				
//			}else {
//				System.out.println("Seat is alread booked...");
//			}
//		
//		}else {
//			System.out.println("Invalid Choice");
//		}
//		
//		if(b) {
//			u.userindex=pos;
//			pos++;
//		}
//	}
//	
//	void flightAvailability() {
//		
//		System.out.println("Vistara Airline Seats Available...");
//		for(int i=0;i<vistara.length;i++) {
//			
//			for(int j=0;j<vistara.length;j++) {
//				System.out.print(vistara[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//        System.out.println("Indigo Airline Seats Available...");
//		
//		for(int i=0;i<indigo.length;i++) {
//			
//			for(int j=0;j<indigo[i].length;j++) {
//				System.out.print(indigo[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//         System.out.println("AirIndia Airline Seats Available...");
//		
//		for(int i=0;i<airindia.length;i++) {
//			
//			for(int j=0;j<airindia[i].length;j++) {
//				System.out.print(airindia[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//	}
//	void createUser() {
//		
//		
//		if(curr<user.length) {
//			
//			String name,email;
//			int contactnumber;
//			System.out.println("Enter Name : ");
//			name=sc.next();
//			System.out.println("Enter Email : ");
//			email=sc.next();
//			System.out.println("Enter contact number : ");
//			contactnumber=sc.nextInt();
//			
//			User u=new User(name,email,contactnumber);
//			System.out.println("Set password : ");
//			int pass=sc.nextInt();
//			u.setPassword(pass);
//			user[curr]=u;
//			curr++;
//			System.out.println("User has been successfully Register");
//			
//		}else {
//			System.out.println("Your regestration stopped !!");
//		}
//	}
//	
//	void login() {
//		
//		String email;
//		int pass;
//		System.out.println("Enter Email id : ");
//		email=sc.next();
//		System.out.println("Enter password : ");
//		pass=sc.nextInt();
//		
//		System.out.println(email+"&"+pass);
//		
//		User u=check(email,pass);
//		
//		if(u==null) {
//			System.out.println("Invalid Credential...");
//		}else {
//			loginHome(u);
//			
//		}
//	}
//	
//	User check(String e,int p) {
//	
//		for(int i=0;i<=curr;i++) {
//			
//			if(user[i]==null) {
//				continue;
//			}
//			 String email=user[i].name;
//			 int pass=user[i].password;
//			if(email.equals(e) && pass==p) {
//				return user[i];
//			}
//		}
//		return null;
//	}
//	
//	void startApp() {
//		
//		
//		while(true) {
//			
//			System.out.println("********Airline Ticke Management System***********");
//			System.out.println("1.Signup");
//			System.out.println("2.Login");
//			System.out.println("3.EXIT");
//			int n=sc.nextInt();
//			if(n==3) {
//				System.out.println("Thank You!!");
//				break;
//			}else if(n==1) {
//				
//				createUser();
//				
//			}else if(n==2) {
//				
//				login();
//				
//			}else {
//				
//				for(int i=0;i<user.length;i++) {
//					System.out.print(user[i]+" * ");
//				}
//				System.out.println("Invalid choice");
//			}
//	}
//	
//}
//	
//}
//
//
//public class Pro3{
//	
//	public static void main(String[] args) {
//		AirlineTickeManagementSystem a=new AirlineTickeManagementSystem();
//		a.startApp();
//		
//		
//	}
//}