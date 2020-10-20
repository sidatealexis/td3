package commandes;

import visitors.PrePostVisitable;
import visitors.PrePostVisitor;
import visitors.Visitable;
import visitors.Visitor;

public class Commande implements PrePostVisitable, Visitable {

    String name;
    public Commande(String a){this.name=a;}

    public String GetName() {return this.name;}

    public void addLigne(Ligne a){}
    public void accept(PrePostVisitor a){}
    public void accept(Visitor a){}
}
