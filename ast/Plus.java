package ast;

public class Plus extends Unaire {

    public Plus(Expression op1) {
        super(op1);
    }

    public <T> T accepter(VisiteurExpression<T> v) {
        return v.visite(this);
    }


}
