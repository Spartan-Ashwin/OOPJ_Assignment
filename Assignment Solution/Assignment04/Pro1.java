package Assignment04;

class Student{
	
	private int id;
	private String name;
	private int std;
	
	void setDatails(int id,String name,int std) {
		this.id=id;
		this.name=name;
		this.std=std;
	}
	
	void getStudentInfo() {
		System.out.println("Student name id is "+id+" and Student name is "+name+" studying in standard "+std+" th");
		System.out.println("*************************");
	}
	
	
}

public class Pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		Student s2=new Student();
		s1.setDatails(1,"Ashwin Shelke", 4);
		s2.setDatails(2,"Deepak Shelke", 7);
		s1.getStudentInfo();
		s2.getStudentInfo();

	}

}
