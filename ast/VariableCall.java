package ast;

public class VariableCall extends Expression {

	private String aName;

	public VariableCall(String pName) {
		this.aName = pName;
	}

	public String name(){
		return aName;
	}

	public <T> T accepter(VisiteurExpression<T> v) {
		return v.visite(this);
	}
	
}
