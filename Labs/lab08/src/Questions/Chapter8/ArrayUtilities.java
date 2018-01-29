/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Chapter8;

import java.util.Arrays;

/**
 *
 * @author Ethan
 */
public class ArrayUtilities {
    public static boolean arraysAreEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }
    public static int[] resizeArray(int[] array, int factor) {
        int[] newArray = new int[array.length*factor];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
    public static int[] resizeArray(int[] array) {
        int[] newArray = new int[array.length*2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
    public static int[] copyArray(int[] array) {
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}
