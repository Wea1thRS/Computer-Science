/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import ProvidedClasses.Animal;
import java.util.ArrayList;

/**
 *
 * @author Ethan
 */
public class Zoo extends Animal {

    private ArrayList<Animal> animalList = new ArrayList(0);

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public String listAnimals() {
        String b = "";
        for (Animal animals : animalList) {
            b += animals.toString() + "\n";

        }
        return b;

    }
}
