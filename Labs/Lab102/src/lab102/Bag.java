package lab102;
/**
 *
 * @author Ethan Hedrick
 */
public interface Bag { 
    /**
     * 
     * @return returns the size of the list.
     */
    public int getCurrentSize();
    /**
     * 
     * @return returns whether or not the list is empty.
     */
    public boolean isEmpty();
    /**
     * 
     * @param num adds the number given to the list.
     */
    public void add(int num);
    /**
     * 
     * @param num removes the number given from the list.
     */
    public void remove(int num);
    public void remove();
    public void clear();
    /**
     * 
     * @param num the number to check the frequency of.
     * @return returns how often the number given is found in the list.
     */
    public int getFrequencyOf(int num);
    /**
     * 
     * @param num the number to check whether the list contains it.
     * @return returns whether or not the list contains the number given.
     */
    public boolean contains(int num);
    /**
     * 
     * @return a string interpretation of the object.
     */
    @Override
    public String toString();
    /**
     * 
     * @param object the object to be compared.
     * @return returns whether or not the objects are the same.
     */
    @Override
    public boolean equals(Object object);    
}
