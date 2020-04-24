package pojos;

import java.time.LocalDateTime;


public class BloodSample {
	public int id;
	public int hematocrit;
	public static int volume = 450;
	public int plasma;
	public int platelets;
	public int hdl;
	public int haemoglobin;
	public LocalDateTime dod;
	
	
	
	public BloodSample() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHematocrit() {
		return hematocrit;
	}
	public void setHematocrit(int hematocrit) {
		this.hematocrit = hematocrit;
	}
	public static int getVolume() {
		return volume;
	}
	public static void setVolume(int volume) {
		BloodSample.volume = volume;
	}
	public int getPlasma() {
		return plasma;
	}
	public void setPlasma(int plasma) {
		this.plasma = plasma;
	}
	public int getPlatelets() {
		return platelets;
	}
	public void setPlatelets(int platelets) {
		this.platelets = platelets;
	}
	public int getHdl() {
		return hdl;
	}
	public void setHdl(int hdl) {
		this.hdl = hdl;
	}
	public int getHaemoglobin() {
		return haemoglobin;
	}
	public void setHaemoglobin(int haemoglobin) {
		this.haemoglobin = haemoglobin;
	}
	public LocalDateTime getDod() {
		return dod;
	}
	public void setDod(LocalDateTime dod) {
		this.dod = dod;
	}  
	
	
}
