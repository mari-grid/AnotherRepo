package package3;

import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    public static Time noon() {
        // write your code here
    }

    public static Time midnight() {
        // write your code here
    }

    public static Time ofSeconds(long seconds) {
        // write your code here
    }

    public static Time of(int hour, int minute, int second) {
        // write your code here
    }
}

/* Do not change code below */
public class Main4 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.printf("%s %s %s", time.hour, time.minute, time.second);
        }
    }
}
