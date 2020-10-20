package visitors;

import commandes.Client;
import commandes.Commande;
import commandes.GroupeClient;
import commandes.Ligne;

public interface Visitor extends AbstractVisitor {
    void visit(GroupeClient);
    void visit(Client);
    void visit(Commande);
    void visit(Ligne);
}
