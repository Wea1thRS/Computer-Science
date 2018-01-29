/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

/*
 *
 * @author Ethan
 */
public class ScrabbleScore {

    static char[] zero = {' '};
    static char[] one = {'e', 'a', 'i', 'o', 'n', 'r', 't', 'l', 's', 'u'};
    static char[] two = {'d', 'g'};
    static char[] three = {'b', 'c', 'm', 'p'};
    static char[] four = {'f', 'h', 'v', 'w', 'y'};
    static char[] five = {'k'};
    static char[] eight = {'j', 'x'};
    static char[] ten = {'q', 'z'};

    public static int calculateScore(String word) {
        int score = 0;
        for(char letter : zero)
            score += (countMatches(word,letter)*0);
        for(char letter : one)
            score += (countMatches(word,letter)*1);
        for(char letter : two)
            score += (countMatches(word,letter)*2);
        for(char letter : three)
            score += (countMatches(word,letter)*3);
        for(char letter : four)
            score += (countMatches(word,letter)*4);
        for(char letter : five)
            score += (countMatches(word,letter)*5);
        for(char letter : eight)
            score += (countMatches(word,letter)*8);
        for(char letter : ten)
            score += (countMatches(word,letter)*10);
        return score;
    }

    public static int countMatches(String str, char letter) {
        int charCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char test = str.charAt(i);
            if (test == letter) {
                charCount++;
            }
        }
        return charCount;
    }
}
