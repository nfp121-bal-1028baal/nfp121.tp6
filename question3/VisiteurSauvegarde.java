package question3;
import java.util.HashMap;
import question1.*;

/**
 * Write a description of class VisiteurSauvegarde here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VisiteurSauvegarde implements question1.Visiteur<HashMap<Cotisant, Integer>>{
    public HashMap<Cotisant, Integer> visite(Contributeur c){ 
        //Contributeur clone = new Contributeur(c.nom(),c.solde());         
        HashMap<Cotisant, Integer> toSave = new HashMap<Cotisant, Integer>();                             
        Integer solde = new Integer(c.solde());                             
        toSave.put(c, solde); return toSave; 
    } 
    /**
     * Constructor for objects of class VisiteurSauvegarde
     */
  public HashMap<Cotisant, Integer> visite(GroupeDeContributeurs g) {                            
        HashMap<Cotisant, Integer> toSave = new HashMap<Cotisant, Integer>(); 
        for(Cotisant c: g.getChildren()){                             
            HashMap<Cotisant, Integer> nouveaux = c.accepter(this);                             
            toSave.putAll(nouveaux); 
        } 
        return toSave; 
    } 
}
   
     