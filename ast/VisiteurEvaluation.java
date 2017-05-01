package ast;

import java.util.*;

public class VisiteurEvaluation extends VisiteurParDefaut<Integer> {


	private Scope scope = new Scope();
	
	public VisiteurEvaluation(){
		this.scope.scopeBegin();
	}
  
   	public Integer visite(Constante c) 
    	{
		return c.valeur();
	}
	
	public Integer visite(Division d) 
	{
		return d.op1().accepter(this) / d.op2().accepter(this);
	}
	
	public Integer visite(Addition a) 
	{
		return a.op1().accepter(this) + a.op2().accepter(this);
	}

	public Integer visite(Multiplication m) 
	{
		return m.op1().accepter(this) * m.op2().accepter(this);
	}

	public Integer visite(Soustraction s) 
	{
		return s.op1().accepter(this) - s.op2().accepter(this);
	}
	
	public Integer visite(Plus p)
	{
		return +p.op1().accepter(this);
	}
	
	public Integer visite(Moins m)
	{
		return -m.op1().accepter(this);
	}
	
	
	public Integer visite(Egal e) 
	{
		if (e.op1().accepter(this) == e.op2().accepter(this)){
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public Integer visite(Different d) 
	{
		if (d.op1().accepter(this) != d.op2().accepter(this)){
			return 1;
		}
		else {
			return 0;
		}
	}

	public Integer visite(InfEgal ie) 
	{
		if (ie.op1().accepter(this) <= ie.op2().accepter(this)){
			return 1;
		}
		else{
			return 0;
		}
	}

	public Integer visite(Inf i) 
	{
		if (i.op1().accepter(this) < i.op2().accepter(this)){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public Integer visite(SupEgal se)
	{
		if (se.op1().accepter(this) >= se.op2().accepter(this)){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public Integer visite(Sup s)
	{
		if (s.op1().accepter(this) > s.op2().accepter(this)){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public Integer visite(Variable v)
	{
		return (v.valeur()).accepter(this);
	}
	
	public Integer visite(VariableUse vu)
	{
		return scope.getVar(vu.name());
	}
	
	
	public Integer visite(IfThenElse ite)
	{
		if(ite.op1().accepter(this) != 0){
			return ite.op2().accepter(this);
		}
		else{
			return ite.op3().accepter(this);
		}
	}
	
	public Integer visite(LetIn li)
	{
		scope.scopeBegin();
		
		List<Variable> let = li.let();
		for(Variable v : let){
			try
				{this.scope.letIn(v.name(), v.valeur().accepter(this));}
			catch (Exception e) {e.printStackTrace(); System.out.println("err");}

		}		
		
		List<Expression> in = li.in();
		Integer res = 0;	
		for(Expression e : in) {
			res = e.accepter(this);		
		}
		scope.scopeEnd();
		
		return res;
	}
	
	public Integer visite(Print p){
		System.out.println(p.exp().accepter(this));
		return p.exp().accepter(this);
	}
	
	public Integer visite(Affectation a){
		this.scope.replaceIn(a.name(), a.exp().accepter(this));
		return a.exp().accepter(this);
	}
}
