/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pseudorandomsequencevisualizer;

/**
 *
 * @author jguty
 */
public class PseudoRandomGenerator {

    private int modulus     = (int)Math.pow(2, 32);
    private int multiplier  = 1664525;
    private int increment   = 1013904223;
    
    private int currentPseudoRandom;

    public PseudoRandomGenerator(int pSeed) {
    
        this.currentPseudoRandom = pSeed;
    
    }    

    public void nextPseudoRandom(){
        this.currentPseudoRandom = (this.multiplier * this.currentPseudoRandom + this.increment) % this.modulus;
    }
    
    public Memento save(){
        return new Memento(this.currentPseudoRandom);
    }
    
    public int getModulus() {
        return modulus;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public int getIncrement() {
        return increment;
    }

    public int getCurrentPseudoRandom() {
        return currentPseudoRandom;
    }        
    
    public void setModulus(int modulus) {
        this.modulus = modulus;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public void setCurrentPseudoRandom(int pNewSeed) {
        this.currentPseudoRandom = pNewSeed;
    }             
    
    
    
}

class Memento {
    
    private final int currentPseudoRandom;

    public int getCurrentPseudoRandom() {
        return currentPseudoRandom;
    }
    
    public Memento(int currentPseudoRandom) {
        this.currentPseudoRandom = currentPseudoRandom;
    }      

    @Override
    public String toString() {
        return currentPseudoRandom+"";
    }
    
    
    
}