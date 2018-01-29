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
public class Exit {
    public String name, description, transition;
    public Room destination;
    public boolean isCreatureBlocked;
    public Item requiredItem;
    
    public Exit(String name, String description, String transition, Room destination, Item requiredItem ,boolean isCreatureBlocked) {
        this.name = name;
        this.description = description;
        this.transition = transition;
        this.destination = destination;
        this.requiredItem = requiredItem;
        this.isCreatureBlocked = isCreatureBlocked;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public String getTransition() {
        return this.transition;
    }
    
    public Room getDestination() {
        return this.destination;
    }
    public Item getRequiredItem() {
        return this.requiredItem;
    }
    
    public boolean getCreatureBlocks() {
        return this.isCreatureBlocked;
    }
    
    public void setDestination(Room destination) {
        this.destination = destination;
    }
    
    public void setRequiredItem(Item item) {
        this.requiredItem = item;
    }
}
