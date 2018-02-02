
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
    public int getCurrentSize() {
        return this.list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.list.first() == null;
    }

    @Override
    public void add(T num) {
        if(this.list.first() == null) {
            this.list.addFirst(num);
        }
    }
    
    @Override
    public void remove(T num) {
        this.list.remove(num);
    }

    @Override
    public void remove() {
        Random rand = new Random();
        this.list.removeByIndex(rand.nextInt(this.list.size()));
    }

    @Override
    public void clear() {
        this.list.reset();
    }

    @Override
    public int getFrequencyOf(T num) {
        return this.list.getFrequencyOf(num);
    }

    @Override
    public boolean contains(T num) {
        return this.list.isContained(num);
    }
}
