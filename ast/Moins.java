package ast;

public class Moins extends Unaire {

    public Moins(Expression op1) {
        super(op1);
    }

    public <T> T accepter(VisiteurExpression<T> v) {
        return v.visite(this);
    }


}
