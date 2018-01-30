
package lab103;

import java.util.Random;

/**
 *
 * @author Ethan Hedrick
 * @version Jan 27, 2018
 *
 */
public class Client {
    public static void main(String[] args) {
        ArrayBag scores = new ArrayBag(100);
        Random rand = new Random();
        for(int i = 0; i < 100; i++) {
            scores.add(rand.nextInt(200)-100);
        }
        System.out.println(scores.toString());
        System.out.println(scores.getCurrentSize());
        scores.add(86);
        System.out.println(scores.getCurrentSize());
        scores.remove();
        System.out.println(scores.getCurrentSize());
        System.out.println(scores.get(75));
        System.out.println(scores.getFrequencyOf(75));
        scores.remove(75);
        System.out.println(scores.getFrequencyOf(86));
        System.out.println(scores.contains(86));
        System.out.println(scores.toString());
    }
}
