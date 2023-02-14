package com.arif.kata;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Kata04 {
    public static void main(String[] args) {

//        humanReadableTime(0);
//        humanReadableTime(5);
//        humanReadableTime(60);
//        humanReadableTime(86399);
//        humanReadableTime(359999);
        secondsToTimeFormat(0);
        secondsToTimeFormat(5);
        secondsToTimeFormat(60);
        secondsToTimeFormat(86399);
        secondsToTimeFormat(359999);

    }

    private static void humanReadableTime(int input) {
        int seconds = 3600;
        int minutes = 60;
        String hh = Integer.toString((input / seconds));
        String mm = Integer.toString((input % seconds)/minutes);
        String cc = Integer.toString((input % minutes));

        if (hh.length() == 1) {
            hh = "0" + hh;
        }
        if (mm.length() == 1) {
            mm = "0" + mm;
        }
        if (cc.length() == 1) {
            cc = "0" + cc;
        }
        System.out.println(hh+":"+mm+":"+cc);
    }

    public static void secondsToTimeFormat(int seconds) {
        if (seconds > 359999) {
            seconds = 359999;
        }

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds));
    }

    static String humanReadableTime1(int time){
        if (time >= 360000){
            return "Error: Too many seconds given";
        }
        return time / 3600 + ":" + (time % 3600) / 60 + ":" + time % 60;
    }

    public static String secondsToTimeFormat1(int seconds) {
        if (seconds > 359999) {
            seconds = 359999;
        }

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        StringBuilder time = new StringBuilder();
        time.append(hours < 10 ? "0" + hours : hours);
        time.append(":");
        time.append(minutes < 10 ? "0" + minutes : minutes);
        time.append(":");
        time.append(remainingSeconds < 10 ? "0" + remainingSeconds : remainingSeconds);

        return time.toString();
    }



}
