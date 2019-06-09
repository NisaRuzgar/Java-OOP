
public class StateOfPart implements State {
	private int processDay;

	public int getProcessDay() {
		return processDay;
	}

	public void setProcessDay(int processDay) {
		this.processDay = processDay;
	}
	
	public void doAction() {System.out.print("hh");}
}
