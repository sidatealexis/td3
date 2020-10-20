package visitors;

import commandes.Client;
import commandes.Commande;
import commandes.GroupeClient;
import commandes.Ligne;

public interface PrePostVisitor extends AbstractVisitor {
    void preVisit(GroupeClient);
    void preVisit(Client);
    void preVisit(Commande);
    void preVisit(Ligne);
    void postVisit(GroupeClient);
    void postVisit(Client);
    void postVisit(Commande);
    void postVisit(Ligne);
}
