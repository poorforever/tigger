package ast;

public class Variable extends Expression {

	private String aName;
	private int aValeur;

	public Variable(String pName, int pValeur) {
		this.aValeur = pValeur;
		this.aName = pName;
	}

	public int valeur() {
		return aValeur;
	}

	public String name(){
		return aName;
	}
	public <T> T accepter(VisiteurExpression<T> v) {
		return v.visite(this);
	}
	
}
