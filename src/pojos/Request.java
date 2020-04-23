package pojos;

import java.time.LocalDateTime;


public class Request {
	public int id;
	public static int volume;
	public LocalDateTime dor;
	public boolean revised;
	public int durability;
	public int relevance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static int getVolume() {
		return volume;
	}
	public static void setVolume(int volume) {
		Request.volume = volume;
	}
	public LocalDateTime getDor() {
		return dor;
	}
	public void setDor(LocalDateTime dor) {
		this.dor = dor;
	}
	public boolean isRevised() {
		return revised;
	}
	public void setRevised(boolean revised) {
		this.revised = revised;
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
	
	

}
// solo special es diferente porque el standard y el emergency son requests normales que solo varian en el relevance
// editar queries por la relacion request-patient
 class specialRequest extends Request {
	 
	public int plasma;
	public int platelets;
	public int hdl;
	public int haemoglobin;
	public int hematocrit;
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
	public int getHematocrit() {
		return hematocrit;
	}
	public void setHematocrit(int hematocrit) {
		this.hematocrit = hematocrit;
	}
	
}
