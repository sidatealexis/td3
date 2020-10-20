package visitors;

import commandes.Client;
import commandes.Commande;
import commandes.GroupeClient;
import commandes.Ligne;
import visitors.PrePostVisitor;

public class XMLRapportCommandes implements PrePostVisitor
{
    public void preVisit(GroupeClient){}
    public void preVisit(Client){}
    public void preVisit(Commande){}
    public void preVisit(Ligne){}
    public void postVisit(GroupeClient){}
    public void postVisit(Client){}
    public void postVisit(Commande){}
    public void postVisit(Ligne){}
}
