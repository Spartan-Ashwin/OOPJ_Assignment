package Assignment07;

import java.util.Arrays;
import java.util.Scanner;

public class Pro04 {
	
	// Reverse Array
	
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
		System.out.println("Before Reversing:");
		System.out.println(Arrays.toString(arr));
		System.out.println("After Reversing:");
		
		int i=0;
		int j=arr.length-1;
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));

	}

}
