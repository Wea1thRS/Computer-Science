package Questions.Files;

import ProvidedClasses.melody.audio.*;
import ProvidedClasses.melody.gui.MelodyGUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Melody {

    /*  For this portion of the assignment, you will complete a Melody class as a 
        backend for a GUI program provided for you. 
        
        See the Instructions document for full API
    
        You may run this file to see the GUI (after you've implemented the mothods)
       
        There are also test cases that you can run to see if your program will work successfully.
     */
    private String title;
    private String artist;
    private Note[] noteList;

    public Melody(File fileObject) {
        try {
            int lines;
            Scanner scan;
            scan = new Scanner(fileObject);
            title = scan.nextLine();
            artist = scan.nextLine();
            lines = scan.nextInt();
            noteList = new Note[lines];
            scan.nextLine();
            int i = 0;
            while (scan.hasNext()) {
                try {
                    Scanner scan2 = new Scanner(scan.nextLine());
                    scan2.useDelimiter(" ");
                    double duration = scan2.nextDouble();
                    Pitch pitch = Pitch.getValueOf(scan2.next());
                    int octave = scan2.nextInt();
                    Accidental accidental = Accidental.getValueOf(scan2.next());
                    boolean repeat = scan2.nextBoolean();
                    Note note = new Note(duration, pitch, octave, accidental, repeat);
                    noteList[i] = note;
                    i++;
                } catch (InputMismatchException b) {
                }
            }
            scan.close();
            System.out.println(toString());
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file");
        } catch (InputMismatchException a) {
            System.out.println("Input does not match");

        }
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getTotalDuration() {
        double duration1 = 0.0;
        for (Note notes : noteList) {
            if (notes.isRepeat()) {
                duration1 += notes.getDuration() * 2;
            } else {
                duration1 += notes.getDuration();
            }
        }
        return duration1;
    }

    public void play() {
        boolean repeats = false;
        int replays = 0;
        for (int i = 0; i < noteList.length; i++) {
            if (repeats == true) {
                i = replays;
            } else {
                if (noteList[i].isRepeat() == true) {
                    replays = i;
                    repeats = true;
                }
            }
            noteList[i].play();
        }
    }

    public boolean octaveDown() {
        boolean changes = true;
        for (Note notes : noteList) {
            if (notes.getOctave() <= 1) {
                changes = false;
            } else {
                notes.setOctave(notes.getOctave() - 1);

            }
        }
        return changes;
    }

    public boolean octaveUp() {
        boolean changes = true;
        for (Note notes : noteList) {
            if (notes.getOctave() > 5) {
                changes = false;
            } else {
                notes.setOctave(notes.getOctave() + 1);

            }
        }
        return changes;
    }

    public void changeTempo(double ratio) {
        for (Note notes : noteList) {
            notes.setDuration(notes.getDuration() * ratio);

        }
    }

    public void reverse() {
        for (int i = 0; i < noteList.length / 2; i++) {
            Note temps = noteList[i];
            noteList[i] = noteList[noteList.length - i - 1];
            noteList[noteList.length - i - 1] = temps;
        }
    }

    @Override
    public String toString() {
        String message = "";
        message += title + "\n" + artist + "\n" + noteList.length + "\n";
        for (int i = 0; i < noteList.length; i++) {
            message += noteList[i].getDuration() + " "
                    + noteList[i].getPitch().toString() + " "
                    + noteList[i].getOctave() + " "
                    + noteList[i].getAccidental().toString() + " "
                    + noteList[i].isRepeat() + " ";
        }
        return message;
    }

    //The main method. No need to modify this.
    public static void main(String[] args) {
        new MelodyGUI();
    }

}
