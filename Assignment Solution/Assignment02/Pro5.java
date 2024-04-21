package Assignment02;
import java.util.Scanner;
public class Pro5 {

	// Vowel or Consonent

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character ");
		String str;
		str=sc.next();
		char ch=str.charAt(0);
		if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || 
				ch=='I' || ch=='i' || ch=='O' || ch=='o' 
				|| ch=='U' || ch=='u') {
			System.out.println("Vowel");
		}else {
			System.out.println("Consonent");
		}

	}

}
