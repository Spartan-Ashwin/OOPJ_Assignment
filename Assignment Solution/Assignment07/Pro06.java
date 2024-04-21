package Assignment07;

import java.util.Scanner;

public class Pro06 {

	// Third Largest Element in an array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int firstLarge=Integer.MIN_VALUE;
        int secondLarge=firstLarge;
        int thirdLarge=firstLarge;
		
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter size of  array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>firstLarge) {
				thirdLarge=secondLarge;
				secondLarge=firstLarge;
				firstLarge=arr[i];
			}else if(arr[i]>secondLarge) {
				thirdLarge=secondLarge;
				secondLarge=arr[i];
			}else if(arr[i]>thirdLarge) {
				thirdLarge=arr[i];
			}
			
		}
		
		System.out.println("Third large element is "+thirdLarge);

	}

}
