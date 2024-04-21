package Assignment05;
import java.util.Scanner;
class ElectricityBillCalculation{
	
	
	private String name;
	private double unitsConsumsumed;
	private double billAmount;
	
	ElectricityBillCalculation(String name,double unitsConsumed){
		
		this.name=name;
		this.unitsConsumsumed=unitsConsumed;
	}
	
	double calculateBillAmout() {
		
		double amount=0;
		
		
		if(unitsConsumsumed>=100) {
			amount+=100*5;
			unitsConsumsumed=unitsConsumsumed-100;
			if(unitsConsumsumed>=200) {
				unitsConsumsumed-=200;
				amount+=200*7;
			}
			if(unitsConsumsumed>=0) {
				amount+=unitsConsumsumed*10;
			}
		}else {
			amount+=100*unitsConsumsumed;
		}
		return amount;
	}
	
}
public class Pro04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name ");
		String name=sc.nextLine();
		System.out.println("Enter unitsConsumed");
		double unitsConsumed=sc.nextDouble();
		
		ElectricityBillCalculation eb=new ElectricityBillCalculation(name,unitsConsumed);
		
		System.out.println("Customer Name : "+ name);
		System.out.println("Units Conumed : "+ unitsConsumed);
		System.out.println("Total Amount  : "+ eb.calculateBillAmout());

	}

}
