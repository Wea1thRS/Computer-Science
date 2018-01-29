/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextAdventure;

/**
 *
 * @author Ethan
 */
public class Room {
    public String name, description;
    public Exit exit1, exit2, exit3, exit4, secretExit;
    public Item item;
    public Creature creature;
    
    public Room(String name, String description, Exit exit1, Exit exit2, Exit exit3, Exit exit4, Exit secretExit, Item item, Creature creature) {
        this.name = name;
        this.description = description;
        this.exit1 = exit1;
        this.exit2 = exit2;
        this.exit3 = exit3;
        this.exit4 = exit4;
        this.secretExit = secretExit;
        this.item = item;
        this.creature = creature;
    }
    public Room(String name, String description, Exit exit1, Exit exit2, Exit exit3, Exit exit4, Exit secretExit, Item item) {
        this.name = name;
        this.description = description;
        this.exit1 = exit1;
        this.exit2 = exit2;
        this.exit3 = exit3;
        this.exit4 = exit4;
        this.secretExit = secretExit;
        this.item = item;
    }
    public Room(String name, String description, Exit exit1, Exit exit2, Exit exit3, Exit exit4, Exit secretExit) {
        this.name = name;
        this.description = description;
        this.exit1 = exit1;
        this.exit2 = exit2;
        this.exit3 = exit3;
        this.exit4 = exit4;
        this.secretExit = secretExit;
    }
    public Room(String name, String description, Exit exit1, Exit exit2, Exit exit3, Exit exit4) {
        this.name = name;
        this.description = description;
        this.exit1 = exit1;
        this.exit2 = exit2;
        this.exit3 = exit3;
        this.exit4 = exit4;
    }
    public Room(String name, String description, Exit exit1, Exit exit2, Exit exit3) {
        this.name = name;
        this.description = description;
        this.exit1 = exit1;
        this.exit2 = exit2;
        this.exit3 = exit3;
    }
    public Room(String name, String description, Exit exit1, Exit exit2) {
        this.name = name;
        this.description = description;
        this.exit1 = exit1;
        this.exit2 = exit2;
    }
    public Room(String name, String description, Exit exit1) {
        this.name = name;
        this.description = description;
        this.exit1 = exit1;
    }
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }    
    public Room() {
        
    }  
    public String getName() {
        return this.name;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public Exit getExit1() {
        return this.exit1;
    }
    
    public Exit getExit2() {
        return this.exit2;
    }
    
    public Exit getExit3() {
        return this.exit3;
    }
    
    public Exit getExit4() {
        return this.exit4;
    }
    
    public Exit getSecretExit() {
        return this.secretExit;
    }
    
    public Item getItem() {
        return this.item;
    }
    
    public Creature getCreature() {
        return this.creature;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setDescription(String newDescription) {
        this.description = newDescription;
    }
    
    public void setExit1(Exit exit) {
        this.exit1 = exit;
    }
    
    public void setExit2(Exit exit) {
        this.exit2 = exit;
    }
    
    public void setExit3(Exit exit) {
        this.exit3 = exit;
    }
    
    public void setExit4(Exit exit) {
        this.exit4 = exit;
    }
    
    public void setSecretExit(Exit exit) {
        this.secretExit = exit;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }
    
    public void setCreature(Creature creature) {
        this.creature = creature;
    }
}