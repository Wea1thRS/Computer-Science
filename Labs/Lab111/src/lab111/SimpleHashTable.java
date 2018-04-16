package lab111;

import java.util.Arrays;

/**
 *
 * @author Ethan Hedrick
 * @version Apr 16, 2018
 *
 */
public class SimpleHashTable {

    String[] table;
    int p, a, b, length, shift, size;

    public SimpleHashTable(int size) {
        length = nextPrime(size);
        this.table = new String[length];
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void put(String string) {
        this.table[this.size] = String.valueOf(this.cyclicHashCode(string, shift));
        this.size += 1;
    }

    public String get(String string) {
        for (String s : this.table) {
            if (s.equals(String.valueOf(this.cyclicHashCode(string, shift)))) {
                return string;
            }
        }
        return null;
    }

    public String remove(String string) {
        String str;
        for (String s : this.table) {
            str = String.valueOf(this.cyclicHashCode(string, shift));
            if (s.equals(str)) {
                Arrays.asList(table).remove(str);
                this.size -= 1;
                return string;
            }
        }
        return null;
    }

    private int hashKey(String string) {
        return 0; //
        //return 31 * 7 + (int) string.hashCode();
    }

    private int cyclicHashCode(String string, int shift) {
        int hash = 0;
        this.shift = shift;
        for (int i = 0; i < string.length(); i++) {
            hash = (hash << shift) | (hash >>> 32 - shift);
            hash += (int) string.charAt(i);
        }
        return hash;
    }

    public int getShift() {
        return this.shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    private int compressedHashCode(int hashCode) {
        return (((a * hashCode) + b) % p);
    }

    public void setPmad(int p) {
        this.p = p;
    }

    public int getPmad() {
        return this.p;
    }

    public void setAmad(int a) {
        this.a = a;
    }

    public int getAmad() {
        return this.a;
    }

    public void setBmad(int b) {
        this.b = b;
    }

    public int getBmad() {
        return this.b;
    }

    public int numCollisions() {
        return 0; //
    }

    public int longestChain() {
        int longest = 0;
        for (String s : this.table) {
            if (s.length() > longest) {
                longest = s.length();
            }
        }
        return longest;
    }

    public int loadFactor() {
        return this.length - this.size;
    }

    private int nextPrime(int previous) {
        if (previous < 2) {
            return 2;
        }
        if (previous == 2) {
            return 3;
        }
        int next = 0;
        int increment = 0;
        switch ((int) (previous % 6L)) {
            case 0:
                next = previous + 1;
                increment = 4;
                break;
            case 1:
                next = previous + 4;
                increment = 2;
                break;
            case 2:
                next = previous + 3;
                increment = 2;
                break;
            case 3:
                next = previous + 2;
                increment = 2;
                break;
            case 4:
                next = previous + 1;
                increment = 2;
                break;
            case 5:
                next = previous + 2;
                increment = 4;
                break;
        }
        while (!isPrime(next)) {
            next += increment;
            increment = 6 - increment;
        }
        return next;
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
