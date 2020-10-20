package visitors;

import commandes.Client;
import commandes.Commande;
import commandes.GroupeClient;
import commandes.Ligne;
import visitors.Visitor;

public class PrintRapportCommandes implements Visitor
{
    public PrintRapportCommandes(){}
    public void visit(GroupeClient g){System.out.println(String.format("Je visite un groupe", g.GetName()));}
    public void visit(Client c){System.out.println("Je visite un client");}
    public void visit(Commande o){System.out.println("Je visite une commande");}
    public void visit(Ligne l){System.out.println(String.format("Je visite une ligne", l.GetName()));}
}
