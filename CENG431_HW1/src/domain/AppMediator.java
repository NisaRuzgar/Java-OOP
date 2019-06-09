package domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dataAccess.DataAccess;

public class AppMediator implements Mediator {
	List<Person> patients;
	List<Staff> staffs;
	List<Task> tasks;

	public AppMediator() {
		patients = new ArrayList<Person>();
		staffs = new ArrayList<Staff>();
		tasks = new ArrayList<Task>();
	}

	public void init(DataAccess dal) { 
		
		/// Staff initialization
		ArrayList<String[]> staffData = dal.readData("Staff.txt");
		
		for(String[] e : staffData) {
			Staff s = null;
			if(e[0].equals("DOCTOR")) {
				s = new Doctor(e[1], e[2], Integer.parseInt(e[3]));
			}
			else if(e[0].equals("NURSE")) {
				s = new Nurse(e[1], e[2]);
			}
			else if(e[0].equals("PATIENT_COMPANION")) {
				s = new PatientCompanion(e[1], e[2]);
			}
			else {
				System.out.println("Invalid Type");
			}
			this.addStaff(s);
		}
		
		/// Patient initialization 
		ArrayList<String[]> patientData = dal.readData("Patient.txt");
		
		for(String[] e : patientData) {
			Patient p = new Patient(e[0],e[1], Integer.parseInt(e[2]) );
			this.addPatient(p);
		}
		
		/// Task initialization
		ArrayList<String[]> taskData = dal.readData("Task.txt");
		
		for(String[] e : taskData) {
			Task t = new Task(e[0],Double.parseDouble(e[1]), Job.valueOf(e[2]) );
			tasks.add(t);
		}
	}
	
	
	public void addPatient(Patient patient) {
		patients.add(patient);
		System.out.println("New patient added!");

	}
	
	public void removePatient(Patient patient) {
		Iterator<Person> iter = patients.iterator();
		while (iter.hasNext()) {
			Person p = iter.next();
			if(p.equals(patient)) {
				patients.remove(p);
				System.out.println("Patient is dismissed from hospital.");
			}		
		}
	}
	
	public void addStaff(Staff person) {
		staffs.add(person);
		System.out.println("New staff added!");


	}
	
	
	@Override
	public Result assignTask(Task task, Staff originator) {
		return originator.doAction(task);
	}

	@Override
	public void monitorPatient() {
		Iterator<Person> iter = patients.iterator();
		while (iter.hasNext()) {
			Person p = iter.next();
			System.out.println(p.getName() + " " + p.getSurname());
		}
		
	}

	@Override
	public void monitorStaff() {
		Iterator<Staff> iter = staffs.iterator();
		while (iter.hasNext()) {
			Staff s = iter.next();
			System.out.println(s.getJob() + " " + s.getName() + " " + s.getSurname());
		}
	}

	public Task getTask(int i) {
		// TODO Auto-generated method stub
		return tasks.get(i);
	}
	
	public Staff getStaff(Task task) {
		// TODO Auto-generated method stub
		for(Staff staff: staffs) {
			if (staff.getJob()== task.getPerformerStaff()) {
				return staff;
			}
				
			}
		return null;
		}
	

}