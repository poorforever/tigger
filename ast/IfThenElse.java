package ast;

public class IfThenElse extends Expression {

	private Expression op1, op2, op3;

	public IfThenElse(Expression pop1, Expression pop2, Expression pop3) {
		op1 = pop1;
		op2 = pop2;
		op3 = pop3;
	}

	public Expression op1() {
		return op1;
	}
	
	public Expression op2() {
		return op2;
	}
	
	public Expression op3() {
		return op3;
	}

	public <T> T accepter(VisiteurExpression<T> v) {
		return v.visite(this);
	}

}
