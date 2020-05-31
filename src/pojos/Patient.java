package pojos;


import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Patient {
	public int id;
	public String name;
	public String surname;
	public String email;
	public String phone;
	public String address;
	public float weight;
	public String abo;
	public String rh;
	public String gender;
	public Date dob;
	public String doctor;
	
	
	
	public Patient(String name, String surname, String email, String phone, String address, float weight, String abo,
			String rh, String gender, Date dob, String doctor) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.weight = weight;
		this.abo = abo;
		this.rh = rh;
		this.gender = gender;
		this.dob = dob;
		this.doctor = doctor;
	}
	
	public Patient(int id, String name, String surname, String email, String phone, String address, float weight,
			String abo, String rh, String gender, Date dob, String doctor) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.weight = weight;
		this.abo = abo;
		this.rh = rh;
		this.gender = gender;
		this.dob = dob;
		this.doctor = doctor;
	}

	public Patient() {
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
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + ", weight=" + weight + ", abo=" + abo + ", rh=" + rh + ", gender=" + gender
				+ ", dob=" + dob + ", doctor=" + doctor + "]";
	}
	
	

}
