package Classes;

import in.Cardpayment1;

public class Dc  implements Cardpayment1{
 private String name;
 private Address address;
	public void pay() {
		// TODO Auto-generated method stub
		
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
	}
	@Override
	public String toString() {
		System.out.println("Process of payment using Credit card please wait...");
		return "Dc [name=" + name + ", address=" + address.toString() + "]";
	}

}
