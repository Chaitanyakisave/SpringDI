package Classes;

public class Address {
 private String location;
 private  int stritnno;
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getStritnno() {
	return stritnno;
}
public void setStritnno(int stritnno) {
	this.stritnno = stritnno;
}
@Override
public String toString() {
	return "Address location=" + location + ", stritnno=" + stritnno ;
}
}
