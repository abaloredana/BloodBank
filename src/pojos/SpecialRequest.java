package pojos;

import java.sql.Date;

public class SpecialRequest extends Request {
	 
	public int plasma;
	public int platelets;
	public int hdl;
	public int hemoglobin;
	public int hematocrit;
	

	public SpecialRequest() {
		super();
	}

	public SpecialRequest(int id, int volume, Date dor, int durability, int relevance, int plasma,
	int platelets, int hdl, int hemoglobin, int hematocrit) {
	super();
	this.id = id;
	this.volume = volume;
	this.dor = dor;
	this.durability = durability;
	this.relevance = relevance;
	this.plasma = plasma;
	this.platelets = platelets;
	this.hdl = hdl;
	this.hemoglobin = hemoglobin;
	this.hematocrit = hematocrit;
	}
	
	public SpecialRequest( int volume, Date dor, int durability, int relevance, int plasma,
	int platelets, int hdl, int hemoglobin, int hematocrit) {
	super();
	this.volume = volume;
	this.dor = dor;
	this.durability = durability;
	this.relevance = relevance;
	this.plasma = plasma;
	this.platelets = platelets;
	this.hdl = hdl;
	this.hemoglobin = hemoglobin;
	this.hematocrit = hematocrit;
	}
	
	

	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public int getVolume() {
	return volume;
	}
	public void setVolume(int volume) {
	this.volume = volume;
	}
	public Date getDor() {
	return dor;
	}
	public void setDor(Date dor) {
	this.dor = dor;
	}
	public int getDurability() {
	return durability;
	}
	public void setDurability(int durability) {
	this.durability = durability;
	}
	public int getRelevance() {
	return relevance;
	}
	public void setRelevance(int relevance) {
	this.relevance = relevance;
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
	public void setHemoglobin(int hemoglobin) {
	this.hemoglobin = hemoglobin;
	}
	public int getHematocrit() {
	return hematocrit;
	}
	public void setHematocrit(int hematocrit) {
	this.hematocrit = hematocrit;
	}

	@Override
	public String toString() {
		return "SpecialRequest [id=" + id + ", volume=" + volume + ", dor=" + dor +", durability=" + durability + 
				", relevance= " + relevance + " plasma=" + plasma + ", platelets=" + platelets + ", hdl=" + hdl + ", hemoglobin="
				+ hemoglobin + ", hematocrit=" + hematocrit + "]";
	}
	
	

	
}
