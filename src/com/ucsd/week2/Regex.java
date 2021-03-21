package com.ucsd.week2;

public class Regex {

    public static void getTokens(String string) {
        String[] strings = string.split(" ");
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
