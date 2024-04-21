package Assignment02;

import java.util.Scanner;

public class Pro6 {
	
	// BMI
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height and weight");
		double height=sc.nextDouble();
		double weight=sc.nextDouble();
		
		double bmi=703*(weight)/(height*height);
		if(bmi<18.5) {
			System.out.println("Underweight");
		}else if(bmi>=18.5 && bmi<=24.9) {
			System.out.println("Normal Weight");
		}else if(bmi>=25 && bmi<=29.9) {
			System.out.println("Overweight");
		}else {
			System.out.println("Obesity");
		}
		
		
		
		

	}

}
