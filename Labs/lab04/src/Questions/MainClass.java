package Questions;

import java.awt.Color;

public class MainClass 
{
    public static void main(String[] args) 
    {
        // Instantiate objects for testing purposes here: 
        Bacon bacon = new Bacon("Robert", "Turkey", true);
        Bacon bacon2 = new Bacon();
        Ball ball = new Ball("Narwhal", true, Color.CYAN);
        Ball ball2 = new Ball();
        int celsius = 100;
        int fahrenheit = Conversion.celsiusToFahrenheit(celsius);
        System.out.println(fahrenheit);
        System.out.println(bacon.toString());
        System.out.println(ball.toString());
        System.out.println(bacon2.toString());
        System.out.println(ball2.toString());
        
    }
}
