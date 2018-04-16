package lab111;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ethan Hedrick
 * @version Apr 16, 2018
 *
 */
public class Test {

    static Random random = new Random();
    static int shift = random.nextInt(16);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input: ");
            String input = scanner.nextLine();
            System.out.println("Output: " + cyclicHashCode(input,shift));
        }
    }

    private static int cyclicHashCode(String string, int shift) {
        int hash = 0;
        Test.shift = shift;
        for (int i = 0; i < string.length(); i++) {
            hash = (hash << shift) | (hash >>> 32 - shift);
            hash += (int) string.charAt(i);
        }
        return hash;
    }
}
