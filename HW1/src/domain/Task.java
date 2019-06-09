package domain;

import java.util.Random;

public class Task {
	private String nameOfTask;
	private double successPersentage;
	private Job performerStaff;
	
	public Task(String nameOfTask, double successPersentage, Job performerStaff) {
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
	public Job getPerformerStaff() {
		return performerStaff;
	} 
	public void setPerformerStaff(Job performerStaff) {
		this.performerStaff = performerStaff;
	}
	
	public Result getResult() {
		double successPer = this.getSuccessPersentage();
		Random r = new Random();
		double random = 1 + r.nextDouble() * 99;
		if(random <= successPer)
			return Result.SUCCESS;
		return Result.FAILURE;
	}
}
