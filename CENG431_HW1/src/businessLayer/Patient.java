package businessLayer;

public class Patient extends Person{
	private int roomNum;
	private int age;
	
	public Patient(String name, int roomNum) {
		super(name);
		this.roomNum = roomNum;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
