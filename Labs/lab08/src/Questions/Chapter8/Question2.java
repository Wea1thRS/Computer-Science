/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Chapter8;

/**
 *
 * @author araderma
 */
public class Question2 {

    public static Object[] Question2(double[] input) {
        /**
         * For this part of the assignment you will be doing simple array
         * processing on an array of type double with the identifier input that
         * is being passed as a parameter to this method.
         *
         * You should calculate and return the following values as elements of
         * an array of type Object in the following order:
         *
         * 1) An int value representing the count (number of elements in the
         * input array) 2) A double value representing the sum (total of
         * elements in the input array) 3) A double value representing the value
         * of the smallest element in the input array *Note: If there are no
         * elements, return the special value Double.NaN 4) A double value
         * representing the value of the largest element in the input array
         * *Note: If there are no elements, return the special value Double.NaN
         */

        // Process the array called input here
        int count = input.length;
        double sum = 0;
        for (double num : input) {
            sum += num;
        }
        double min = Double.MAX_VALUE;
        if (input.length > 0) {
            for (double num : input) {
                if (num < min) {
                    min = num;
                }
            }
        } else {
            min = Double.NaN;
        }
        double max = Double.MIN_VALUE;
        if (input.length > 0) {
            for (double num : input) {
                if (num > max) {
                    max = num;
                }
            }
        } else {
            max = Double.NaN;
        }

        // Create your Object[] storing the count, sum, min, and max here and return it
        return new Object[]{count, sum, min, max};

    }

}
