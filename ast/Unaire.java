package ast;

public abstract class Unaire extends Expression {

    protected Expression op1;

    public Unaire(Expression op1) {
        this.op1 = op1;
    }

    public Expression op1() {
        return op1;
    }

}
