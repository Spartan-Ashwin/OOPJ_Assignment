package Assignment07;
import java.util.*;
public class Pro03 {

	
	// Pair Sum array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter size of  array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter given number");
		int num=sc.nextInt();
		boolean flag=true;
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==num) {
					System.out.println("Pairs are ("+arr[i]+", "+arr[j]+")");
					flag=false;
				}
			}
		}
		if(flag)
		System.out.println("Pair sum not possible");

	}

}
