package Assignment05;

import java.util.*;
class RotationalNumberCalculator{
	
	private double numerator;
	public double getNumerator() {
		return numerator;
	}
	public void setNumerator(double numerator) {
		this.numerator = numerator;
	}
	public double getDenominator() {
		return denominator;
	}
	public void setDenominator(double denominator) {
		this.denominator = denominator;
	}
	private double denominator;
	
	
	
	
	
}
public class Pro08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		RotationalNumberCalculator rm1=new RotationalNumberCalculator();
		System.out.println("Enter numerator of first number");
		double val=sc.nextDouble();
		rm1.setNumerator(val);
		System.out.println("Enter denominator of first number");
		val=sc.nextDouble();
		rm1.setDenominator(val);
		
		RotationalNumberCalculator rm2=new RotationalNumberCalculator();
		System.out.println("Enter numerator of second number");
		val=sc.nextDouble();
		rm2.setNumerator(val);
		System.out.println("Enter denominator of second number");
		val=sc.nextDouble();
		rm2.setDenominator(val);
		
		System.out.println("Enter operations (+,-,/,*)");
		String str=sc.next();
		char ch=str.charAt(0);
		
		double ans=0;
		double num1=rm1.getNumerator()/rm1.getDenominator();
		double num2=rm2.getNumerator()/rm2.getDenominator();
		if(ch=='+') {
			ans=num1+num2;
		}else if(ch=='-') {
			ans=num1-num2;
		}else if(ch=='*') {
			ans=num1*num2;
		}else if(ch=='/') {
			ans=num1/num2;
		}
		
		System.out.println(rm1.getNumerator()+"/"+rm1.getDenominator()+" "+ch+" "+rm2.getNumerator()+"/"+rm2.getDenominator()+" = "+ans);

	}

}
