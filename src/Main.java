
public class Main {
	public static void main(String[] args) {
		VipCustomer austin = new VipCustomer();
		VipCustomer dude = new VipCustomer("vonn", 34231221.21);
		VipCustomer tay = new VipCustomer("Taylor", 618289.54, "tk@gmail.com");
		
		System.out.println(austin.getName());
		System.out.println(austin.getEmail());
		System.out.println(dude.getEmail());
	}

}
