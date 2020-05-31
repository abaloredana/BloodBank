package pojos;

import java.sql.Date;


public class Request {
	public int id;
	public int volume;
	public Date dor;
	public int durability;
	public int relevance;
	
	public Request() {
		super();
	}
	
	public Request(int volume, Date dor, int durability, int relevance) {
		super();
		this.volume = volume;
		this.dor = dor;
		this.durability = durability;
		this.relevance = relevance;
	}


	public Request(int id, int volume, Date dor, int durability, int relevance) {
		super();
		this.id = id;
		this.volume = volume;
		this.dor = dor;
		this.durability = durability;
		this.relevance = relevance;
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

	@Override
	public String toString() {
		return "Request [id=" + id + ", volume=" + volume + ", dor=" + dor + ", durability=" + durability
				+ ", relevance=" + relevance + "]";
	}
	
	

}

