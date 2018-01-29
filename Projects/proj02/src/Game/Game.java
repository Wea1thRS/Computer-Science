/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import GameEntities.Camel;
import GameEntities.Rider;
import static HelperClasses.DescriptionHelper.*;
import static HelperClasses.MenuHelper.displayMenu;
import com.bethecoder.ascii_table.*;
import java.util.Random;

/**
 *
 * @author Ethan
 */
public class Game {

    public static String[] difficulty = {"Easy", "Normal", "Hard", "Challenging"};
    public static String[] type = {"Standard", "Random", "Custom"};
    public static String[] option = {"Rest", "Search for Food", "Search for Water", "Travel Carefully", "Travel Regularly", "Ride Hard"};
    public static String[] restart = {"Yes", "No", "Maybe"};
    String[] args = {};

    boolean wantsToPlay = true;
    public static int difficultySelection;
    Camel camel;
    Rider rider;
    double difficultyMod, locationMod, weatherMod;
    public static int travelDist, pursuerDist, distDifference, currDay;
    String[] times = {"Morning", "Afternoon", "Evening", "Night"};
    public String weather, location, timeOfDay;
    public static Random rand = new Random();

    public Game(int difficulty, Camel camel, Rider rider) {
        this.currDay = 1;
        this.difficultyMod = difficulty;
        this.camel = camel;
        this.rider = rider;
        this.distDifference = 16;
        this.pursuerDist = -16;
        this.timeOfDay = "Morning";
        this.weather = "Cloudy";
        this.location = "Desert Hills";
    }

    public boolean checkCamelCanTravel() {
        if (camel.energy <= 0) {
            System.out.println("The camel is too tired to continue.");
            int input = displayMenu("Would you like to play again?", restart);
            switch (input) {
                case 1:
                    Main.main(args);
                case 2:
                    System.exit(0);
                case 3:
                    if (rand.nextInt(11) + 1 >= 5) {
                        Main.main(args);
                    } else {
                        System.exit(0);
                    }
                default:
                    Main.main(args);
            }
        } else if (camel.hunger <= 0) {
            System.out.println("The camel is too hungry to continue.");
            int input = displayMenu("Would you like to play again?", restart);
            switch (input) {
                case 1:
                    Main.main(args);
                case 2:
                    System.exit(0);
                case 3:
                    if (rand.nextInt(11) + 1 >= 5) {
                        Main.main(args);
                    } else {
                        System.exit(0);
                    }
                default:
                    Main.main(args);
            }
        } else if (camel.thirst <= 0) {
            System.out.println("The camel is too thirsty to continue.");
            int input = displayMenu("Would you like to play again?", restart);
            switch (input) {
                case 1:
                    Main.main(args);
                case 2:
                    System.exit(0);
                case 3:
                    if (rand.nextInt(11) + 1 >= 5) {
                        Main.main(args);
                    } else {
                        System.exit(0);
                    }
                default:
                    Main.main(args);
            }
        } else {
            return true;
        }
        return true;
    }

    public boolean checkIfWon() {
        if (travelDist >= 200) {
            System.out.println("You won!");
            int input = displayMenu("Would you like to play again?", restart);
            switch (input) {
                case 1:
                    Main.main(args);
                case 2:
                    System.exit(0);
                case 3:
                    if (rand.nextInt(11) + 1 >= 5) {
                        Main.main(args);
                    } else {
                        System.exit(0);
                    }
                default:
                    Main.main(args);
            }
        }
        return false;
    }

    public double getDifficultyMod(int difficultySelection) {
        switch (difficultySelection) {
            case 1:
                return 0.2;
            case 2:
                return 0.1;
            case 3:
                return 0.0;
            case 4:
                return -0.1;
            default:
                return 0.0;
        }
    }

    public double getThirstWeatherMod(String weather) {
        switch (weather) {
            case "Sandstorm":
                return 0.2;
            case "Raining":
                return 0.0;
            case "Cloudy":
                return 0.0;
            case "Warm":
                return 0.2;
            case "Extremely Hot":
                return 0.4;
            default:
                return 0.0;
        }
    }

    public double getEnergyWeatherMod(String weather) {
        switch (weather) {
            case "Sandstorm":
                return 0.5;
            case "Raining":
                return 0.0;
            case "Cloudy":
                return 0.0;
            case "Warm":
                return 0.1;
            case "Extremely Hot":
                return 0.2;
            default:
                return 0.0;
        }
    }

    public double getFoodRateWeatherMod(String weather) {
        switch (weather) {
            case "Sandstorm":
                return -0.25;
            case "Raining":
                return -0.1;
            case "Cloudy":
                return 0.0;
            case "Warm":
                return 0.25;
            case "Extremely Hot":
                return 0.1;
            default:
                return 0.0;
        }
    }

    public double getWaterRateWeatherMod(String weather) {
        switch (weather) {
            case "Sandstorm":
                return -0.2;
            case "Raining":
                return 0.25;
            case "Cloudy":
                return 0.0;
            case "Warm":
                return -0.1;
            case "Extremely Hot":
                return -0.1;
            default:
                return 0.0;
        }
    }

    public double getThirstLocationMod(String location) {
        switch (weather) {
            case "Oasis":
                return 0.0;
            case "Ruins":
                return 0.1;
            case "River Bank":
                return -0.2;
            case "Desert Plains":
                return 0.2;
            case "Desert Hills":
                return 0.3;
            default:
                return 0.0;
        }
    }

    public double getEnergyLocationMod(String location) {
        switch (weather) {
            case "Oasis":
                return 0.0;
            case "Ruins":
                return 0.25;
            case "River Bank":
                return 0.1;
            case "Desert Plains":
                return 0.15;
            case "Desert Hills":
                return 0.2;
            default:
                return 0.0;
        }
    }

    public double getFoodRateLocationMod(String location) {
        switch (weather) {
            case "Oasis":
                return 0.15;
            case "Ruins":
                return 0.25;
            case "River Bank":
                return 0.1;
            case "Desert Plains":
                return 0.0;
            case "Desert Hills":
                return 0.0;
            default:
                return 0.0;
        }
    }

    public double getWaterRateLocationMod(String location) {
        switch (weather) {
            case "Oasis":
                return 0.0;
            case "Ruins":
                return -0.1;
            case "River Bank":
                return 0.3;
            case "Desert Plains":
                return -0.2;
            case "Desert Hills":
                return -0.2;
            default:
                return 0.0;
        }
    }

    public boolean checkRiderIsDead() {
        if (rider.energy <= 0) {
            System.out.println("You are too tired to continue.");
            int input = displayMenu("Would you like to play again?", restart);
            switch (input) {
                case 1:
                    Main.main(args);
                case 2:
                    System.exit(0);
                case 3:
                    if (rand.nextInt(11) + 1 >= 5) {
                        Main.main(args);
                    } else {
                        System.exit(0);
                    }
                default:
                    Main.main(args);
            }
        } else if (rider.hunger <= 0) {
            System.out.println("You are too hungry to continue.");
            int input = displayMenu("Would you like to play again?", restart);
            switch (input) {
                case 1:
                    Main.main(args);
                case 2:
                    System.exit(0);
                case 3:
                    if (rand.nextInt(11) + 1 >= 5) {
                        Main.main(args);
                    } else {
                        System.exit(0);
                    }
                default:
                    Main.main(args);
            }
        } else if (rider.thirst <= 0) {
            System.out.println("You are too thirsty to continue.");
            int input = displayMenu("Would you like to play again?", restart);
            switch (input) {
                case 1:
                    Main.main(args);
                case 2:
                    System.exit(0);
                case 3:
                    if (rand.nextInt(11) + 1 >= 5) {
                        Main.main(args);
                    } else {
                        System.exit(0);
                    }
                default:
                    Main.main(args);
            }
        } else {
            return false;
        }
        return false;
    }

    public void getNewLocation() {
        switch (rand.nextInt(15)) {
            case 0:
            case 1:
                location = "Oasis";
                break;
            case 2:
            case 3:
                location = "Ruins";
                break;
            case 4:
            case 5:
                location = "River Bank";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                location = "Desert Plains";
                break;
            case 12:
            case 13:
            case 14:
                location = "Desert Hills";
                break;
            default:
                break;
        }
    }

    public void getNewWeather() {
        switch (rand.nextInt(10)) {
            case 0:
                weather = "Sandstorm";
                break;
            case 1:
                weather = "Raining";
                break;
            case 2:
                weather = "Cloudy";
                break;
            case 3:
            case 4:
            case 5:
                weather = "Warm";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                if (timeOfDay.equals("Afternoon") || timeOfDay.equals("Evening")) {
                    weather = "Extremely Hot";
                } else {
                    weather = "Warm";
                }
        }
    }

    public void getNewTimeOfDay() {
        int indexed = java.util.Arrays.asList(times).indexOf(timeOfDay);
        if (indexed == 3) {
            timeOfDay = times[0];
            currDay += 1;
        } else {
            timeOfDay = times[indexed + 1];
        }
    }

    public void outputTurnInformation() {
        ASCIITableHeader[] headerObjs = {
            new ASCIITableHeader("Day", ASCIITable.ALIGN_CENTER),
            new ASCIITableHeader("Distance Traveled: " + travelDist, ASCIITable.ALIGN_CENTER),
            new ASCIITableHeader("Pursuer Distance: " + (-(travelDist - pursuerDist)), ASCIITable.ALIGN_CENTER),
            new ASCIITableHeader("Time", ASCIITable.ALIGN_CENTER),
            new ASCIITableHeader("Location", ASCIITable.ALIGN_CENTER),
            new ASCIITableHeader("Weather", ASCIITable.ALIGN_CENTER),};
        String[][] data = {
            {Integer.toString(currDay), getDistance(travelDist), getPursuerDistanceDescription(pursuerDist), timeOfDay, location, weather},};
        ASCIITable.getInstance().printTable(headerObjs, data);
        ASCIITableHeader[] headerObjs2 = {
            new ASCIITableHeader("Rider Status:", ASCIITable.ALIGN_LEFT),
            new ASCIITableHeader("Camel Status:", ASCIITable.ALIGN_LEFT),};
        String[][] data2 = {
            {getThirstDescription(rider), getThirstDescription(camel)},
            {getHungerDescription(rider), getHungerDescription(camel)},
            {getEnergyDescription(rider), getEnergyDescription(camel)},};
        ASCIITable.getInstance().printTable(headerObjs2, data2);
    }

    public void processTurn() {
        int userInput = displayMenu("What would you like to do?", option);
        switch (userInput) {
            case 1:
                processRest();
                break;
            case 2:
                processFoodSearch();
                break;
            case 3:
                processWaterSearch();
                break;
            case 4:
                processTravelCarefully();
                break;
            case 5:
                processTravelRegularly();
                break;
            case 6:
                processRideHard();
                break;
            default:
                break;
        }
    }

    public void processRest() {
        System.out.println("You decide to rest for the remainder of the night.");
        if (weather.equals("Sandstorm")) {
            System.out.println("The sandstorm makes it more difficult for you to sleep.");
            rider.adjustEnergy(3);
            camel.adjustEnergy(3);
            rider.adjustThirst(-1);
            camel.adjustThirst(-1);
            rider.adjustEnergy(-1);
            camel.adjustEnergy(-1);
        } else if (weather.equals("Raining")) {
            System.out.println("The rain makes it more difficult for you to sleep.");
            rider.adjustEnergy(4);
            camel.adjustEnergy(4);
            rider.adjustThirst(2);
            camel.adjustThirst(2);
            rider.adjustThirst(-1);
            camel.adjustThirst(-1);
            rider.adjustEnergy(-1);
            camel.adjustEnergy(-1);
        } else {
            System.out.println("You sleep through the night");
            rider.adjustEnergy(rand.nextInt(10) + 5);
            camel.adjustEnergy(rand.nextInt(10) + 5);
            rider.adjustThirst(-1);
            camel.adjustThirst(-1);
            rider.adjustEnergy(-1);
            camel.adjustEnergy(-1);
        }
    }

    public void processFoodSearch() {
        double totalFoodRateMod = 1;
        totalFoodRateMod += getFoodRateWeatherMod(weather);
        totalFoodRateMod += getFoodRateLocationMod(location);
        totalFoodRateMod += getDifficultyMod(difficultySelection);
        double chance = 0.65 * totalFoodRateMod;
        if (rand.nextDouble() <= chance) {
            System.out.println("You manage to find some food.");
            rider.adjustHunger(rand.nextInt(7) + 3);
            camel.adjustHunger(rand.nextInt(7) + 3);
            rider.adjustThirst(-1);
            camel.adjustThirst(-1);
            rider.adjustEnergy(-1);
            camel.adjustEnergy(-1);
        } else {
            System.out.println("You fail to find any food.");
            rider.adjustHunger(-1);
            camel.adjustHunger(-1);
            rider.adjustThirst(-1);
            camel.adjustThirst(-1);
            rider.adjustEnergy(-1);
            camel.adjustEnergy(-1);
        }
    }

    public void processWaterSearch() {
        double totalWaterRateMod = 1;
        totalWaterRateMod += getWaterRateWeatherMod(weather);
        totalWaterRateMod += getWaterRateLocationMod(location);
        totalWaterRateMod += getDifficultyMod(difficultySelection);
        double chance = 0.65 * totalWaterRateMod;
        if (rand.nextDouble() <= chance) {
            System.out.println("You manage to find some water.");
            rider.adjustThirst(rand.nextInt(7) + 3);
            camel.adjustThirst(rand.nextInt(7) + 3);
            rider.adjustEnergy(-1);
            camel.adjustEnergy(-1);
            rider.adjustHunger(-1);
            camel.adjustHunger(-1);
        } else {
            System.out.println("You fail to find any water.");
            rider.adjustHunger(-1);
            camel.adjustHunger(-1);
            rider.adjustThirst(-1);
            camel.adjustThirst(-1);
            rider.adjustEnergy(-1);
            camel.adjustEnergy(-1);
        }
    }

    public void processTravelCarefully() {
        double totalEnergyMod = 1;
        totalEnergyMod += getEnergyWeatherMod(weather);
        totalEnergyMod += getEnergyLocationMod(location);
        totalEnergyMod += getDifficultyMod(difficultySelection);
        double chance = 0.2 * totalEnergyMod;
        if (rand.nextDouble() <= chance) {
            rider.adjustEnergy(-3);
            camel.adjustEnergy(-3);
            rider.adjustHunger(-1);
            camel.adjustHunger(-1);
            rider.adjustThirst(-1);
            camel.adjustThirst(-1);
            travelDist += rand.nextInt(7) + 3;
        } else {
            rider.adjustEnergy(-3);
            camel.adjustEnergy(-3);
            travelDist += rand.nextInt(5) + 2;
        }
    }

    public void processTravelRegularly() {
        double totalEnergyMod = 1;
        totalEnergyMod += getEnergyWeatherMod(weather);
        totalEnergyMod += getEnergyLocationMod(location);
        totalEnergyMod += getDifficultyMod(difficultySelection);
        double chance = 0.2 * totalEnergyMod;
        if (rand.nextDouble() <= chance) {
            rider.adjustEnergy(-5);
            camel.adjustEnergy(-5);
            rider.adjustHunger(-2);
            camel.adjustHunger(-2);
            rider.adjustThirst(-2);
            camel.adjustThirst(-2);
            travelDist += rand.nextInt(16) + 9;
        } else {
            rider.adjustEnergy(-5);
            camel.adjustEnergy(-5);
            rider.adjustHunger(-2);
            camel.adjustHunger(-2);
            rider.adjustThirst(-2);
            camel.adjustThirst(-2);
            travelDist += rand.nextInt(14) + 7;
        }
    }

    public void processRideHard() {
        double totalEnergyMod = 1;
        totalEnergyMod += getEnergyWeatherMod(weather);
        totalEnergyMod += getEnergyLocationMod(location);
        totalEnergyMod += getDifficultyMod(difficultySelection);
        double chance = 0.2 * totalEnergyMod;
        if (rand.nextDouble() <= chance) {
            rider.adjustEnergy(-7);
            camel.adjustEnergy(-7);
            rider.adjustHunger(-3);
            camel.adjustHunger(-3);
            rider.adjustThirst(-3);
            camel.adjustThirst(-3);
            travelDist += rand.nextInt(34) + 18;
        } else {
            rider.adjustEnergy(-7);
            camel.adjustEnergy(-7);
            rider.adjustHunger(-3);
            camel.adjustHunger(-3);
            rider.adjustThirst(-3);
            camel.adjustThirst(-3);
            travelDist += rand.nextInt(30) + 15;
        }
    }

    public void processPursuers() {
        int dist = rand.nextInt(6) + 3;
        pursuerDist += dist;
        distDifference = travelDist - pursuerDist;
        if (pursuerDist >= travelDist) {
            System.out.println("The pursuers caught up to you. You lose.");
            int input = displayMenu("Would you like to play again?", restart);
            switch (input) {
                case 1:
                    Main.main(args);
                case 2:
                    System.exit(0);
                case 3:
                    if (rand.nextInt(11) + 1 >= 5) {
                        Main.main(args);
                    } else {
                        System.exit(0);
                    }
                default:
                    Main.main(args);
            }
        }
    }

    public void start() {
        System.out.println("You wake up in the desert and a camel approaches you. \nIt tells you that you must help him get across the desert where he can be part"
                + " of civilized life and that he does not belong there in the desert. \nLastly he says that his owners do not want him to be pursuing his dreams"
                + " so you must hurry and make it out before they catch up.");
        while (true) {
            outputTurnInformation();
            processTurn();
            processPursuers();
            checkCamelCanTravel();
            checkRiderIsDead();
            checkIfWon();
            if (rand.nextInt(11) + 1 > 6) {
                getNewWeather();
            }
            if (rand.nextInt(11) + 1 > 6) {
                getNewLocation();
            }
            getNewTimeOfDay();
        }
    }
}
