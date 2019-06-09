package domain;

public class PatientCompanion extends Staff {

	public PatientCompanion(String name, String surname) {
		super(surname, name);
		super.setJob(Job.PATIENT_COMPANION);
	}
	
	public Result doAction(Task task) {
		 Result result = task.getResult();
	     System.out.println("Patient Companion Perform Task: " + task.getNameOfTask() + " Result is: " + result.toString());
		 return result;
	}

}
 