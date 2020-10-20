package commandes;

import visitors.PrePostVisitable;
import visitors.Visitable;
import java.util.Collection;

public class GroupeClient implements PrePostVisitable, Visitable {

    String name;
    Collection<Client> clients;

    public GroupeClient(String a){this.name=a;}

    public String GetName() {return this.name;}

    public void addClient(Client a){}
    public void addCommande(String a, Commande b){}
    public void addLigne(String a, String b, Ligne c){}
    public void accept(PrePostVisitor a){}
    public void accept(Visitor a){}
}
