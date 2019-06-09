
public class GameField {
	private final int locationNumber;
	private boolean isEmpty;
	
	public GameField(int locationNumber) {
		this.locationNumber = locationNumber;
		this.isEmpty = true;
	}
	
	public void setIsEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	
	
}
	
