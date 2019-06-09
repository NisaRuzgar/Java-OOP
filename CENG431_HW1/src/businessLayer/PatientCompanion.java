package businessLayer;

public class PatientCompanion extends Staff{

	public PatientCompanion(String name) {
		super(name);
		super.setJobTitle(TypeOfStaff.PATIENT_COMPANION);
	}

	@Override
	public Result takeAction(Task t) {
		
		return false;
	}
	
}
