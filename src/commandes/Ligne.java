package commandes;

import visitors.PrePostVisitable;
import visitors.PrePostVisitor;
import visitors.Visitable;
import visitors.Visitor;

public class Ligne implements PrePostVisitable, Visitable {
    public String name;
    public int sum;

    public Ligne(String a){this.name=a;}
    public Ligne(String a, int b){this.name=a; this.sum=b;}
    public String GetName() {return this.name;}

    @Override
    public void accept(PrePostVisitor a)
    {
        a.preVisit(this);
        a.postVisit(this);
    }

    @Override
    public void accept(Visitor a)
    {
        a.visit(this);
    }
}
