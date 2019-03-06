
public class VipCustomer {
	
	private String name;
	private double creditLimit;
	private String email;
	
	VipCustomer(){
		this("Jane Doe", 2_000_0000.00, "janeDoe@gmail.com");
		System.out.println("Empty Constructor");	
	}
	
	VipCustomer(String name, double num){
		this(name, num, "janeDoe@gmail.com");
		System.out.println("2nd Constructor");
		
	}
	
	VipCustomer(String name, double num, String email){
		this.name = name;
		this.creditLimit = num;
		this.email = email;
		System.out.println("3rd Constructor");
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getCreditLimit() {
		return this.creditLimit;
	}
	
	public String getEmail() {
		return this.email;
	}

}
