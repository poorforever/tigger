package ast;
import java.util.*;

public class LetIn extends Expression{

	private List<Variable> let;
	private List<Expression> in;
	
	public LetIn(List<Variable> let, List<Expression> in)
	{
		this.let = let;
		this.in = in;
	}
	
	public List<Variable> let(){
		return this.let;
	}
	
	public List<Expression> in(){
		return this.in;
	}
	
	public <T> T accepter(VisiteurExpression<T> v) {
		return v.visite(this);
	}
	
	

		
}
