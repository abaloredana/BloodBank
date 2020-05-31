package pojos;

import java.sql.Date;
import java.time.LocalDateTime;

public class Donor {
	public int id;
	public String name;
	public String surname;
	public String email;
	public String phone;
	public String address;
	public float weight;
	public String gender;
	public String abo;
	public String rh;
	public Date dob;
	public String city;
	public String zip;


	public Donor(int id, String name, String surname,Date dob, String gender, float weight, String abo,String rh,String email, String phone, String city, String zip,String address) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.weight = weight;
		this.gender = gender;
		this.abo = abo;
		this.rh = rh;
		this.dob = dob;
		this.city = city;
		this.zip = zip;
	}
	
	public String getCity() {
		return city;
	}
	public String getZip() {
		return zip;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public Donor() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAbo() {
		return abo;
	}
	public void setAbo(String abo) {
		this.abo = abo;
	}
	public String getRh() {
		return rh;
	}
	public void setRh(String rh) {
		this.rh = rh;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Donor [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + ", weight=" + weight + ", gender=" + gender + ", abo=" + abo + ", rh=" + rh
				+ ", dob=" + dob + ", city=" + city + ", zip=" + zip + "]";
	}
	
	

}
