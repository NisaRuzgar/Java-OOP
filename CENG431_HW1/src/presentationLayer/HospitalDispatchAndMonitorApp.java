package presentationLayer;

import businessLayer.*;
import dataAccessLayer.DataAccess;

public class HospitalDispatchAndMonitorApp {
	
	public static void main(String[] args) {
		DataAccess dal = new DataAccess();
		HospitalMonitor hm = new HospitalMonitor();
		hm.init(dal);
	}
	
	
}
