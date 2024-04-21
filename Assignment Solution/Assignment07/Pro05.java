package Assignment07;

import java.util.Scanner;

public class Pro05 {
	
	// Small and Large Elements
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int small=Integer.MAX_VALUE;
		int large=Integer.MIN_VALUE;
		
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter size of  array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>large) {
				large=arr[i];
			}
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		
		System.out.println("Small Number is : "+small);
		System.out.println("Large Number is : "+large);

	}

}
