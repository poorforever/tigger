package ast;

public class Variable extends Expression {

	private String aName;
	private Expression aValeur;

	public Variable(String pName, Expression pValeur) {
		this.aValeur = pValeur;
		this.aName = pName;
	}

	public Expression valeur() {
		return aValeur;
	}

	public String name(){
		return aName;
	}
	public <T> T accepter(VisiteurExpression<T> v) {
		return v.visite(this);
	}

}
