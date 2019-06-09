package domain;

public class Patient extends Person {
	private int roomNumber;
	
	public Patient(String name, String surname, int roomNumber) {
		super(name, surname);
		this.roomNumber = roomNumber;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

}
