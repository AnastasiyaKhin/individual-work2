package utils;

import static java.lang.Integer.parseInt;

public class MyTime {

    public static String getTimeHoursMinutesSeconds(int timeSeconds) {
        int seconds = timeSeconds % 60;
        int minutes = (timeSeconds % 3600) / 60;
        int hours = timeSeconds / 3600;
        String h = null;
        String m = null;
        String s = null;
        if (hours % 10 == 1) {
            h = " час";
        } else if (hours % 10 == 2 || hours % 10 == 3 || hours % 10 == 4) {
            h = "часа";
        } else {
            h = " часов";
        }

        if (minutes % 10 == 1) {
            m = " минута";
        } else if (minutes % 10 == 2 || minutes % 10 == 3 || minutes % 10 == 4) {
            m = " минуты";
        } else {
            m = " минут";
        }

        if (seconds % 10 == 1) {
            s = " секунда";
        } else if (seconds % 10 == 2 || seconds % 10 == 3 || seconds % 10 == 4) {
            s = " секунды";
        } else {
            s = " секунд";
        }
        String totalTimeWithHours = hours +  h + " " + minutes + m + " " + seconds + s;
        String totalTimeWithoutHours = minutes + m + " " + seconds + s;

        if (hours == 0) {
            return totalTimeWithoutHours;
        } else {
            return totalTimeWithHours;
        }
    }
}


