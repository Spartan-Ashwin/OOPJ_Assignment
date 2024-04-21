package Assignment07;

import java.util.Scanner;

public class Pro10 {

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
		
		boolean isAscending=true;
		boolean isDecending=true;
		boolean isRandom=true;
		
		
		for(int i=0;i<n-1;i++) {
			
			if(arr[i]<arr[i+1]) {
				isDecending=false;
			}
			else {
				isAscending=false;
			}
		}
		
		if(isAscending) {
			System.out.println("Ascending");
		}else if(isDecending) {
			System.out.println("Descending");
		}else {
			System.out.println("Random");
		}
	}

}
