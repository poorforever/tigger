package ast;

public abstract class VisiteurExpression<T>{

  public abstract T visite(Constante c);
  public abstract T visite(Division d);
  public abstract T visite(Addition a);
  public abstract T visite(Multiplication m);
  public abstract T visite(Soustraction s);
  
  public abstract T visite(Plus p);
  public abstract T visite(Moins m);
  
  public abstract T visite(Egal e);
  public abstract T visite(Different d);
  public abstract T visite(SupEgal se);
  public abstract T visite(Sup s);
  public abstract T visite(InfEgal ie); 
  public abstract T visite(Inf i); 
  
  public abstract T visite(VariableDec vd);  
  public abstract T visite(VariableCall vc);
  
  public abstract T visite(LetIn li);

  public abstract T visite(Affectation a);
  
  public abstract T visite(IfThenElse ite);
  public abstract T visite(Print p);
  
  public abstract T visite(Help p);
  
  public abstract T visite(FunctionDec fd);
  public abstract T visite(FunctionCall fc);
  public abstract T visite(LetInFunction lif);

}

