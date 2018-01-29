/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.text.DecimalFormat;

/**
 *
 * @author ethan.hedrick
 */
public class BaseballPlayer {
    private String name;
    private int number, singles, doubles, triples, homeRuns, atBats, walks, sacrificeFlies, hits;
    public BaseballPlayer() {
        name = "Babe";
        number = 3;
        singles = 205;
        doubles = 45;
        triples = 13;
        homeRuns = 41;
        atBats = 522;
        walks = 170;
        sacrificeFlies = 4;
    }
    public BaseballPlayer(String name, int number, int singles, int doubles, int triples, int homeRuns, 
            int atBats, int walks, int sacrificeFlies) {
        this.name = name;
        this.number = number;
        this.singles = singles;
        this.doubles = doubles;
        this.triples = triples;
        this.homeRuns = homeRuns;
        this.atBats = atBats;
        this.walks = walks;
        this.sacrificeFlies = sacrificeFlies;
        this.hits = singles + doubles + triples + homeRuns;
    }
    public double getBattingAverage() {
        double battingAverage = (double)this.hits/this.atBats;
        return battingAverage;
    }
    public double getSluggingPercentage() {
        double sluggingPercentage = (double)((1*this.singles)+(2*this.doubles)+(3*this.triples)+(4*homeRuns))/this.atBats;
        return sluggingPercentage;
    }
    public double getOnBasePercentage() {
        double onBasePercentage = (double)(this.hits + this.walks)/(this.atBats + this.walks 
                + this.sacrificeFlies);
        return onBasePercentage;
    }
    public String getFormattedBattingAverage() {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#.000");
        return decimalFormat.format(this.getBattingAverage());
    }
    public String getFormattedSluggingPercentage() {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#.000");
        return decimalFormat.format(this.getSluggingPercentage());
    }
    public String getFormattedOnBasePercentage() {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#.000");
        return decimalFormat.format(this.getOnBasePercentage());
    }
}
