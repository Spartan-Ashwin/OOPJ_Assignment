package Assignment02;
import java.util.Scanner;
public class Pro1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		if(n>=80) {
			System.out.println("A");
		}else if(n>=65) {
			System.out.println("B");
		}else if(n>=40) {
			System.out.println("C");
		}else {
			System.out.println("Fail");
		}
	}

}
