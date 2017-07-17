package ast;
import java.util.*;

public class LetInFunction extends Expression{

	private List<FunctionDec> let;
	private List<Expression> in;
	
	public LetInFunction(List<FunctionDec> let, List<Expression> in)
	{
		this.let = let;
		this.in = in;
	}
	
	public List<FunctionDec> let(){
		return this.let;
	}
	
	public List<Expression> in(){
		return this.in;
	}
	
	public <T> T accepter(VisiteurExpression<T> v) {
		return v.visite(this);
	}
	
	

		
}
