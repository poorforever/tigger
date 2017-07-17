package ast;

public class VisiteurAst extends VisiteurParDefaut<String> {



    public String visite(Constante c) 
    {
		return "Constante("+Integer.toString(c.valeur())+")";
	}


	public String visite(Division d) 
	{
		return "Division(" + d.op1().accepter(this) + "," + d.op2().accepter(this)
				+ ")";
	}

	public String visite(Addition a) {
		return "Addition(" + a.op1().accepter(this) + "," + a.op2().accepter(this)
				+ ")";
	}

	public String visite(Multiplication m) {
		return "Multiplication(" + m.op1().accepter(this) + "," + m.op2().accepter(this)
				+ ")";
	}

	public String visite(Soustraction s) {
		return "Soustraction(" + s.op1().accepter(this) + "," + s.op2().accepter(this)
				+ ")";
	}
	
	public String visite(Plus p) {
		return "Plus(" + p.op1().accepter(this)+")";
	}
	
	public String visite(Moins m) {
		return "Moins(" + m.op1().accepter(this)+")";
	}




}
