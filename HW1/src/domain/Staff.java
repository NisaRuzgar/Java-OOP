package domain;

public abstract class Staff extends Person {
	private Job job;

	public Staff(String name, String surname) {
		super(name, surname);
	}
	
	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public abstract Result doAction(Task task);
	
	

}
 