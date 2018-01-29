/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

/**
 *
 * @author ethan.hedrick
 */
public class Conversion {
    private Conversion() {
    
    }
    public static int celsiusToFahrenheit(int temp) {
        int tempInFahrenheit = (temp * 9 / 5) + 32;
        return tempInFahrenheit;
    }

    public static int fahrenheitToCelsius(int temp) {
        int tempInCelcius = (int) ((temp - 32) * 5 / 9);
        return tempInCelcius;
    }

    public static int metersToInches(int meters) {
        int lengthInInches = (int) (meters * 39.3701);
        return lengthInInches;
    }

    public static int inchesToMeters(int inches) {
        int lengthInMeters = (int) (inches * 0.0254);
        return lengthInMeters;
    }

    public static double celsiusToFahrenheit(double temp) {
        double tempInFahrenheit = (temp * 9 / 5) + 32;
        return tempInFahrenheit;
    }

    public static double fahrenheitToCelsius(double temp) {
        double tempInCelcius = ((temp - 32) * 5 / 9);
        return tempInCelcius;
    }

    public static double metersToInches(double meters) {
        double lengthInInches = (meters * 39.3701);
        return lengthInInches;
    }

    public static double inchesToMeters(double inches) {
        double lengthInMeters = (inches * 0.0254);
        return lengthInMeters;
    }
}
