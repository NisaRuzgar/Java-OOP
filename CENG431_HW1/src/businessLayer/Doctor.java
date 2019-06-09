package businessLayer;

public class Doctor extends Staff{
	
	public Doctor(String name){
		super(name);
		super.setJobTitle(TypeOfStaff.DOCTOR);
	}

	@Override
	public boolean takeAction(Task t) {
		// TODO Auto-generated method stub
		return false;
	}

}

