/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import static Game.Game.*;
import GameEntities.Camel;
import GameEntities.Rider;
import static HelperClasses.MenuHelper.displayMenu;
import static HelperClasses.MenuHelper.*;
import java.math.BigInteger;

/**
 *
 * @author Ethan
 */
public class GameSetup {

    public static Game setupGame() {
        System.out.println("Welcome to Run Across The Desert With A Camel Whilst Not Dying Game");
        difficultySelection = displayMenu("Please select a difficulty:", difficulty) - 1;
        return (new Game(difficultySelection, setupCamel(displayMenu("What type of camel would you like to use?", type)), setupRider(displayMenu("What type of rider would you like to use?", type))));
    }

    public static Camel setupCamel(int option) {
        switch (option) {
            case 1:
                return (new Camel("Billy Bob Joe", 10, 10, 10));
            case 2:
                return (new Camel(BigInteger.probablePrime(50, rand).toString(Character.MAX_RADIX), rand.nextInt(16) + 1, rand.nextInt(16) + 1, rand.nextInt(16) + 1));
            case 3:
                return (new Camel(getTextInput("Please enter a name for your camel: "), getNumInput("Please enter an initial thirst level for the camel with 1 being extremely thirsty."), getNumInput("Please enter an initial hunger level for the camel with 1 being extremely hungry."), getNumInput("Please enter an initial energy level for the camel with 1 being extremely tired.")));
            default:
                return (new Camel());
        }
    }

    public static Rider setupRider(int option) {
        switch (option) {
            case 1:
                return (new Rider("Billy Bob Bo", 10, 10, 10));
            case 2:
                return (new Rider(BigInteger.probablePrime(50, rand).toString(Character.MAX_RADIX), rand.nextInt(16) + 1, rand.nextInt(16) + 1, rand.nextInt(16) + 1));
            case 3:
                return (new Rider(getTextInput("Please enter a name for your rider: "), getNumInput("Please enter an initial thirst level for the rider with 1 being extremely thirsty."), getNumInput("Please enter an initial hunger level for the rider with 1 being extremely hungry."), getNumInput("Please enter an initial energy level for the rider with 1 being extremely tired.")));
            default:
                return (new Rider());
        }
    }
}
