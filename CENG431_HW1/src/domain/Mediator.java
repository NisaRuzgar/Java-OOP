package domain;

public interface Mediator {
		 /**
	 	 * Mediator interface which encapsulates communication between Colleagues.
	 	 */
		Result assignTask(Task task, Staff originator);
		void monitorPatient();
		void monitorStaff();

}
