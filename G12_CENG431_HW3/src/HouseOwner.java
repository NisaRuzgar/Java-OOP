
public class HouseOwner extends User {
	private House house;
	
	public HouseOwner(House house) {
		this.setHouse(house);
	}
	
	
	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
	
	
	
}
