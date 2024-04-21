package Assignment08;

import java.util.Scanner;
enum Dish{
	
	
	
	Dish1(110),Dish2(30),Dish3(50),Dish4(70),Dish5(100);
	
	double price;
	int quantity;
	boolean isOrder=false;
	
	Dish(double price){
		this.price=price;
	}
	
	Dish(){
		
	}
	double getPrice() {
		return price;
	}
	void setQuantity(int quantity) {
		this.quantity=quantity;
	}
}

class Resturant{
	Scanner sc=new Scanner(System.in);
	
	void printMenu() {
		
		Dish[] d=Dish.values();
	
		for(Dish ii:d) {
			System.out.println((ii.ordinal()+1)+""+ii+"--->"+ii.getPrice());
		}
		
	}

	void takeOrder() {
		System.out.println("Please enter the dish number you wish to order:");
		int num=sc.nextInt();
		System.out.println("Please enter the quantity you wish to order:");
		int quantity=sc.nextInt();
		if(quantity<=0) {
			System.out.println("Invalid quantity entered. Please try again.");
			return;
		}
		double total=findTotal(num,quantity);
		System.out.println("Total cost: $"+total);
	
	}
	
	double findTotal(int num,int quantity) {
		
		Dish[] d=Dish.values();
		
		for(Dish ii:d) {
			if(ii.ordinal()==num-1) {
				ii.isOrder=true;
				ii.setQuantity(quantity);
				return quantity*ii.getPrice();
			}
		}
		System.out.println("Invalid Order Number...");
		return 0;
		
	}
	
	void summary() {
		
          Dish[] d=Dish.values();
		
		for(Dish ii:d) {
			if(ii.isOrder) {
				
				if(ii.isOrder && ii.quantity!=0) {
				System.out.println((ii.ordinal()+1)+" "+ii+"- $"+(ii.quantity*ii.price));
				}
				
			}
		}
		
	}
	
	
	void start() {
		
		while(true) {
			
			System.out.println("1.Menu");
			System.out.println("2.Order");
			System.out.println("3.Would you like to place another order? (Y/N)");
			String str=sc.next();
			if(str.equals("1")) {
				printMenu();
			}else if(str.equals("2")) {
				takeOrder();
			}else if(str.equals("3") || str.equals("N") || str.equals("n")) {
				summary();
				System.out.println("Thank you for your order!");
				break;
			}else if(str.equals("Y") || str.equals("y")){
				System.out.println("Please continue...");
				
			}else  {
				System.out.println("Invalid");
			}
		}
	}
}
public class Pro9 {
	
	public static void main(String[] args) {
	System.out.println("Welcome to Restaurant XYZ Menu Ordering System");
	Resturant obj=new Resturant();
		obj.start();
		

	}

}
