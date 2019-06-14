package question3;

import java.util.HashMap;
import question1.*;
/**
 * Write a description of class VisiteurRestitution here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VisiteurRestitution implements question1.Visiteur<Cotisant> { 
    private HashMap<Cotisant, Integer> state; 
    
    public VisiteurRestitution(HashMap<Cotisant, Integer> state){                             
        this.state=state; 
    } 
    /**
     * Constructor for objects of class VisiteurRestitution
     */
    public Cotisant visite(Contributeur c){ 
        int somme = this.state.get(c);                            
        c.affecterSolde(somme); 
        return c ; 
    } 
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   public Cotisant visite(GroupeDeContributeurs g){ 
        for(Cotisant c : g.getChildren()){
            c.accepter(this); 
        } 
        return g; 
    } 
} 
 
