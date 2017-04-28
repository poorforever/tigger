package ast;

public class Affectation extends Expression {

	private Variable v;
	private Expression exp;

	public Affectation(Variable v, Expression exp) {
		this.v = v;
		this.exp = exp;
	}

	public <T> T accepter(VisiteurExpression<T> vi) {
		return vi.visite(this);
	}

	public Expression exp() {
		return exp;
	}

	public Variable v() {
		return v;
	}

}
