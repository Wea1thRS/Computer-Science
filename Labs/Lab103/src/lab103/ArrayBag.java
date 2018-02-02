package lab103;

import java.util.Random;

/**
 *
 * @author Ethan Hedrick
 * @version Jan 27, 2018
 *
 */
public class ArrayBag<E> implements Bag<E> {
    private E[] list;
    private int count;
    
    public ArrayBag() {
        this.list = (E[]) new Object[50];
        this.count = 0;
    }
    /**
     * 
     * @param size the size of the list to be made.
     */
    public ArrayBag(int size) {
        this.list = (E[]) new Object[size];
        this.count = 0;
    }
    /**
     * 
     * @return Returns the size of the current list.
     */
    @Override
    public int getCurrentSize() { return this.count; }
    /**
     * 
     * @return Returns whether or not the list is empty.
     */
    @Override
    public boolean isEmpty() { return this.count == 0; }
    @Override
    public void clear() { for(E e : this.list) { e = null; } }
    /**
     * 
     * @param e The element to be added to the list.
     */
    @Override
    public void add(E e) {
        if(count == this.list.length) {
           Object[] temp = (E[]) new Object[this.list.length*2];
           for(int i = 0; i < this.list.length; i++) {
               temp[i] = this.list[i];
           }
           this.list = (E[]) temp;
            temp = null;
        }
        this.list[count] = e;
        count++;
    }
    /**
     * 
     * @param e the element to remove from the list.
     */
    @Override
    public void remove(E e) {
        for(int i = 0; i <= this.list.length; i++) {
            if(this.list[i].equals(e)) {
                for(int j = i; j <= this.list.length - 1; j++) {
                    this.list[i] = this.list[i+1];
                }
                this.list[this.list.length] = null;
                break;
            }
            break;
        }
        count--;
    }
    
    @Override
    public void remove() {
        Random rand = new Random();
        for(int i = rand.nextInt(this.count); i <= this.list.length - 1; i++) {
                    this.list[i] = this.list[i+1];
                }
                this.list[this.list.length] = null;
        count--;
    }
    /**
     * 
     * @param e the element you wish to find the frequency of.
     * @return returns how often the number given is found in the list.
     */
    @Override
    public int getFrequencyOf(E e) {
        int freq = 0;
        for(E el : this.list) {
            if(el == e) { freq++; }
        }
        return freq;
    }
    /**
     * 
     * @param e the element to test if the list contains it.
     * @return returns whether or not the number is found in the list.
     */
    @Override
    public boolean contains(E e) {
        for(E el : this.list) {
            if(el == e) { return true; }
        }
        return false;
    }
    /**
     * 
     * @param object the object to be compared.
     * @return returns whether or not things are the same.
     */
    
    @Override
    public boolean equals(Object object) {
        if(this == object) { return true; } else if(!(object instanceof ArrayBag)) { return false; }
        ArrayBag s = (ArrayBag) object;
        for(int i = 0; i < this.list.length; i++) {
            if(this.list[i] != s.list[i]) { return false; }
        }
        return true;
    }
    /**
     * 
     * @return returns a string representation of the object.
     */
    @Override
    public String toString() {
        String list = "{";
        E[] temp = (E[]) new Object[this.count];
        for(int i = 0; i < this.count; i++) {
            temp[i] = this.list[i];
        }
        for(E e : temp) {
            list += e + ",";
        }
        list += "\b}";
        return getClass().getName() + "@" + this.count + ":" + list;
    }
    /**
     * 
     * @param index The index of the list of obtain the value of.
     * @return Returns the value of the index given.
     */
    public E get(int index) {
        if(index < 0 || index > count) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.list[index];
    }
}
