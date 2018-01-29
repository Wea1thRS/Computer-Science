/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;
/**
 *
 * @author ethan.hedrick
 */
public class Cat {
    private String  name; 
    private int miceCaught; 
    private boolean isSecretlyPlottingToKillYouInYourSleep;

    public Cat() {
        name        = "Bill";
        miceCaught  = 5;
        isSecretlyPlottingToKillYouInYourSleep = true;
    }
    public Cat(String catName, int amountOfMice, boolean tryingToKill)
    {
        name        = catName;
        miceCaught  = amountOfMice;
        isSecretlyPlottingToKillYouInYourSleep = tryingToKill;
    }   
    public String getName()
    {
        return name;
    }

    public int getMiceCaught()
    {
        return miceCaught;
    }

    public boolean getIsSecretlyPlottingToKillYouInYourSleep()
    {
        return isSecretlyPlottingToKillYouInYourSleep;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setMiceCaught(int mice) {
        this.miceCaught = mice;
    }
    public void setIsSecretlyPlottingToKillYouInYourSleep(boolean isSecretlyPlottingToKillYouInYourSleep) {
        this.isSecretlyPlottingToKillYouInYourSleep = isSecretlyPlottingToKillYouInYourSleep;
    }  
    @Override
    public String toString() {
        String str = "The cat's name is " + this.name + ". It has caught " + this.miceCaught + " mice. It is ";
        if(this.isSecretlyPlottingToKillYouInYourSleep == true) {
            str = str.concat("trying to kill you.(true)");
        } else {
            str = str.concat("not trying to kill you.(false)");
        }
        return str;
    }
}

