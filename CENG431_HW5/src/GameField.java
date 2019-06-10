
public class GameField {
	private final int locationNumber;
	private boolean isEmpty;
	private final boolean isAvailable;
	
	public GameField(int locationNumber, boolean isAvailable) {
		this.locationNumber = locationNumber;
		this.isEmpty = true;
		this.isAvailable = isAvailable;
		
	}
	
	public void setIsEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	
	public boolean getIsEmpty() {
		return isEmpty;
	}
	
	public int getLocationNumber() {
		return locationNumber;
	}
	
}
	
