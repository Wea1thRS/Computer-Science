/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import ProvidedClasses.Animal;
import java.awt.Color;

/**
 *
 * @author Ethan
 */
public class Bird extends Animal {

    Color featherColor = Color.RED;

    public Bird() {
        featherColor = Color.RED;
    }

    public Bird(String name, int birthYear, Color featherColor) {
        this.name = name;
        this.birthYear = birthYear;
        this.featherColor = featherColor;
    }

    public Color getFeatherColor() {
        return featherColor;
    }

    @Override
    public String toString() {
        return name + ", " + birthYear + ", " + featherColor;

    }
}
