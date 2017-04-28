package ast;


public abstract class Expression {

    public abstract <T> T accepter(VisiteurExpression<T> v);

}
