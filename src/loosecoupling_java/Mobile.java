package loosecoupling_java;

public class Mobile {
	String brand;
	int ram;
	double price;
	
	//here we are doing Aggregation not composition here we are creating only
	//reference of another class into another class called aggregation
	//if we creating object of any class another class is called composition
	//we did'nt create object for interface thatsy we use aggregation here not composition 
	Port sim;

	public Mobile(String brand, int ram, double price, Port port) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
		this.sim = sim;
	}
	
	@Override
	public String toString() {
		return "Mobile [brand=" +brand+ ", ram=" +ram+ ", price=" +price+", sim=" +sim+ "]";
	}
	void description()
	{
		System.out.println("This is Nice Phone");
	}

}
