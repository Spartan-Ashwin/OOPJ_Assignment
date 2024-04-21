package Assignment04;

class Vehicle{
	
	int numberOfTyre;
	String color;
	
	Vehicle(int numberOfTyre,String color){
		this.numberOfTyre=numberOfTyre;
		this.color=color;
	}
	
	Vehicle(){
		
	}
	
	void passengerTravelName(String name1) {
		System.out.println(name1);
		System.out.println("is travelling in vechicle of tyre "+numberOfTyre+" and color of vechicle is "+color);
		
	}
	
	void passengerTravelName(String name1,String name2) {
		System.out.println(name1+", "+name2);
		System.out.println("are travelling in vechicle having tyre "+numberOfTyre+" and color of vechicle is "+color);

		
	}
	
	void passengerTravelName(String name1,String name2,String name3) {
		System.out.println(name1+", "+name2+", "+name3);
		System.out.println("are travelling in vechicle having tyre "+numberOfTyre+" and color of vechicle is "+color);

	}
	
	void passengerTravelName(String name1,String name2,String name3,String name4) {
		System.out.println(name1+", "+name2+", "+name3+", "+name4);
		System.out.println("are travelling in vechicle having tyre "+numberOfTyre+" and color of vechicle is "+color);
	
	}
	
	void passengerTravelName(String...name) {
		
		for(String ii:name) {
			System.out.print(ii+" ");
		}
		System.out.println();
		System.out.println("are travelling in vechicle of tyre "+numberOfTyre+" and color of vechicle is "+color);

	}
}
public class Pro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1=new Vehicle(2,"black");
		v1.passengerTravelName("ashwin");
		
		System.out.println("*********************");
		
		Vehicle v2=new Vehicle(3,"yellow");
		v2.passengerTravelName("ashwin","krishna");
		
        System.out.println("*********************");
		
		Vehicle v3=new Vehicle(4,"red");
		v3.passengerTravelName("ashwin","krishna","neha");
		
		System.out.println("****************");
		Vehicle v4=new Vehicle(4,"blue");
		v4.passengerTravelName("ashwin","krishna","neha","rutuja");
		
		
		System.out.println("****************");
		Vehicle v5=new Vehicle(4,"green");
		v5.passengerTravelName("ashwin","krishna","neha","rutuja","aditya","veena","sai","shiv","arya","sweta");
		
		
		

	}

}
