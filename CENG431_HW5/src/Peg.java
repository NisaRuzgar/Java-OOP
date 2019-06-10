
public class Peg {
	private Color color;
	private int locationNumber;
	
	public Peg(Color color, int locationNumber) {
		setColor(color);
		setLocationNumber(locationNumber);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getLocationNumber() {
		return locationNumber;
	}

	public void setLocationNumber(int locationNumber) {
		this.locationNumber = locationNumber;
	}
}
