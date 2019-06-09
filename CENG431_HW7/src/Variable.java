package src;

public class Variable implements ClassComponent { 
	private String name;
	
	public Variable(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getNumberOfVariables() {
		return 1;
	}
}
