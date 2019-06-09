package src;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaProject {
	private String nameOfProject;
	private ArrayList<Classx> classList;

	public JavaProject(String nameOfProject) {
		this.nameOfProject = nameOfProject;
		classList = new ArrayList<Classx>();
	}
	
	public String getNameOfProject() {
		return nameOfProject;
	}

	public void setNameOfProject(String nameOfProject) {
		this.nameOfProject = nameOfProject;
	}
	
	public ArrayList<Classx> getClassList() {
		return classList;
	}

	public void setClassList(ArrayList<Classx> classes) {
		this.classList = classes;
	}
	
	public void addClass(Classx c) {
		classList.add(c);
	}

	public boolean deleteClass(Classx c) {
		Iterator<Classx> iter = classList.iterator();
		while (iter.hasNext()) {
			Classx current = iter.next();
			if(current.equals(c)) {
				classList.remove(current);
				return true;
			}		
		}
		return false;
	}
	
	public int getNumberOfClasses() {
		return classList.size();
	}
	
	public double getAvgNumbOfMethodsPerClass() {
		int numbOfClasses = getNumberOfClasses();
		int totalMethods = 0;
		
		for(Classx c : classList) {
			totalMethods = totalMethods + c.getNumberOfMethods();
		}
		return (double)totalMethods / numbOfClasses;
	}
	
	
	public double getAvgNumbOfVariablesPerClass() {
		int numbOfClasses = getNumberOfClasses();
		int numbOfVariables = 0;
		
		for(Classx c : classList) {
			numbOfVariables = numbOfVariables + c.getNumberOfVariables();
		}
		return (double)numbOfVariables / numbOfClasses;
	}
	
	
	public double getAvgNumbOfVariablesPerMethod() {
		int totalMethods = 0;
		int totalVariablesOfMethods = 0;
		
		for(Classx c : classList) {
			totalMethods = totalMethods + c.getNumberOfMethods();
			for(ClassComponent cc : c.getClassComponents()) {
				if(cc.getClass() == Method.class) {
					totalVariablesOfMethods = totalVariablesOfMethods + cc.getNumberOfVariables();
				}
			}
		}
		return (double)totalVariablesOfMethods / totalMethods;
	}
	
}
