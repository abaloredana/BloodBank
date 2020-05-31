package pojos;

public class Hospital {
	public int id;
	public String email;
	public String address;
	public String phone;
	public String name;
	public String city;
	public String zip;

	public Hospital(int id, String email, String address, String phone, String name, String city, String zip) {

	this.id = id;
	this.email = email;
	this.address = address;
	this.phone = phone;
	this.name = name;
	this.city = city;
	this.zip = zip;
	}
	
	public Hospital(String email, String address, String phone, String name, String city, String zip) {
	this.email = email;
	this.address = address;
	this.phone = phone;
	this.name = name;
	this.city = city;
	this.zip = zip;
	}

	public Hospital() {
	super();
	}

	public int getId() {
	return id;
	}

	public void setId(int id) {
	this.id = id;
	}

	public String getEmail() {
	return email;
	}

	public void setEmail(String email) {
	this.email = email;
	}

	public String getAddress() {
	return address;
	}

	public void setAddress(String address) {
	this.address = address;
	}

	public String getPhone() {
	return phone;
	}

	public void setPhone(String phone) {
	this.phone = phone;
	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public String getCity() {
	return city;
	}

	public void setCity(String city) {
	this.city = city;
	}

	public String getZip() {
	return zip;
	}

	public void setZip(String zip) {
	this.zip = zip;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", email=" + email + ", address=" + address + ", phone=" + phone + ", name="
				+ name + ", city=" + city + ", zip=" + zip + "]";
	}
	
	
}
