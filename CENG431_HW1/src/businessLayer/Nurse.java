package businessLayer;

public class Nurse extends Staff{

	public Nurse(String name) {
		super(name);
		super.setJobTitle(TypeOfStaff.NURSE);
	}

	@Override
	public Result takeAction(Task t) {
		Result r = super.getResult(t);
		System.out.println(t.getPerformerStaff().toString() + " assigned to " + t.getNameOfTask() ". Result is :" + r.toString());
		return r;
	}

}

