package Assignment07;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Pro08 {

	// avg of  consecutive 3 number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter size of  array");
		//int n=sc.nextInt();
		int[] arr=new int[] {5,14,35,89,140};
		int n=5;
//		System.out.println("Enter elements of array");
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
		if(n<3) {
			System.out.println("Not possible");
			return;
		}
		ArrayList<Integer> list=new ArrayList<>();  
		for(int i=0;i<n;i++) {
			
			int k=0;
			int sum=0;
			for(int j=i;j<n &&k<3;j++ ) {
				sum+=arr[j];
				k++;
			}
			
	     	int avg=0;
			if(k==3) {
				avg=sum/3;
				list.add(avg);
				
				
			}
			
		}
		int[] avg=new int[list.size()];
		
		for(int i=0;i<list.size();i++) {
			avg[i]=list.get(i);
		}
		
		System.out.println(Arrays.toString(avg));

	}

}
