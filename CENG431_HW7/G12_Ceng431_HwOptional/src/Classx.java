package src;

import java.util.ArrayList;

public class Classx {
	private String name;
	private ArrayList<ClassComponent> classComponents;
	
	public Classx(String name) {
		this.name = name;
		classComponents = new ArrayList<ClassComponent>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<ClassComponent> getClassComponents() {
		return classComponents;
	}

	public void addClassComponent(ClassComponent classComp) {               //remove  methodu?
		classComponents.add(classComp);
	}
	
	public int getNumberOfMethods() {
		int total = 0;
		for(ClassComponent m : classComponents) {
			if(m.getClass() == Method.class) {
				total = total + 1;
			}
		}
		System.out.println("Total Methods per Class" + total);
		return total;
	}
	
	public int getNumberOfVariables() {
		int total = 0;
		for(ClassComponent cc : classComponents ) {
			total = total + cc.getNumberOfVariables();
		}
		return total;
	}
	

	
	
}
