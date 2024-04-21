package Assignment05;
import java.util.Scanner;
import java.time.*;

class MyDate{
	
	
	int day;
	int month;
	int year;
	private Scanner sc=new Scanner(System.in);
	void start(){
		
		System.out.println("Enter day : ");
		 day=sc.nextInt();
		System.out.println("Enter month : ");
		 month=sc.nextInt();
		System.out.println("Enter year : ");
		year=sc.nextInt();
		
		while(true) {
			
			System.out.println("1. IS date is valid or not.");
			System.out.println("2. Get Day of Week");
			System.out.println("3. Is Leap Ye"
					+ "ar or Not.");
			System.out.println("4. Get Next Day.");
			System.out.println("5. Get Previous Day.");
			System.out.println("6. EXIT");
			System.out.println("Enter Choice : ");
			int n=sc.nextInt();
			if(n==6) {
				System.out.println("Thank You....");
				break;
			}else if(n==1) {
				System.out.println(isValidDate());
			}else if(n==2) {
				getDayOfWeek();
			}else if(n==3) {
				System.out.println(isLeapYear());
			}else if(n==4) {
				System.out.println(getNextDay());
			}else if(n==5) {
				System.out.println(getPreviousDay());
			}
		}
	}
	
DayOfWeek getPreviousDay() {
		
		LocalDate d=LocalDate.of(year,month,day);
		
		return d.minusDays(1).getDayOfWeek();
		//return d.getDayOfWeek();
	
		
	}
	
	DayOfWeek getNextDay() {
		
		LocalDate d=LocalDate.of(year,month,day);
		
		return d.plusDays(1).getDayOfWeek();

	
		
	}
	
	void getDayOfWeek() {
		
		LocalDateTime d=LocalDateTime.of(year, month, day,1,1,1);
		
		System.out.println(d.getDayOfWeek());
		
	}
	
	
	boolean isValidDate() {
		
		
		if(year>=1900) {
			
			if(month==1 || month==3 || month==5 || month==7 || month==8 ||month==10 ||month==12) {
				
				if(day<=31) {
					
						return true;
					
				}else {
					return false;
				}
				
			}else if(month<=12) {
				
				if(month==2) {
					
					if(isLeapYear()) {
						if(day<=29) {
							return true;
						}else {
						   return false;
						}
					}else {
						if(day<=28) {
							return true;
						}else {
							return false;
						}
					}
					
				}else {
					
					if(day<=30) {
						return true;
					}else {
						return false;
					}
					
				}
				
			}
			
		}
		
		return false;
		
		
	}
	
	boolean isLeapYear() {
		
		Year y=Year.of(year);
		
		return y.isLeap();
	}
	
	
	
}
public class Pro09 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDate obj=new MyDate();
		obj.start();
	
		

	}

}
