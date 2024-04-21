//package Assignment08;
//import java.io.*;
//import java.util.Scanner;
//
//// RestaurantManagement System
//
//class RestaurantManagementSystem{
//	
//	Scanner sc=new Scanner(System.in);
//	int[] dishNumber=new int[10];
//	int[] dishPrice=new int[10];
//	String[] dishName=new String[10];
//	int curr=-1;
//	
//	RestaurantManagementSystem(){
//		
//		for(int i=0;i<10;i++) {
//			dishNumber[i]=-1;
//		}
//	}
//	void menu() {
//		
//		while(true) {
//			System.out.println("1.View the current menu with prices");
//			System.out.println("2.Add a new dish to the menu");
//			System.out.println("3.Remove a dish from the menu");
//			System.out.println("4.Modify the price of a dish on the menu");
//			System.out.println("5.Exit the program");
//			int choice=sc.nextInt();
//			
//			if(choice==5) {
//				System.out.println("Thanks !! Visit again**");
//				break;
//			}else if(choice==1) {
//				displayMenu();
//			}
//			else if(choice==2) {
//				addItem();
//			}else if(choice==3) {
//				removeItem();
//			}else if(choice==4) {
//				modifyItem();
//			}
//		}
//	}
//	
//	void modifyItem() {
//		if(curr==-1) {
//			System.out.println("Menu list is empty");
//			return;
//		}
//		System.out.println("Enter item number");
//		int number=sc.nextInt();
//		System.out.println("What you want to change..Press");
//		int c=0;
//		System.out.println("1 dish name");
//		System.out.println("2 dish price");
//		c=sc.nextInt();
//		if(c==1) {
//			System.out.println("Enter name of dish");
//			String dName=sc.nextLine();
//			dishName[number]=dName;
//			System.out.println("modified dish is ");
//			System.out.println(dishNumber[number]+" "+dishName[number]+" "+dishPrice[number]+"Rs.");
//		}else if(c==2) {
//			System.out.println("Enter dish price");
//			int dPrice=sc.nextInt();
//			dishPrice[number]=dPrice;
//			System.out.println("modified dish is ");
//			System.out.println(dishNumber[number]+" "+dishName[number]+" "+dishPrice[number]+"Rs.");
//		}else {
//			System.out.println("Invalid");
//		}
//		
//	}
//	
//	void removeItem() {
//		
//		if(curr==-1) {
//			System.out.println("Menu list is already empty.");
//			return;
//		}else {
//			System.out.println("Enter dish number");
//			int number=sc.nextInt();
//			if(number>curr) {
//				System.out.println("Invalid");
//				return;
//			}
//			int idx=number;
//			dishNumber[idx]=-1;
//			
//			System.out.println("Dish "+number+" "+dishName[idx]+" "+dishPrice[idx]+" is removed successfully");
//			dishName[idx]=null;
//			curr--;
//		}
//	}
//	
//	void addItem() {
//		
//		if(curr>9) {
//			System.out.println("Menu Item List is full, You can not add further");
//			return;
//		}else {
//			
//			
//			System.out.println("Enter item name");
//			
//			BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
//			String name="none";
//			try {
//				name = input.readLine();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			//System.out.println(name+"***");
//			System.out.println("Enter Price");
//			int price=sc.nextInt();
//			curr++;
//			dishName[curr]=name;
//			dishPrice[curr]=price;
//			dishNumber[curr]=curr;
//			System.out.println("ADDED ITEM IS ");
//			System.out.println("number "+curr);
//			System.out.println("name   "+name);
//			System.out.println("price  "+price+"Rs.");
//
//		}
//	}
//		
//		void displayMenu() {
//			
//			if(curr==-1) {
//				System.out.println("Sorry For Inconvenience, no dish  is availble now");
//			}else {
//				
//				int i=0;
//				while(dishName[i]!=null) {
//					System.out.println("*"+dishNumber[i]+" "+dishName[i]+" "+dishPrice[i]+"Rs.");
//				i++;
//				}
//			}
//		}
//	
//	
//	
//}
//public class Pro2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub 
//		
//		RestaurantManagementSystem obj =new RestaurantManagementSystem();
//		obj.menu();
//
//	}
//
//}
