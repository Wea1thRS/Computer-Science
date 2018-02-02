
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
    
    public String getName() { return this.name; }
    public String getPosition() { return this.position; }
    public int getNumber() { return this.number; }
    public void setName(String name) { this.name = name; }
    public void setPosition(String position) { this.position = position; }
    public void setNumber(int number) { this.number = number; }
    
    public boolean equals(Object object) {
        if(!(object instanceof Player))
            return false;
        Player temp = (Player) object;
        return (this.name.equals(temp.name)) && (this.position.equals(temp.position)) && (this.number == temp.number);
    }
    
    @Override
    public String toString() {
        return getClass().getName() + "@" + this.name + ":" + this.position + ":" + this.number;
    }
}
