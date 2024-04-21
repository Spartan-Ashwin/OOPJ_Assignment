package Assignment05;

import java.util.Scanner;

class Vehicle{
	
	private String vehicleName;
	private int numberOfAxels;
	private double distanceInfo;
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public int getNumberOfAxels() {
		return numberOfAxels;
	}
	public void setNumberOfAxels(int numberOfAxels) {
		this.numberOfAxels = numberOfAxels;
	}
	public double getDistanceInfo() {
		return distanceInfo;
	}
	public void setDistanceInfo(double distanceInfo) {
		this.distanceInfo = distanceInfo;
	}
	
	
	
}

class TollBooth{
	
	
	private double tollFee;
	public double getTollFee() {
		return tollFee;
	}


	public void setTollFee(double tollFee) {
		this.tollFee = tollFee;
	}


	public double getTatalAmoutDue() {
		return tatalAmoutDue;
	}


	public void setTatalAmoutDue(double tatalAmoutDue) {
		this.tatalAmoutDue = tatalAmoutDue;
	}

	private double tatalAmoutDue;
	
	Vehicle v=new Vehicle();
	Scanner sc=new Scanner(System.in);
	void showMenu(int n) {
		if(n==1) {
		System.out.println("Enter vehicle type (car, van, bus, or truck)");
		String type=sc.nextLine();
		v.setVehicleName(type);
		}else if(n==2) {
		
		System.out.println("Enter number of axels");
		int axels=sc.nextInt();
		v.setNumberOfAxels(axels);
		}
		else if(n==3) {
		System.out.println("Enter distance travelled ");
		double distance=sc.nextDouble();
		v.setDistanceInfo(distance);
		}else if(n==4) {
			calculateTotalFee();
		}else if(n==5) {
			
			generateBill();
			
		}
	}
	
	
	void calculateTotalFee() {
		double ans=0;
		String vehicleName=v.getVehicleName();
		vehicleName=vehicleName.toLowerCase();
		System.out.println(v.getVehicleName());
		if(vehicleName.equals("car") || vehicleName.equals("van") 
				|| vehicleName.equals("bus")) {
			
			ans=v.getNumberOfAxels()*0.25;
			
		}else if(vehicleName.equals("truck")) {
			ans=v.getNumberOfAxels()*0.50;
		}
	    setTollFee(ans);
	    System.out.println("toll fee is "+getTollFee());
	}
	
	void generateBill() {
		calculateTotalFee();
		System.out.println("************************");
		System.out.println("1.Vehicle Type "+v.getVehicleName());
		System.out.println("2.Number of Axles "+v.getNumberOfAxels());
		System.out.println("3.Distance Travelled "+v.getDistanceInfo());
		System.out.println("4.Toll Fee "+getTollFee()+"$");
		System.out.println("5.Total Amount due "+(getTollFee()+2)+"$");
		System.out.println("************************");
	}
}

public class Pro07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TollBooth tb=new TollBooth();
		while(true) {
			
			System.out.println("1.Enter vehicle type (car, van, bus, or truck)");
			System.out.println("2.Enter number of axles");
			System.out.println("3.Enter distance travelled");
			System.out.println("4.Calculate toll fee");
			System.out.println("5.Generate bill");
			System.out.println("6.Exit");
			int n=sc.nextInt();
			if(n==6) {
				break;
			}else if(n==1) {
				tb.showMenu(n);
			}else if(n==2) {
				tb.showMenu(n);
			}else if(n==3) {
				tb.showMenu(n);
			}else if(n==4) {
				tb.showMenu(n);
			}else if(n==5) {
				tb.showMenu(n);
			}
		}
		
		System.out.println("Thank You.........");

	}

}
