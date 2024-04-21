//package Assignment08;
//import java.util.*;
//
//class MatrixOperation{
//	int[][] arr1;
//	int[][] arr2;
//	Scanner sc=new Scanner(System.in);
//	
//	void start() {
//		System.out.println("*************************************************");
//		System.out.println("Enter number of rows of first matrix : ");
//		int row1=sc.nextInt();
//		System.out.println("Enter number of columns of second matrix");
//		int col1=sc.nextInt();
//	     arr1=new int[row1][col1];
//		System.out.println("Enter Elemetns of matrix 1 : ");
//		for(int i=0;i<row1;i++) {
//			
//			for(int j=0;j<col1;j++) {
//				arr1[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println("*************************************************");
//		System.out.println("Enter number of rows of second matrix : ");
//		int row2=sc.nextInt();
//		System.out.println("Enter number of columns of second matrix");
//		int col2=sc.nextInt();
//		arr2=new int[row2][col2];
//		System.out.println("Enter Elemetns of matrix 2 : ");
//		for(int i=0;i<row2;i++) {
//			
//			for(int j=0;j<col2;j++) {
//				arr2[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println("*************************************************");
//		
//		while(true) {
//			System.out.println("1.Addition");
//			System.out.println("2.Subtraction");
//			System.out.println("3.Multiplication");
//			System.out.println("4.transpose");
//			System.out.println("5.Exit");
//			int n=sc.nextInt();
//			if(n==5) {
//				System.out.println("Thank You....");
//				break;
//			}else if(n==1) {
//				add(row1,col1,row2,col2);
//			}else if(n==2) {
//				sub(row1,col1,row2,col2);
//			}else if(n==3) {
//				multiply(row1,col1,row2,col2);
//			}else if(n==4) {
//				 transpose();
//			}else {
//				System.out.println("Invalid input");
//			}
//		}
//		
//	}
//	
//	void transpose() {
//		
//		
//		System.out.println("Before transpose matrix 1");
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr1[i].length;j++) {
//				System.out.print(arr1[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("After transpose matrix 1");
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=i+1;j<arr1[i].length;j++) {
//				int temp=arr1[i][j];
//				arr1[i][j]=arr1[j][i];
//				arr1[j][i]=temp;
//			}
//		}
//		System.out.println();
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr1[i].length;j++) {
//				System.out.print(arr1[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		
//		System.out.println("***************************************");
//		
//		
//		System.out.println("Before transpose matrix 2");
//		for(int i=0;i<arr2.length;i++) {
//			for(int j=0;j<arr2[i].length;j++) {
//				System.out.print(arr2[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("After transpose matrix 2");
//		for(int i=0;i<arr2.length;i++) {
//			for(int j=i+1;j<arr2[i].length;j++) {
//				int temp=arr2[i][j];
//				arr2[i][j]=arr2[j][i];
//				arr2[j][i]=temp;
//			}
//		}
//		System.out.println();
//		for(int i=0;i<arr2.length;i++) {
//			for(int j=0;j<arr2[i].length;j++) {
//				System.out.print(arr2[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}
//	
//	void multiply(int r1,int c1,int r2,int c2) {
//		
//		if(c1==r2) {
//			
//			int[][] ans=new int[r1][c2];
//			
//			for(int i=0;i<r1;i++){
//					
//				for(int j=0;j<c2;j++) {
//					int a=0;
//					for(int k=0;k<c2;k++) {
//						a+=arr1[i][k]*arr2[k][j];
//					}
//					ans[i][j]=a;
//				}
//			}
//			
//			System.out.println("Matrix Multiplication of two matrices...");
//			System.out.println();
//			for(int i=0;i<r1;i++) {
//				
//				for(int j=0;j<c2;j++) {
//					System.out.print(ans[i][j]+" ");
//				}
//				System.out.println();
//			}
//	  }else {
//			System.out.println("Multiplication not possible......");
//		}
//	}
//	
//	void sub(int r1,int c1,int r2,int c2) {
//		if(r1==r2 && c1==c2) {
//			int[][] ans=new int[r1][c1];
//			
//			for(int i=0;i<r1;i++) {
//				for(int j=0;j<c1;j++) {
//					ans[i][j]=arr1[i][j]-arr2[i][j];
//				}
//			}
//			
//			System.out.println("Subtraction of two matrices are : ");
//			for(int i=0;i<r1;i++) {
//				for(int j=0;j<c1;j++) {
//					System.out.print(ans[i][j]+" ");
//				}
//				System.out.println();
//			}
//		}else {
//			System.out.println("Alert..You can not subtact this two matrices..");
//		}
//	}
//	
//	void add(int r1,int c1,int r2,int c2) {
//		if(r1==r2 && c1==c2) {
//			int[][] ans=new int[r1][c1];
//			
//			for(int i=0;i<r1;i++) {
//				for(int j=0;j<c1;j++) {
//					ans[i][j]=arr1[i][j]+arr2[i][j];
//				}
//			}
//			
//			System.out.println("Addition of two matrices are : ");
//			for(int i=0;i<r1;i++) {
//				for(int j=0;j<c1;j++) {
//					System.out.print(ans[i][j]+" ");
//				}
//				System.out.println();
//			}
//		}else {
//			System.out.println("Alert..You can not add this two matrices..");
//		}
//	}
//	
//}
//
//
//public class Pro7 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		MatrixOperation obj=new MatrixOperation();
//		obj.start();
//
//	}
//
//}
