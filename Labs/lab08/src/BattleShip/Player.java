/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BattleShip;

import ProvidedClasses.Constants;
import ProvidedClasses.ShipLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Ethan
 */
public class Player implements BattleShipPlayer {

    Random rand = new Random();
    String ship;
    int turn = 0;
    ArrayList<int[]> shots = new ArrayList(100) { //Absolutely disgusting code, but for loops do not work at this level.
            {
                add(new int[]{0,0}); add(new int[]{0,1}); add(new int[]{0,2}); add(new int[]{0,3}); add(new int[]{0,4});
                add(new int[]{0,5}); add(new int[]{0,6}); add(new int[]{0,7}); add(new int[]{0,8}); add(new int[]{0,9});
                add(new int[]{1,0}); add(new int[]{1,1}); add(new int[]{1,2}); add(new int[]{1,3}); add(new int[]{1,4});
                add(new int[]{1,5}); add(new int[]{1,6}); add(new int[]{1,7}); add(new int[]{1,8}); add(new int[]{1,9});
                add(new int[]{2,0}); add(new int[]{2,1}); add(new int[]{2,2}); add(new int[]{2,3}); add(new int[]{2,4});
                add(new int[]{2,5}); add(new int[]{2,6}); add(new int[]{2,7}); add(new int[]{2,8}); add(new int[]{2,9});
                add(new int[]{3,0}); add(new int[]{3,1}); add(new int[]{3,2}); add(new int[]{3,3}); add(new int[]{3,4});
                add(new int[]{3,5}); add(new int[]{3,6}); add(new int[]{3,7}); add(new int[]{3,8}); add(new int[]{3,9});
                add(new int[]{4,0}); add(new int[]{4,1}); add(new int[]{4,2}); add(new int[]{4,3}); add(new int[]{4,4});
                add(new int[]{4,5}); add(new int[]{4,6}); add(new int[]{4,7}); add(new int[]{4,8}); add(new int[]{4,9});
                add(new int[]{5,0}); add(new int[]{5,1}); add(new int[]{5,2}); add(new int[]{5,3}); add(new int[]{5,4});
                add(new int[]{5,5}); add(new int[]{5,6}); add(new int[]{5,7}); add(new int[]{5,8}); add(new int[]{5,9});
                add(new int[]{6,0}); add(new int[]{6,1}); add(new int[]{6,2}); add(new int[]{6,3}); add(new int[]{6,4});
                add(new int[]{6,5}); add(new int[]{6,6}); add(new int[]{6,7}); add(new int[]{6,8}); add(new int[]{6,9});
                add(new int[]{7,0}); add(new int[]{7,1}); add(new int[]{7,2}); add(new int[]{7,3}); add(new int[]{7,4});
                add(new int[]{7,5}); add(new int[]{7,6}); add(new int[]{7,7}); add(new int[]{7,8}); add(new int[]{7,9});
                add(new int[]{8,0}); add(new int[]{8,1}); add(new int[]{8,2}); add(new int[]{8,3}); add(new int[]{8,4});
                add(new int[]{8,5}); add(new int[]{8,6}); add(new int[]{8,7}); add(new int[]{8,8}); add(new int[]{8,9});
                add(new int[]{9,0}); add(new int[]{9,1}); add(new int[]{9,2}); add(new int[]{9,3}); add(new int[]{9,4});
                add(new int[]{9,5}); add(new int[]{9,6}); add(new int[]{9,7}); add(new int[]{9,8}); add(new int[]{9,9});
            }
        };
    @Override
    public int[] getShotLocation() {
            int index = rand.nextInt(shots.size());
            int[] shot = shots.get(index);
            shots.remove(index);
            return shot;
    }

    @Override
    public ShipLayout getShipLayout() {
        ShipLayout layout = new ShipLayout();
        layout.placeShip(Constants.DESTROYER, 4, 7, Constants.VERTICAL);
        layout.placeShip(Constants.BATTLESHIP, 1, 1, Constants.HORIZONTAL);
        layout.placeShip(Constants.CARRIER, 5, 5, Constants.VERTICAL);
        layout.placeShip(Constants.PATROL, 9, 8, Constants.VERTICAL);
        layout.placeShip(Constants.SUBMARINE, 1, 7, Constants.HORIZONTAL);
        return layout;
    }

    @Override
    public void shotNotification(boolean yourShot, int x, int y, String result, String shipSunk) {
        if(shipSunk != null) {
        switch(shipSunk) {
                case "C": 
                    ship = "Carrier";
                    break;
                case "B":
                    ship = "Battleship";
                    break;
                case "S":
                    ship = "Submarine";
                    break;
                case "D":
                    ship = "Destroyer";
                    break;
                case "P":
                    ship = "Patrol";
                    break;
                default:
                    break;                    
            }
        }
        if(shipSunk == null) {
            turn++;
            if(yourShot) 
                System.out.println("It was your shot. You shot at: ("+ x + "," + y + "). It was a: " + result + "." + " It's turn number: " + turn + ".");
            else
                System.out.println("It was their shot. They shot at: ("+ x + "," + y + "). It was a: " + result + "." + " It's turn number: " + turn + ".");
        }
        else {
            turn++;
            if(yourShot)
                System.out.println("It was your shot. You shot at: ("+ x + "," + y + "). It was a: " + result + ". You sunk the: " + ship + "." + " It's turn number: " + turn + ".");
            else
                System.out.println("It was their shot. They shot at: ("+ x + "," + y + "). It was a: " + result + ". You sunk the: " + ship + "." + " It's turn number: " + turn + ".");
        }
    }

    @Override
    public void gameOver(boolean won) {
        if(won)
            System.out.println("You win!");
        else
            System.out.println("You lose!");
    }
    
}
