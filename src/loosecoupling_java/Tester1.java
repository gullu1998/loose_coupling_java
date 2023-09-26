package loosecoupling_java;

public class Tester1 {
	
	//here we are applying single ton concept to restrict the object creation
	//here we are passing jio class object into sim of Port type
	//here we are trying to achieve looseCoupling if we are creating Airtel class object the sim is is of Airtel type
	//with a single change we change sim from jio to airtel so we say that we achieve here looseCoupling.
	static Port sim=new Jio();
	
	public static void main(String[] args) {
		Mobile mobile1=new Mobile("realme",8, 25000, sim);
		Mobile mobile2=new Mobile("Motorola", 6, 15000, sim);
		
		System.out.println(mobile1);
		mobile1.description();
		
		System.out.println(mobile2);
		mobile2.description();
	}

}
