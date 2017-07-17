package ast;
import java.util.*;

public class FunctionDec extends Expression {

	private String aName;
	private List<Expression> args;
	private Expression aValeur;

	public FunctionDec(String pName, Expression pValeur, List<Expression> args) {
		this.aValeur = pValeur;
		this.aName = pName;
		this.args = args;
	}

	public FunctionDec(String pName, Expression pValeur) {
		this(pName, pValeur, new ArrayList<Expression>() ) ;
	}
	
	public Expression valeur() {
		return aValeur;
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
