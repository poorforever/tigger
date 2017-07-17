package ast;

import java.util.*;

public class VisiteurPrint extends VisiteurParDefaut<String> {

    public String visite(Constante c) 
    {
		return Integer.toString(c.valeur());
	}


	public String visite(Division d) 
	{
		return "("+d.op1().accepter(this) + "/" + d.op2().accepter(this) + ")";
	}

	public String visite(Addition a) {
		return a.op1().accepter(this) + "+" + a.op2().accepter(this);
	}

	public String visite(Multiplication m) {
		return "("+m.op1().accepter(this) + "*" + m.op2().accepter(this)+")";
	}

	public String visite(Soustraction s) {
		return s.op1().accepter(this) + "-" + s.op2().accepter(this);
	}
	
	public String visite(Plus p) {
		return "+("+p.op1().accepter(this)+")";
	}

	public String visite(Moins m) {
		return "-("+m.op1().accepter(this)+")";
	}
	
	public  String visite(Egal e){
	  	return e.op1().accepter(this)+"="+e.op2().accepter(this);
	  }
	   
 	public  String visite(Different d){
 		return d.op1().accepter(this)+"<>"+d.op2().accepter(this);
 	}

  	public  String visite(SupEgal se){
 		return se.op1().accepter(this)+">="+se.op2().accepter(this);
 	 }

  	public  String visite(Sup s){
 		return s.op1().accepter(this)+">"+s.op2().accepter(this);
 	 }

	public  String visite(InfEgal ie){
 		return ie.op1().accepter(this)+"<="+ie.op2().accepter(this);
 	}

	public  String visite(Inf i){
 		return i.op1().accepter(this)+"<"+i.op2().accepter(this);
 	}
 	
   	public  String visite(IfThenElse ite) {
   		return "if "+ite.op1().accepter(this)+" then "+ite.op2().accepter(this)+" else "+ite.op3().accepter(this);
   	}
 	
 	public  String visite(VariableDec vd){
 		return vd.name()+"="+vd.valeur().accepter(this);
 	}
 	
  	public String visite(VariableCall vc) {
  		return vc.name();
  	}
  	
  	public String visite(LetIn li) {
  		List<VariableDec> let = li.let();
  		List<Expression> in = li.in();
		String temp = new String("let \n");
  		
  		for(VariableDec vd : let){
  			temp = "\t"+temp+vd.accepter(this)+"\n";
  		}
		
		temp = temp +"\n";
  		for(Expression e : in){
  			temp = "\t"+temp+e.accepter(this)+"\n";
  		}
  		
  		temp = temp+"end";
  		return temp; 
  		
  		}
  	
//  	public  T visite(Affectation a) {return null;}
  
  	//public  T visite(Print p) {return null;}


}
