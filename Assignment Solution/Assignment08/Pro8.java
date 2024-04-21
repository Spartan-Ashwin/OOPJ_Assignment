package Assignment08;
import java.util.Scanner;

enum DayOfWeek{
	
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FIRDAY,SATURDAY;
	
}

class DayManagementSystem{
	  private	static Scanner sc=new Scanner(System.in);
	  private   static  DayOfWeek[] obj=DayOfWeek.values();
	
	void start() {
		
		while(true) {
			
			System.out.println("1. Print Day");
			System.out.println("2. Get Next Day");
			System.out.println("3. Get Day Number");
			System.out.println("4. Get Weekend Day Of Week");
			System.out.println("5. EXIT");
			System.out.println("Enter you choice");
			int n=sc.nextInt();
			if(n==5) {
				System.out.println("Thank You...");
				break;
			}else if(n==1) {
				
				printDay();
			}else if(n==2) {
				getNextDay();
			}else if(n==3) {
				getDayNumber();
			}else if(n==4) {
			DayOfWeek[] ans=getWeekend();
			for(DayOfWeek ii :ans) {
				System.out.println("*"+ii);
			}
			}
			
		}
	}
	
	DayOfWeek[] getWeekend() {
		DayOfWeek[] arr=new DayOfWeek[2];
		arr[0]=DayOfWeek.SATURDAY;
		arr[1]=DayOfWeek.SUNDAY;
		
		return arr;
		
	}
	void getDayNumber() {
		
		System.out.println("Enter day ");
		String str=sc.next();
		str=str.toUpperCase();
		
		for(DayOfWeek ii :obj) {
			if(ii.name().compareTo(str)==0) {
				System.out.println(ii.ordinal());
				return;
			}
		}
		System.out.println("Invalid...");
		
	
		
	}
	
	void getNextDay() {
		
		System.out.println("Enter Day Number");
		int n=sc.nextInt();
		n++;
		n=n%obj.length;
		for(DayOfWeek ii :obj) {
			if(n==ii.ordinal()) {
				System.out.println(ii);
				return;
			}
		}
		System.out.println("Invalid...");
	}
	
	void printDay() {
		System.out.println("Enter day number");
		int n=sc.nextInt();
		n--;
		
		for(DayOfWeek ii:obj) {
			
			if(ii.ordinal()==n) {
				System.out.println(ii);
				return;
			}
		}
		
		System.out.println("Invalid number");
		
	}
}
public class Pro8 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayManagementSystem obj=new DayManagementSystem();
		obj.start();

	}

}
