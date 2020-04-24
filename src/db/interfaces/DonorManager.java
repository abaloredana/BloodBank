package db.interfaces;

import java.time.LocalDateTime;
import java.util.List;
import pojos.Donor;


public interface DonorManager {
	
	public void viewDonor (int donorid);
	public void newDonor (Donor donor);
	public Donor getDonor (int donorid);
	public Donor getDonor (int donorid, int bbid);
	public Donor getDonor (int bbid, String name, String surname);
	public List<Donor> getAllDonors (int bbid);
	public List<Donor> getDonorsByGender(char gender);
	public List<Donor> getDonorsByDOB(LocalDateTime dob);
	public List<Donor> getDonorsByCity (String city);
	public List<Donor> getDonorsByPostCode (String postCode);
	public List<Donor> getDonorsByABO (String abo);
	public void updateDonor (Donor donor);
	
	
	

}
