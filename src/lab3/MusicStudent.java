/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Scotty
 * The abstract super class should come first because the interface represents
 * a property of the class.
 */
public abstract class MusicStudent extends Person {
     private MusicalTalent musicalTalent;
    
    public MusicStudent (){
        
    }

    public MusicalTalent getMusicalTalent() {
        return musicalTalent;
    }

    public void setMusicalTalent(MusicalTalent musicalTalent) {
        this.musicalTalent = musicalTalent;        
    }
    
    
    
}
