package ast;

public class VariableDec extends Expression {

	private String aName;
	private Expression aValeur;

	public VariableDec(String pName, Expression pValeur) {
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
