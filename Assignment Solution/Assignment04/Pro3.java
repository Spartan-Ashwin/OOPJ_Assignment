package Assignment04;

class Employee{
	
	
	String name;
	int age;
	float salary;
	
	
	
	void setEmployeeInfo(String name,int age,float salary){
		
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
    void setEmployeeInfo(String name,float salary,int age){
		
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
    
    void setEmployeeInfo(int age,float salary,String name) {
    	this.name=name;
		this.age=age;
		this.salary=salary;
    }
    
    void setEmployeeInfo(int age,String name,float salary) {
    	this.name=name;
		this.age=age;
		this.salary=salary;
    }
    
    void setEmployeeInfo(float salary,String name,int age) {
    	this.name=name;
		this.age=age;
		this.salary=salary;
    }
    
    void setEmployeeInfo(float salary,int age,String name) {
    	this.name=name;
		this.age=age;
		this.salary=salary;
    }
    
    void getEmployeeInfo() {
    	
    	System.out.println("Name : "+name+"\nAge : "+age+"\nSalary : "+salary);
    	System.out.println("************************");
    }
    
    

	
	
}

public class Pro3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setEmployeeInfo("ashwin shelke",24,200000.00f);
		
		Employee e2=new Employee();
		e2.setEmployeeInfo(50000.00f,"Puspa Raj",25);
		
		Employee e3=new Employee();
		e3.setEmployeeInfo(26,70000.f,"digambar Bhau");
		
		e1.getEmployeeInfo();
		e2.getEmployeeInfo();
		e3.getEmployeeInfo();
		

	}

}
