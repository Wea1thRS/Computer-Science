package HelperClasses;

public class ProgressBar {

    public static String printProgBar(double percent) {
        StringBuilder bar = new StringBuilder("[");

        for (int i = 0; i < 50; i++) {
            if (i < (percent / 0.3)) {
                bar.append("=");
            } else if (i == (percent / 0.3)) {
                bar.append(">");
            } else {
                bar.append("-");
            }
        }

        bar.append("]   ").append((int)(percent/15*100)).append("%");
        return bar.toString();
    }
    public static String printDistProgBar(double percent) {
        StringBuilder bar = new StringBuilder("[");

        for (int i = 0; i < 50; i++) {
            if (i < (percent / 4)) {
                bar.append("=");
            } else if (i == (percent / 4)) {
                bar.append(">");
            } else {
                bar.append("-");
            }
        }

        bar.append("]   ").append((int) (percent/200*100)).append("%");
        return bar.toString();
    }
}
