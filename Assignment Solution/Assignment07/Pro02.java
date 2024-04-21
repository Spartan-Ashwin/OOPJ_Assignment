package Assignment07;
import java.util.Scanner;
public class Pro02 {

	// Equality of Array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter size of first array");
		int n1=sc.nextInt();
		int[] arr1=new int[n1];
		System.out.println("Enter elements of first array");
		for(int i=0;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter size of first array");
		int n2=sc.nextInt();
		int[] arr2=new int[n1];
		System.out.println("Enter elements of second array");
		for(int i=0;i<n1;i++) {
			arr2[i]=sc.nextInt();
		}
		
		if(n1==n2) {
			for(int i=0;i<n1;i++) {
				if(arr1[i]!=arr2[i]) {
					System.out.println("Arrays are not equal");
					return;
				}
			}
			System.out.println("Arrays are equal");
			
		}else {
			System.out.println("Arrays are not equal");
		}
		

	}

}
