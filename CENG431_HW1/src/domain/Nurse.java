package domain;

public class Nurse extends Staff {

	public Nurse(String name, String surname) {
		super(name, surname);
		super.setJob(Job.NURSE);
	}
	
	public Result doAction(Task task) {
		 Result result = task.getResult();
	     System.out.println("Nurse Perform Task: " + task.getNameOfTask() + " Result is: " + result.toString());
		 return result;
	}

}
