package Question7.example2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saikumar Mylavarapu
 */
public enum Dumbbles {
    
    ONE(3),TWO(5),THREE(10);
    
    public int weight;

    private Dumbbles(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    
    
}
