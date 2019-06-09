
public class Part extends Product {
	private StateOfPart state;
	
	public Part(String name) {
		super.setProductName(name);
	}

	public StateOfPart getState() {
		return state;
	}

	public void setState(StateOfPart state) {
		this.state = state;
	}
}
