
package lab103;

/**
 *
 * @author Ethan Hedrick
 * @version Feb 2, 2018
 *
 */
public class Player {
    String name, position;
    int number;
    
    public Player(String name, String position, int number) {
        this.name = name;
        this.position = position;
        this.number = number;
    }
    /**
     * @return returns the name of the player.
     */
    public String getName() { return this.name; }
    /**
     * @return returns the position of the player.
     */
    public String getPosition() { return this.position; }
    /**
     * @return returns the number of the player.
     */
    public int getNumber() { return this.number; }
    /**
     * @param name the name you wish to change the player's name to.
     */
    public void setName(String name) { this.name = name; }
    /**
     * @param position the position you wish to change the player's position to.
     */
    public void setPosition(String position) { this.position = position; }
    /**
     * @param number the number you wish to change the player's number to.
     */
    public void setNumber(int number) { this.number = number; }
    /**
     * @param object the object to be compared.
     * @return returns whether the two objects are identical.
     */
    public boolean equals(Object object) {
        if(!(object instanceof Player))
            return false;
        Player temp = (Player) object;
        return (this.name.equals(temp.name)) && (this.position.equals(temp.position)) && (this.number == temp.number);
    }
    /**
     * @return returns a string interpretation.
     */
    @Override
    public String toString() {
        return getClass().getName() + "@" + this.name + ":" + this.position + ":" + this.number;
    }
}
