/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import static Game.GameSetup.setupGame;

/**
 *
 * @author Ethan
 */
public class Main {
    public static void main(String[] args) {
        Game game = setupGame();
        game.start();
    }
}
