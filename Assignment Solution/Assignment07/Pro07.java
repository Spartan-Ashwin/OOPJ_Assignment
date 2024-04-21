package Assignment07;

import java.util.Arrays;
import java.util.Scanner;

public class Pro07 {	
	// Merge Two Array
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
		int[] arr2=new int[n2];
		System.out.println("Enter elements of second array");
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("Merge Array is");
		int[] merge=new int[n1+n2];
		
		int i=0;
		int j=0;
		boolean  flag=true;
		int k=0;
		while(i<n1 && j<n2) {
			
			if(flag) {
				
				merge[k]=arr1[i];
				i++;
				flag=false;
			}else {
				merge[k]=arr2[j];
				j++;
				flag=true;
			}
			k++;
		}
		
		while(i<n1) {
			merge[k]=arr1[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			merge[k]=arr2[j];
			j++;
			k++;
		}
		
		System.out.println(Arrays.toString(merge));
		
		

	}

}
