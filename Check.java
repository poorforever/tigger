import ast.* ;

public class Check{
		
	public static void main(String args[])  throws AssertionError{
		VisiteurPrint printer = new VisiteurPrint();
		VisiteurEvaluation visiteur = new VisiteurEvaluation();
		Expression foo = new Addition(new Multiplication(new Constante(2), new Constante(3)), new Division (new Constante(64), new Constante(8)));
		foo = new Egal(foo, new Constante(14));
		System.out.println(foo.accepter(printer));
		assert foo.accepter(visiteur) == 1;
		
		foo = new Addition(
		new Moins(new Multiplication(new Constante(-2), new Constante(-3))), new Division(new Moins(new Constante(24)), new Plus(new Constante(-2))));			
		foo = new Egal(foo, new Constante(foo.accepter(visiteur)));
		System.out.println(foo.accepter(printer));	
	}

}
