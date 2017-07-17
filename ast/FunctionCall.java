package ast;
import java.util.*;

public class FunctionCall extends Expression {

	private String aName;
	private List<Expression> args;

	public FunctionCall(String pName, List<Expression> args) {
		this.aName = pName;
		this.args = args;
	}

	public String name(){
		return aName;
	}
	
	public List<Expression> args(){
		return this.args;
	}
	public <T> T accepter(VisiteurExpression<T> v) {
		return v.visite(this);
	}

}
