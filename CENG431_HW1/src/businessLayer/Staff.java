package businessLayer;

public abstract class Staff extends Person{
	private String status; //make it enumeration
	private TypeOfStaff jobTitle; //enumeration
	
	public Staff(String name) {
		super(name);
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public TypeOfStaff getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(TypeOfStaff jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public abstract Result takeAction(Task t);
	


}