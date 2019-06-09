package domain;

public class Doctor extends Staff {
	
	private int roomNum;

	public Doctor(String name, String surname, int roomNum) {
		super(name, surname);
		super.setJob(Job.DOCTOR);
		this.roomNum = roomNum;
	}
	
	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public Result doAction(Task task) {
		 Result result = task.getResult();
	     System.out.println("Doctor Perform Task: " + task.getNameOfTask() + "\nDoctor "+ task.getNameOfTask()+" Result is: " + result.toString());
		 return result;
	}

}
 