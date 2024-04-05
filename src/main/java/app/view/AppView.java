package app.view;

import java.util.Scanner;

public class AppView {
    public long inputTimeInSeconds() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input time, sec: ");
        return scanner.nextLong();
    }

    public void printTimeInHHMMSS(String formatDuration) {
        System.out.println("Output (hh:mm:ss): " + formatDuration);
    }
}
