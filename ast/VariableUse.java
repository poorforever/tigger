package ast;

public class VariableUse extends Expression {

	private String aName;

	public VariableUse(String pName) {
		this.aName = pName;
	}

	public String name(){
		return aName;
	}

	public <T> T accepter(VisiteurExpression<T> v) {
		return v.visite(this);
	}
	
}
