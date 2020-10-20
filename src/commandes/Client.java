package commandes;

import visitors.PrePostVisitable;
import visitors.PrePostVisitor;
import visitors.Visitable;
import visitors.Visitor;

public class Client implements PrePostVisitable, Visitable {

    String name;
    public Client(String a){this.name=a;}
    public String GetName() {return this.name;}

    public void addCommande(Commande a){}
    public void addLigne(String a, Ligne b){}
    public void accept(PrePostVisitor a){}
    public void accept(Visitor a){}
}
