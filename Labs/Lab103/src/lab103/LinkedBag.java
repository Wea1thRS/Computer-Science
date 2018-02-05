
package lab103;

import java.util.Random;

/**
 *
 * @author Ethan Hedrick
 * @version Jan 30, 2018
 *
 */
public class LinkedBag<T> implements Bag<T> {
    SinglyLinkedList<T> list;
    int count;
    
    public LinkedBag() {
        this.list = new SinglyLinkedList();
        count = 0;
    }
    /**
     * @return returns current size of the bag.
     */
    public int getCurrentSize() {
        return this.count;
    }
    /**
     * @return returns whether the bag is empty.
     */
    @Override
    public boolean isEmpty() {
        return this.list.first() == null;
    }
    /**
     * @param obj the object to add into the bag.
     */
    @Override
    public void add(T obj) {
        if(this.list.first() == null) {
            this.list.addFirst(obj);
        }
        count++;
    }
    /**
     * @param obj the object to remove from the bag.
     */
    @Override
    public void remove(T obj) {
        this.list.remove(obj);
        count--;
    }
    @Override
    public void remove() {
        Random rand = new Random();
        this.list.removeByIndex(rand.nextInt(this.list.size()));
        count--;
    }
    @Override
    public void clear() {
        this.list.reset();
        count = 0;
    }
    /**
     * @param obj the object to get the frequency of.
     * @return returns the frequency of the object.
     */
    @Override
    public int getFrequencyOf(T obj) {
        return this.list.getFrequencyOf(obj);
    }
    /**
     * @param obj The object to check if it is contained in the bag.
     * @return returns whether the object is in the bag.
     */
    @Override
    public boolean contains(T obj) {
        return this.list.isContained(obj);
    }
}
