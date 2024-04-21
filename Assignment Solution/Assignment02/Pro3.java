package Assignment02;
import java.util.Scanner;
public class Pro3 {
	
	// Arithmetic Operation
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Two Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("enter operator +,-,*,/");
		
		String str=sc.next();
		int result=0;
		char ch=str.charAt(0);
		switch(ch){
		case '+' : result=num1+num2;
			 break;
		case '-' :result=num1-num2;
			 break;
		case '*' :result=num1*num2;
			 break;
		case '/' :result=num1/num2;
		
		}
		
		System.out.println("Your result is "+result);
	

	}

}
