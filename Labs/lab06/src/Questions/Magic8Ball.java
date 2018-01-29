/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.util.Random;

/**
 *
 * @author Ethan
 */
public class Magic8Ball {
    public static String askQuestion(String question) {
        Random rand = new Random();
        String[] whoArray = new String[10];
        String[] whatArray = new String[10];
        String[] whereArray = new String[10];
        String[] whyArray = new String[10];
        String[] whenArray = new String[10];
        String[] howArray = new String[10];
        String[] noneArray = new String[10];
        whoArray[0] = "Stephen King";
        whoArray[1] = "Robert Downey Jr.";
        whoArray[2] = "Danielle Steel";
        whoArray[3] = "Hulk Hogan";
        whoArray[4] = "Oprah Winfrey";
        whoArray[5] = "Aristotle";
        whoArray[6] = "Adam Sandler";
        whoArray[7] = "Cameron Diaz";
        whoArray[8] = "Peter Pan";
        whoArray[9] = "Walt Whitman";
        whatArray[0] = "Oh not again..";
        whatArray[1] = "Yes";
        whatArray[2] = "No";
        whatArray[3] = "Ask again later";
        whatArray[4] = "No, violence is never the answer.";
        whatArray[5] = "What?";
        whatArray[6] = "A semi-intelligent answer to a semi-dumb question.";
        whatArray[7] = "That is up to you.";
        whatArray[8] = "Gravity.";
        whatArray[9] = "42";
        whereArray[0] = "Did you really have to ask?";
        whereArray[1] = "Behind you.";
        whereArray[2] = "It's right there!";
        whereArray[3] = "Oh that? That's gone.";
        whereArray[4] = "Somewhere you will never find it.... muahhahahaha";
        whereArray[5] = "Gah, you left it in your car! Too bad you locked your keys in there too.";
        whereArray[6] = "I'll need a moment to locate that. Ask again later.";
        whereArray[7] = "I don't know.";
        whereArray[8] = "Three steps to your left and look up.";
        whereArray[9] = "Somebody stole that from you last week.";
        whyArray[0] = "Don't you think that question is more suited for a fortune teller?";
        whyArray[1] = "Why not.";
        whyArray[2] = "Because, silly.";
        whyArray[3] = "That isn't important. What's important is why a carrot is more orange than an orange. I'm still working on that one.";
        whyArray[4] = "Because life made it so.";
        whyArray[5] = "Sometimes the cards are just dealt that way.";
        whyArray[6] = "Ask again, maybe you'll get a more useful answer. Or not.";
        whyArray[7] = "Maybe you should find another 8-ball.";
        whyArray[8] = "Ask a different questoin.";
        whyArray[9] = "Look.. I don't make the rules.";
        whenArray[0] = "Sometime in the near to distant future.";
        whenArray[1] = "8:00 pm";
        whenArray[2] = "Tomorrow";
        whenArray[3] = "Never";
        whenArray[4] = "Yesterday";
        whenArray[5] = "Next tuesday";
        whenArray[6] = "Noon";
        whenArray[7] = "Midnight";
        whenArray[8] = "One year 6 months 5 days and 13 minutes";
        whenArray[9] = "In approximately 3 seconds.";
        howArray[0] = "That's a secret.";
        howArray[1] = "Stuff happens.";
        howArray[2] = "By being smart.";
        howArray[3] = "Error. Ask again later.";
        howArray[4] = "Banana's are yellow, that's why.";
        howArray[5] = "Just don't be dumb.";
        howArray[6] = "I'm tired.";
        howArray[7] = "Because that thing did a thing and that thing happened which caused that.";
        howArray[8] = "Magic.";
        howArray[9] = "How could you ask that?";
        noneArray[0] = "In theory, yes! But also no!";
        noneArray[1] = "No!";
        noneArray[2] = "Yes!";
        noneArray[3] = "Maybe!";
        noneArray[4] = "Potentially!";
        noneArray[5] = "It's possible!";
        noneArray[6] = "Perchance!";
        noneArray[7] = "Perhaps!";
        noneArray[8] = "Could be!";
        noneArray[9] = "Imaginably!";
        if(question.toLowerCase().startsWith("who"))
            return whoArray[rand.nextInt(10)];
        else if(question.toLowerCase().startsWith("what"))
            return whatArray[rand.nextInt(10)];
        else if(question.toLowerCase().startsWith("where"))
            return whereArray[rand.nextInt(10)];
        else if(question.toLowerCase().startsWith("why"))
            return whyArray[rand.nextInt(10)];
        else if(question.toLowerCase().startsWith("when"))
            return whenArray[rand.nextInt(10)];
        else if(question.toLowerCase().startsWith("how"))
            return howArray[rand.nextInt(10)];
        else
            return noneArray[rand.nextInt(10)];
    }
}
