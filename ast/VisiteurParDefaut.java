package ast;

public class VisiteurParDefaut<T> extends VisiteurExpression<T>{

  public T visite(Constante c){return null;}
  public T visite(Division d){return null;}
  public T visite(Addition a){return null;}
  public T visite(Multiplication m){return null;}
  public T visite(Soustraction s){return null;}
  
  public T visite(Plus p){return null;}
  public T visite(Moins m){return null;}
  
  public  T visite(Egal e){return null;}
  public  T visite(Different d){return null;}
  public  T visite(SupEgal se){return null;}
  public  T visite(Sup s){return null;}
  public  T visite(InfEgal ie){return null;}
  public  T visite(Inf i){return null;}
  public  T visite(VariableDec vd){return null;}
  public  T visite(VariableCall vc) {return null;}
  
  public  T visite(LetIn li) {return null;}
  public  T visite(Affectation a) {return null;}
  
  public  T visite(IfThenElse ite) {return null;}
  public  T visite(Print p) {return null;}
  
  public T visite(Help h){return null;}
  
  public T visite(FunctionDec fd){return null;}
  public T visite(FunctionCall fd){return null;}
  public T visite(LetInFunction lif){return null;}
}
