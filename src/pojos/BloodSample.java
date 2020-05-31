package pojos;

import java.sql.Date;


public class BloodSample {
	public int id;	
	public static int volume = 450;
	public int hematocrit;
	public int plasma;
	public int platelets;
	public int hdl;
	public int hemoglobin;
	public Date dod;
	
	
	
	public BloodSample() {
		super();
	}
	
	public BloodSample(int id, int hematocrit, int plasma, int platelets, int hdl, int hemoglobin, Date dod) {
		super();
		this.id = id;
		this.hematocrit = hematocrit;
		this.plasma = plasma;
		this.platelets = platelets;
		this.hdl = hdl;
		this.hemoglobin = hemoglobin;
		this.dod = dod;
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
	public int getHemoglobin() {
		return hemoglobin;
	}
	public void setHaemoglobin(int haemoglobin) {
		this.hemoglobin = haemoglobin;
	}
	public Date getDod() {
		return dod;
	}
	public void setDod(Date dod) {
		this.dod = dod;
	}

	@Override
	public String toString() {
		return "BloodSample [id=" + id + ", hematocrit=" + hematocrit + ", plasma=" + plasma + ", platelets="
				+ platelets + ", hdl=" + hdl + ", hemoglobin=" + hemoglobin + ", dod=" + dod + "]";
	}  
	
	
	
}
