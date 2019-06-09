package businessLayer;
import java.util.ArrayList;
import java.util.Iterator;

import dataAccessLayer.DataAccess;

public class HospitalMonitor {
	ArrayList<Patient> patientList;
	ArrayList<Staff> staffList ;
	
	public HospitalMonitor() {
		patientList = new ArrayList<Patient>();
		staffList = new ArrayList<Staff>();
	}
	
	public void monitorHospitalStaff(ArrayList<Staff> staffList) {
		Iterator<Staff> iter = staffList.iterator();
		while (iter.hasNext()) {
			Staff s = iter.next();
			System.out.println(s.getJobTitle() + " " + s.getName());
		}
	}
	
	
	public void monitorPatients(ArrayList<Patient> patientList) {
		Iterator<Patient> iter = patientList.iterator();
		while (iter.hasNext()) {
			Patient p = iter.next();
			System.out.println(p.getName());
		}
	}
	
	public boolean assignTaskToStaff(Task task, Staff staff) {
		return staff.takeAction(task);
	}
	
	public boolean redirectStaffToPatientRoom(Staff staff, Patient patient) {
		return staff.goToPatientsRoom(patient);
	}
	
	public void init(DataAccess dal) {
		dal.readData("Patients.txt", patientList);
		dal.readData("Doctors.txt", staffList);
		dal.readData("Staffs.txt", staffList);
		dal.readData("PatientCompanions.txt", staffList);
		
		
		
	}
}
