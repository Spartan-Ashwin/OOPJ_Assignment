package Assignment05;
import java.util.Scanner;

class TelephoneBill{
	
	public TelephoneBill(String customerName, String phoneNumber, int numberOfCalls, double durationOfCalls) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.numberOfCalls = numberOfCalls;
		this.durationOfCalls = durationOfCalls;
	}
	private String customerName;
	private String phoneNumber;
	private int numberOfCalls;
	private double durationOfCalls;
	
	double billAmout() {
		double ans=0;
		if(numberOfCalls>=100) {
			ans+=100*0.2;
			numberOfCalls-=100;
			if(numberOfCalls>0) {
				ans+=numberOfCalls*0.25;
			}
			
		}else {
			ans+=numberOfCalls*0.25;
		}
		
		if(ans<=10) {
			ans=10;
		}
		return ans;
	}
	
	
	
	
}
public class Pro05 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer name");
		String name=sc.nextLine();
		System.out.println("Enter Phone Number");
		String phone=sc.nextLine();
		System.out.println("Enter Number of calls ");
		int calls=sc.nextInt();
		System.out.println("Enter duration of calls");
		double duration=sc.nextDouble();
		
		TelephoneBill tb=new TelephoneBill(name,phone,calls,duration);
		
		System.out.println("Bill Amount is "+tb.billAmout()+"$");
		
		
	}
}
