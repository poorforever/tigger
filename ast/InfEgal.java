package ast;

public class InfEgal extends Binaire {

	public InfEgal(Expression op1, Expression op2) {
		super(op1, op2);
	}

	public <T> T accepter(VisiteurExpression<T> v) {
		return v.visite(this);
	}

}
