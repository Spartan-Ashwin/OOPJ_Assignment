package Assignment05;

import java.util.Scanner;

// BMI CALCULATOR  PROGRAM


class BmiCalculator{
	
	private double height;
	private double weight;
	
	BmiCalculator(){
		
	}
	
	BmiCalculator(double height,double weight){
		this.height=height;
		this.weight=weight;
	}
	
	void setHeight(double height) {
		this.height=height;
	}
	void setWeight(double weight) {
		this.weight=weight;
	}
	
	double calculateBmi() {
		double bmi=(weight)/(height*height);
		return bmi;
	}
}
public class Pro02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			int choice;
			System.out.println("press\n1-> calculate bmi\n2-> exit");
			choice=sc.nextInt();
			if(choice==2) {
				break;
			}else {
				System.out.println("******************");
				System.out.println("Enter height(in meter)");
				double height=sc.nextDouble();
				System.out.println("Enter weight (in kilogram)");
				double weight=sc.nextDouble();
				
				BmiCalculator bmi=new BmiCalculator();
				bmi.setHeight(height);
				bmi.setWeight(weight);
				System.out.println("Your BMI = "+bmi.calculateBmi());
			}
		}
		
		System.out.println("Thank you good day ***");
		

	}

}
