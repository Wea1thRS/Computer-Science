/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Chapter8;

import java.util.Random;

/**
 *
 * @author Ethan
 */
public class ShakespeareanInsultGenerator {

    static String[] adjective = {"bawdy", "craven", "dankish", "frothy", "lumpish", "pribbling", "surly", "villainous"};
    static String[] compound = {"beef-witted", "clay-brained", "dizzy-eyed", "flap-mouthed", "ill-nurtured",
        "motley-minded", "sheep-biting", "tickle-brained"};
    static String[] noun = {"bugbear", "clotpole", "harpy", "lout", "miscreant", "molwarp", "puttock", "wagtail"};
    static Random rand = new Random();

    public static String shakespeareanInsultGenerator() {
        return adjective[rand.nextInt(7) + 1] + " " + compound[rand.nextInt(7) + 1] + " " + noun[rand.nextInt(7) + 1];
    }
}
