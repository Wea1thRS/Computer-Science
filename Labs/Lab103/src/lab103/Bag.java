package lab103;
/**
 *
 * @author Ethan Hedrick
 */
public interface Bag<E> { 
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
    public void add(E num);
    /**
     * 
     * @param num removes the number given from the list.
     */
    public void remove(E num);
    public void remove();
    public void clear();
    /**
     * 
     * @param num the number to check the frequency of.
     * @return returns how often the number given is found in the list.
     */
    public int getFrequencyOf(E num);
    /**
     * 
     * @param num the number to check whether the list contains it.
     * @return returns whether or not the list contains the number given.
     */
    public boolean contains(E num);
    /**
     * 
     * @return a string interpretation of the object.
     */
    @Override
    public String toString();
    /**
     * @param object the object to be compared.
     * @return returns whether or not the objects are the same.
     */
    public boolean equals(Object object);    
}
