package Assignment08;
import java.util.Scanner;
class User{
	
	String name;
	String email;
	String pass;
	
	public User(String name, String email, String pass) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
	}

	
}
class WarehouseManagementSystem{
	
	static User[] user=new User[50];
	static int userIndex=0;
	
	static String[][] shelf=new String[5][10];
	
	Scanner sc=new Scanner(System.in);
	
	WarehouseManagementSystem(){
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				
				shelf[i][j]="[empty]";
			}
		}
	}
	void start() {
		
		while(true) {
			
			System.out.println("1.Signup");
			System.out.println("2.Login");
			System.out.println("3.EXIT");
			int n=sc.nextInt();
			if(n==3) {
				System.out.println("Thank You...");
				break;
			}else if(n==1) {
				signup();
			}else if(n==2) {
				login();
			}else {
				System.out.println("Invalid");
			}
			
		}
	}
	
	void loginHome(User u) {
		
		while(true) {
			
			System.out.println("1.Add item to shelf");
			System.out.println("2.Remove item from shelf");
			System.out.println("3.Display contents of all shelves");
			System.out.println("4.EXIT");
			
			int n=sc.nextInt();
			if(n==4) {
				System.out.println("Thank you for using the Warehouse Inventory Management System!");
				break;
			}else if(n==3) {
				
				displayShelf();
			}else if(n==2) {
				
				removeShelf();
			}else if(n==1) {
				addItem();
			}else {
				System.out.println("Invalid Number....");
			}
		}
		
	}
	
	void addItem() {
		
		System.out.println("Enter item : ");
		String item=sc.next();
		System.out.println("Enter row of Shelf : ");
		int row=sc.nextInt();
		System.out.println("Enter shelf number : ");
		int col=sc.nextInt();
		if(row>=5 && col>=10) {
			System.out.println("Invalid, please enter correct position...");
			return;
		}
		String str=shelf[row][col];
		if(!str.equals("[empty]")) {
			
			System.out.println("Shelf is not empty at this position...");
			return;
		}
		
		shelf[row][col]=item;
		System.out.println("Item "+item+" added to Shelf"+col+" of row"+row);
		
	}
	
	void removeShelf() {
		
		System.out.println("Enter row of Shelf : ");
		int row=sc.nextInt();
		System.out.println("Enter shelf number : ");
		int col=sc.nextInt();
		if(row>=5 && col>=10) {
			System.out.println("Invalid, please enter correct position...");
			return;
		}
         if(shelf[row][col].equals("[empty]")) {
			
			System.out.println("Shelf is already empty at this position...");
			return;
		}
        System.out.println("Item "+shelf[row][col]+" is removed from shelf "+col+" of row"+row);
		shelf[row][col]="[empty]";
	}
	
	void displayShelf() {
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				
				System.out.print(shelf[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	void login() {
		System.out.println("Enter email : ");
		String email=sc.next();
		System.out.println("Enter password : ");
		String pass=sc.next();
		
		User u=check(email,pass);
		
		if(u==null) {
			System.out.println("Invalid Credential...");
		}else {
			System.out.println(" login in successfully....");
			loginHome(u);
			
		}
		
	}
	
	User check(String email,String pass) {
		
		for(int i=0;i<user.length;i++) {
			
			User u=user[i];
			if(u==null) {
				continue;
			}
			
			String e=u.email;
			String p=u.pass;
			if(e.equals(email) && p.equals(pass)) {
				return u;
			}
		}
		return null;
	}
	
	void signup() {
		
		System.out.println("Enter name  : ");
		String name=sc.next();
		System.out.println("Enter email : ");
		String email=sc.next();
		System.out.println("Set password : ");
		String pass=sc.next();
		User u=new User(name,email,pass);
		user[userIndex]=u;
		userIndex++;	
	}
	
	
}
public class Pro5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WarehouseManagementSystem obj=new WarehouseManagementSystem();
		obj.start();

	}

}
