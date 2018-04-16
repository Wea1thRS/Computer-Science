package lab102;

import java.util.Random;

/**
 *
 * @author Ethan Hedrick
 * @version Jan 27, 2018
 *
 */
public class Scores implements Bag{
    private int[] list;
    private int count;
    
    public Scores() {
        this.count = 0;
        this.list = new int[50];
    }
    /**
     * 
     * @param size the size of the list to be made.
     */
    public Scores(int size) {
        this.count = 0;
        this.list = new int[size];
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
    public void clear() { for(int i : this.list) { i = 0; } }
    /**
     * 
     * @param num The number to be added to the list.
     */
    @Override
    public void add(int num) {
        if(count == this.list.length) {
           int[] temp = new int[this.list.length*2];
           for(int i = 0; i < this.list.length; i++) {
               temp[i] = this.list[i];
           }
           this.list = temp;
            temp = null;
        }
        this.list[count] = num;
        count++;
    }
    /**
     * 
     * @param num the number to remove from the list.
     */
    @Override
    public void remove(int num) {
        for(int i = 0; i < this.list.length; i++) {
            if(this.list[i] == num) {
                for(int j = i; j < this.list.length; j++) {
                    this.list[i] = this.list[i+1];
                }
            }
        }
        count--;
    }
    
    @Override
    public void remove() {
        Random rand = new Random();
        for(int i = rand.nextInt(this.count); i < this.list.length-1; i++) {
            this.list[i] = this.list[i+1];
        }
        count--;
    }
    /**
     * 
     * @param num the number you wish to find the frequency of.
     * @return returns how often the number given is found in the list.
     */
    @Override
    public int getFrequencyOf(int num) {
        int freq = 0;
        for(int i : this.list) {
            if(i == num) { freq++; }
        }
        return freq;
    }
    /**
     * 
     * @param num the number to test if the list contains it.
     * @return returns whether or not the number is found in the list.
     */
    @Override
    public boolean contains(int num) {
        for(int i : this.list) {
            if(i == num) { return true; }
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
        if(this == object) { return true; } else if(!(object instanceof Scores)) { return false; }
        Scores s = (Scores) object;
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
        String string = "{";
        int[] temp = new int[this.count];
        for(int i = 0; i < this.count; i++) {
            temp[i] = this.list[i];
        }
        for(int i : temp) {
            string += i + ",";
        }
        string += "\b}";
        return getClass().getName() + "@" + this.count + ":" + string;
    }
    /**
     * 
     * @param index The index of the list of obtain the value of.
     * @return Returns the value of the index given.
     */
    public int get(int index) {
        if(index < 0 || index > count) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.list[index];
    }
}
