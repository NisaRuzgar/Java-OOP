package businessLayer;

public class Task {
	private String nameOfTask;
	private double successPersentage;
	private TypeOfStaff performerStaff;
	
	public Task(String nameOfTask, double successPersentage, TypeOfStaff performerStaff) {
		this.nameOfTask = nameOfTask;
		this.successPersentage = successPersentage;
		this.performerStaff = performerStaff;
	}
	
	public String getNameOfTask() {
		return nameOfTask;
	}
	public void setNameOfTask(String nameOfTask) {
		this.nameOfTask = nameOfTask;
	}
	public double getSuccessPersentage() {
		return successPersentage;
	}
	public void setSuccessPersentage(double successPersentage) {
		this.successPersentage = successPersentage;
	}
	public TypeOfStaff getPerformerStaff() {
		return performerStaff;
	}
	public void setPerformerStaff(TypeOfStaff performerStaff) {
		this.performerStaff = performerStaff;
	}

}
