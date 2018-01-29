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
public class Creature {
    public String name, description, defeatedText;
    public Item itemToDestroy;
    
    public Creature(String name, String description, String defeatedText, Item itemToDestroy) {
        this.name = name;
        this.description = description;
        this.defeatedText = defeatedText;
        this.itemToDestroy = itemToDestroy;
    }
    
    public Creature(String name, String description, String defeatedText) {
        this.name = name;
        this.description = description;
        this.defeatedText = defeatedText;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public String getDefeatedText() {
        return this.defeatedText;
    }
    
    public Item getItemToDestroy() {
        return this.itemToDestroy;
    }
    
    public void setItemToDestroy(Item item) {
        this.itemToDestroy = item;
    }
}
