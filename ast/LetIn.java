
package ast;
import java.util.*;

public class LetIn extends Expression{

	private List<VariableDec> let;
	private List<Expression> in;
	
	public LetIn(List<VariableDec> let, List<Expression> in)
	{
		this.let = let;
		this.in = in;
	}
	
	public List<VariableDec> let(){
		return this.let;
	}
	
	public List<Expression> in(){
		return this.in;
	}
	
	public <T> T accepter(VisiteurExpression<T> v) {
		return v.visite(this);
	}
	
	

		
}
