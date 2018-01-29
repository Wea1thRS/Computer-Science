/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelperClasses;

import static Game.Game.travelDist;
import GameEntities.Camel;
import GameEntities.Rider;
import static HelperClasses.ProgressBar.printDistProgBar;
import static HelperClasses.ProgressBar.printProgBar;

/**
 *
 * @author Ethan
 */
public class DescriptionHelper {

    public static String getThirstDescription(Camel camel) {
        if (camel.thirst < 2) {
            return "Nearly Dead:   " + printProgBar(camel.thirst);
        }
        if (camel.thirst >= 2 && camel.thirst <= 5) {
            return "Very thirsty:  " + printProgBar(camel.thirst);
        }
        if (camel.thirst > 5 && camel.thirst <= 10) {
            return "Thirsty:       " + printProgBar(camel.thirst);
        } else {
            return "Not thirsty:   " + printProgBar(camel.thirst);
        }
    }

    public static String getHungerDescription(Camel camel) {
        if (camel.hunger < 2) {
            return "Nearly Dead:   " + printProgBar(camel.hunger);
        }
        if (camel.hunger >= 2 && camel.hunger <= 5) {
            return "Starving:      " + printProgBar(camel.hunger);
        }
        if (camel.hunger > 5 && camel.hunger <= 10) {
            return "Hungry:        " + printProgBar(camel.hunger);
        } else {
            return "Hardly hungry: " + printProgBar(camel.hunger);
        }
    }

    public static String getEnergyDescription(Camel camel) {
        if (camel.energy < 2) {
            return "Exhausted:     " + printProgBar(camel.energy);
        }
        if (camel.energy >= 2 && camel.energy <= 5) {
            return "Tired:         " + printProgBar(camel.energy);
        }
        if (camel.energy > 5 && camel.energy <= 10) {
            return "Fresh:         " + printProgBar(camel.energy);
        } else {
            return "Energized:     " + printProgBar(camel.energy);
        }
    }

    public static String getStatus(Camel camel) {
        return getThirstDescription(camel) + "\n" + getHungerDescription(camel) + "\n" + getEnergyDescription(camel) + "\n";
    }

    public static String getThirstDescription(Rider rider) {
        if (rider.thirst < 2) {
            return "Nearly Dead:   " + printProgBar(rider.thirst);
        }
        if (rider.thirst >= 2 && rider.thirst <= 5) {
            return "Very thirsty:  " + printProgBar(rider.thirst);
        }
        if (rider.thirst > 5 && rider.thirst <= 10) {
            return "Thirsty:       " + printProgBar(rider.thirst);
        } else {
            return "Not thirsty:   " + printProgBar(rider.thirst);
        }
    }

    public static String getHungerDescription(Rider rider) {
        if (rider.hunger < 2) {
            return "Nearly Dead:   " + printProgBar(rider.hunger);
        }
        if (rider.hunger >= 2 && rider.hunger <= 5) {
            return "Starving:      " + printProgBar(rider.hunger);
        }
        if (rider.hunger > 5 && rider.hunger <= 10) {
            return "Hungry:        " + printProgBar(rider.hunger);
        } else {
            return "Hardly hungry: " + printProgBar(rider.hunger);
        }
    }

    public static String getEnergyDescription(Rider rider) {
        if (rider.energy < 2) {
            return "Exhausted:     " + printProgBar(rider.energy);
        }
        if (rider.energy >= 2 && rider.energy <= 5) {
            return "Tired:         " + printProgBar(rider.energy);
        }
        if (rider.energy > 5 && rider.energy <= 10) {
            return "Fresh:         " + printProgBar(rider.energy);
        } else {
            return "Energized:     " + printProgBar(rider.energy);
        }
    }

    public static String getPursuerDistanceDescription(int pursuerDist) {
        if (travelDist - pursuerDist >= 25) {
            return "The pursuers are a great distance away.";
        } else if (travelDist - pursuerDist >= 15 && travelDist - pursuerDist <= 24) {
            return "The pursuers are a moderate distance away.";
        } else {
            return "The pursuers are a short distance away.";
        }
    }

    public static String getStatus(Rider rider) {
        return getThirstDescription(rider) + "\n" + getHungerDescription(rider) + "\n" + getEnergyDescription(rider) + "\n";
    }

    public static String getDistance(double travelDist) {
        return "Distance:" + printDistProgBar(travelDist) + " ";
    }

}
