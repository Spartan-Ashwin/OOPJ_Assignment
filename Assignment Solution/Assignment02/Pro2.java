package Assignment02;
import java.util.Scanner;
public class Pro2 {
	
	// Leap Year
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if((year%4==0 && year%100!=100)|| year%400==0) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not Leap Year");
		}
	}
}
