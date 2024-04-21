package Assignment07;
import java.util.*;
public class Pro09 {	
	
	// series even sqare and odd cube
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter size of series");
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i*i+" ");
			}else {
				System.out.print(i*i*i+" ");
			}
		}
		

	}

}
