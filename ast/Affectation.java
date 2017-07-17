package ast;

public class Affectation extends Expression {

	private String name;
	private Expression exp;

	public Affectation(String name, Expression exp) {
		this.name = name;
		this.exp = exp;
	}

	public <T> T accepter(VisiteurExpression<T> vi) {
		return vi.visite(this);
	}

	public Expression exp() {
		return this.exp;
	}

	public String name() {
		return this.name;
	}

}
