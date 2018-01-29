/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Ethan
 */
public class Parrot extends Bird {

    ArrayList<String> wordsKnown = new ArrayList<String>();

    public Parrot() {
        this.name = "Polly";
        this.birthYear = 2010;
        this.featherColor = Color.GREEN;
        this.wordsKnown.add("Polly");
    }

    public void addWord(String word) {
        this.wordsKnown.add(word);
    }

    public String listWordsKnown() {
        String words = "";
        for (int i = 0; i < this.wordsKnown.size(); i++) {
            words = words + this.wordsKnown.get(i) + "; ";

        }
        return words;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.birthYear + ", " + this.featherColor + ", " + listWordsKnown();

    }
}
