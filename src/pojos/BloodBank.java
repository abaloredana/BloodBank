package pojos;

public class BloodBank {
	public int id;
	public String email;
	public String address;
	public String phone;
	public int capacity;
	public String city;
	public String zip;

	public BloodBank(int id, String email, String address, String phone, int capacity, String city, String zip) {
		super();
		this.id = id;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.capacity = capacity;
		this.city = city;
		this.zip = zip;
	}
	
	

	public BloodBank(String email, String address, String phone, int capacity, String city, String zip) {
		super();
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.capacity = capacity;
		this.city = city;
		this.zip = zip;
	}



	public BloodBank() {
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

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
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
		return "BloodBank [id=" + id + ", email=" + email + ", address=" + address + ", phone=" + phone + ", capacity="
				+ capacity + ", city=" + city + ", zip=" + zip + "]";
	}


	
}
