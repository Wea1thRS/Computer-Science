/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;
/**
 *
 * @author Ethan
 */
public class Bacon {

    private String name;
    private String type;
    private boolean isCrunchy;

    public Bacon() {
        name = "Bob";
        type = "Canadian";
        isCrunchy = true;
    }
    public Bacon(String baconName, String typeOfBacon, boolean isCrunchyBacon) {
        name = baconName;
        type = typeOfBacon;
        isCrunchy = isCrunchyBacon;
    }
    public String getName() {
        return name;
    }
    public String getBaconType() {
        return type;
    }
    public boolean getIsCrunchy() {
        return isCrunchy;
    }
    public void setName(String nameOfBacon) {
        this.name = nameOfBacon;
    }
    public void setBaconType(String typeOfBacon) {
        this.type = typeOfBacon;
    }
    public void setIsCrunchyBacon(boolean isBaconCrunchy) {
        this.isCrunchy = isBaconCrunchy;
    }
    @Override
    public String toString() {
        String str = "The Bacon's name is " + this.name + ". It is " + this.type + " bacon. It is ";
        if(this.isCrunchy == true) {
            str = str.concat("very crunchy!");
        } else {
            str = str.concat("very chewy!");
        }
        return str;
    }
}

