package ast;

public class VisiteurVariable extends VisiteurParDefaut<String> {

	public String visite(VariableUse vu)
	{
		return vu.name();
	}
}
