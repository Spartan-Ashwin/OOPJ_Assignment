//package Assignment08;
//
//import java.util.Scanner;
//// Array Operation
//class ArrayOperation{
//	Scanner sc=new Scanner(System.in);
//	int n;
//	int[] arr;
//	
//	int choice;
//	
//	void menu() {
//		
//		while(true) {
//			
//			System.out.println("Enter Choice");
//			System.out.println("1.Accept an array of integers of size n from the user.");
//			System.out.println("2.Display the contents of the array on the console.");
//			System.out.println("3.Calculate and display the sum of all the elements in the array.");
//			System.out.println("4.Calculate and display the average of all the elements in the array.");
//			System.out.println("5.Find and display the largest element in the array.");
//			System.out.println("6.Find and display the smallest element in the array.");
//			System.out.println("7.Sort the array in ascending order and display the sorted array on the console.");
//			System.out.println("8.EXIT");
//			
//			choice=sc.nextInt();
//			if(choice==8) {
//				System.out.println("THANK YOU!!");
//				break;
//			}else if(choice==1) {
//				this.accept();
//			}else if(choice==2) {
//				System.out.println("Array Elements are");
//				this.display();
//			}else if(choice==3) {
//				System.out.println("Sum of array is : "+findSum());
//			}else if(choice==4) {
//				double sum=findSum();
//				double avg=sum/n;
//				System.out.println("Average of array is "+avg);
//				
//			}else if(choice==5) {
//				
//				this.findSmall();
//			}else if(choice==6) {
//				this.findLarge();
//			}else if(choice ==7) {
//				this.sortTheArray();
//			}
//		}
//	}
//	
//	void sortTheArray() {
//		
//		
//		for(int i=1;i<arr.length;i++) {
//			
//			int j=i-1;
//			int val=arr[i];
//			while(j>=0 && arr[j]>val) {
//				arr[j+1]=arr[j];
//				j--;
//			}
//			j++;
//				if(j!=i)
//				arr[j]=val;
//			
//		}
//		
//		System.out.println("Sorted Elements Area : ");
//		this.display();
//	}
//	
//	void findLarge() {
//
//		int max=Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		System.out.println("Maximum Element is "+max);
//		
//	}
//	void findSmall() {
//		
//		int min=Integer.MAX_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
//		System.out.println("Minimum Element is "+min);
//	}
//	
//	int findSum() {
//		
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			sum+=arr[i];
//		}
//		return sum;
//	}
//	
//	void display() {
//		
//		
//		
//		for(int ii:arr) {
//			System.out.print(ii+" ");
//		}
//		System.out.println();
//	}
//	
//	void accept() {
//		
//		System.out.println("Enter size of array");
//	     n=sc.nextInt();
//	     arr=new int[n];
//	    System.out.println("Enter elements of array");
//	    for(int i=0;i<n;i++) {
//	    	arr[i]=sc.nextInt();
//	    }
//	}
//	
//	
//}
//public class Pro1 {
//
//	// Array Operation
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayOperation obj =new ArrayOperation();
//		obj.menu();
//	}
//
//}
