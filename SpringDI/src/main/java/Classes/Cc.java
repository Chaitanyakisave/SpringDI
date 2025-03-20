package Classes;

import in.Cardpayment1;

public class Cc implements Cardpayment1{
   private String name;
   private Address  address;
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("pay");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("hihihi");
		System.out.println(address.toString());
	}
	@Override
	public String toString() {
		System.out.println("Process of payment using Credit card please wait...");
		return "Cc [name=" + name + ", add=" + address.toString() + "]";
	}

}
