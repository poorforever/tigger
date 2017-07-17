package ast;

public class Print extends Expression {

	private Expression exp;

	public Print(Expression e) {
		this.exp = e;
	}
	
	public Expression exp(){
		return this.exp;
	}

	public <T> T accepter(VisiteurExpression<T> v) {
		return v.visite(this);
	}

}
