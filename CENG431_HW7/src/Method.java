package src;

import java.util.ArrayList;
import java.util.Iterator;

public class Method implements ClassComponent {
	private String name;
	private ArrayList<Variable> variableList;
	
	public Method(String name) {
		this.name = name;
		variableList = new ArrayList<Variable>();
	}
	
	public ArrayList<Variable> getVariableList(){
		return variableList;
	}
	
	public void addVariable(Variable v) {
		variableList.add(v);
	}
	
	public boolean removeVariable(Variable v) {
		Iterator<Variable> iter = variableList.iterator();
		while (iter.hasNext()) {
			Variable current = iter.next();
			if(current.equals(v)) {
				variableList.remove(current);
				return true;
			}		
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getNumberOfVariables() {
		return variableList.size();
	}
	
	
	
}
