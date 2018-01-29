/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameEntities;

/**
 *
 * @author Ethan
 */
public class Camel {

    public String name;
    public int thirst, hunger, energy;
        
    public Camel(String name, int thirst, int hunger, int energy) {
        this.name = name;
        this.thirst += thirst;
        if(this.thirst > 15)
            this.thirst = 15;
        this.hunger += hunger;
        if(this.hunger > 15)
            this.hunger = 15;
        this.energy += energy;
        if(this.energy > 15)
            this.energy = 15;
    }
    public Camel(String name) {
        this.name = name;
    }
    public Camel() {
        this.name = "No!";
        this.energy = 0;
        this.hunger = 0;
        this.thirst = 0;
    }
    
    public int getThirst() {
        return this.thirst;
    }
    public void adjustThirst(int value) {
        this.thirst += value;
        if(this.thirst > 15)
            this.thirst = 15;
    }
    public int getEnergy() {
        return this.energy;
    }
    public void adjustEnergy(int value) {
        this.energy += value;
        if(this.energy > 15)
            this.energy = 15;
    }
    public int getHunger() {
        return this.hunger;
    }
    public void adjustHunger(int value) {
        this.hunger += value;
        if(this.hunger > 15)
            this.hunger = 15;
    }
}
