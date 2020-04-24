package db.interfaces;

import java.time.LocalDateTime;
import java.util.List;
import pojos.Patient;

public interface PatientManager {
	public void newPatient (Patient patient);
	public Patient getPatient (int patientid, int ihospitalid);
	public Patient getPatient (int hosptalid, String name, String surname);
	public List<Patient> getAllPatients (int hosptalid);
	public List<Patient> getPatientsByGender(char gender);
	public List<Patient> getPatientsByDOB(LocalDateTime dob);
	public List<Patient> getPatientsByCity (String city);
	public List<Patient> getPatientsByPostCode (String postCode);
	public List<Patient> getPatientsByABO (String abo);
	public List<Patient> getPatientsByDr (String drname );
	public void viewPatient (int patientid);
	public void updatePatient (Patient patient);
	public void deletePatient (int id);
	
}
