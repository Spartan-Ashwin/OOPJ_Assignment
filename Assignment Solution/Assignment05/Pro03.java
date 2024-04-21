package Assignment05;
import java.util.Scanner;
import java.util.*;
// BOOK INVENTORY MANAGEMENT SYSTEM

class Book{
	
	
	private String title;
	private String author;
	private String publisher;
	private String isbn;
	private int year;
	private double price;
	private int quantity;
	
	static double totalCost;
	
	Book(){
		
	}
	
	void setTitle(String title) {
		this.title=title;
	}
	
	String getTitle() {
		return this.title;
	}
	
	void setAuthor(String author) {
		this.author=author;
	}
	
	String getAuthor() {
		return this.author;
	}
	
	void setPublisher(String publisher) {
		this.publisher=publisher;
	}
	
	
	String getPublisher() {
		
		return this.publisher;
	}
	
	void setISBN(String isbn) {
		this.isbn=isbn;
	}
	String getISBN() {
		return this.isbn;
	}
	
	void setPublishYear(int year) {
		this.year=year;
	}
	
	int getPublishYear() {
		return year;
	}
	
	void setPrice(double price) {
		this.price=price;
	}
	
	double getPrice() {
		return this.price;
	}
	
	void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	double getQuantity() {
		
		return this.quantity;
	}
	void setTotal(){
		totalCost = (this.quantity)*(this.price);
	}
	
	
	void increaseQuantity(int quantity) {
		this.quantity+=quantity;
		setTotal();
	}
	
	void decraseQuantity(int quantity) {
		this.quantity-=quantity;
		setTotal();
	}
	
	double getInventoryValue() {
		
		return totalCost;
	}
	
	
	
	
	
}
public class Pro03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Book> arr=new ArrayList<>();
		while(true) {
			System.out.println("*********************");
			System.out.println("1 add new book");
			System.out.println("2 increase quantity of book");
			System.out.println("3 decrease quantity of book");
			System.out.println("4 to see to inventory of book");
			System.out.println("5 break");
			System.out.println("*********************");
			int n=sc.nextInt();
			if(n==5) {
				break;
			}else if(n==1) {
				
				Book b=new Book();
				System.out.println("Enter title of book");
				sc.next();
				String title=sc.nextLine();
				b.setTitle(title);
				System.out.println("Enter author of book");
				String author=sc.nextLine();
				b.setAuthor(author);
				System.out.println("Enter publisher");
				String publisher=sc.nextLine();
				b.setPublisher(publisher);
				System.out.println("Enter isbn");
				String isbn=sc.nextLine();
				Book b1;
				boolean flag=false;
				for(int ii=0;ii<arr.size();ii++) {
					 b1=arr.get(ii);
					if(b1.getISBN().equals(isbn)) {
						flag=true;
						break;
					}
				}
				if(flag) {
					System.out.println("This isbn already exist");
					break;
				}else {
					b.setISBN(isbn);
				}
				
				System.out.println("Enter publication year");
				int year=sc.nextInt();
				b.setPublishYear(year);
				System.out.println("Enter price of book");
				double price=sc.nextDouble();
				b.setPrice(price);
				System.out.println("Enter quantity of book");
				int quantity =sc.nextInt();
				b.setQuantity(quantity);
				b.setTotal();
				arr.add(b);
				
				
			}else if(n==2) {
				System.out.println("Enter isbn number");
				String isbn=sc.next();
				System.out.println(isbn);
				Book b=null;
				boolean flag=false;
				for(int ii=0;ii<arr.size();ii++) {
					 b=arr.get(ii);
					if(b.getISBN().equals(isbn)) {
						flag=true;
						break;
					}
				}
				if(flag) {
					System.out.println("Enter quantity");
					int quantity=sc.nextInt();
					if(quantity>0) {
						b.increaseQuantity(quantity);
					}else {
						System.out.println("Quantity can not be neagtive");
					}
				}else {
					System.out.println("Invalid ISBN number");
				}
			}else if(n==3) {
				System.out.println("Enter isbn number");
				String isbn=sc.next();
				System.out.println(isbn);
				Book b=null;
				boolean flag=false;
				for(int ii=0;ii<arr.size();ii++) {
					 b=arr.get(ii);
					if(b.getISBN().equals(isbn)) {
						flag=true;
						break;
					}
				}
				if(flag) {
					System.out.println("Enter quantity");
					int quantity=sc.nextInt();
					if(b.getQuantity()-quantity>0) {
						b.decraseQuantity(quantity);
					}else {
						System.out.println("Quantity is insuffiecient");
					}
				}else {
					System.out.println("Invalid ISBN number");
				}
			}else if(n==4) {
				
				System.out.println("Enter isbn number");
				String isbn=sc.next();
				System.out.println(isbn);
				Book b=null;
				boolean flag=false;
				for(int ii=0;ii<arr.size();ii++) {
					 b=arr.get(ii);
					if(b.getISBN().equals(isbn)) {
						flag=true;
						break;
					}
				}
				if(flag) {
					System.out.println(b.getInventoryValue());
				}else {
					System.out.println("Invalid ISBN number");
				}
			}
		}
		
		System.out.println("Thank You!!!");

	}

}
