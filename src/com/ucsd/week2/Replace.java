package com.ucsd.week2;

public class Replace {

    public static String replace(String word, char gone, char here) {
        char[] cArray = word.toCharArray();
        char[] cArrayMod = new char[cArray.length];
        int i = 0;
        for (char c : cArray) {
            if (c == gone) {
                cArrayMod[i] = here;
            } else {
                cArrayMod[i] = c;
            }
            i++;
        }
        return new String(cArrayMod);
    }

    public static String replaceMySolution(String word, char gone, char here) {
        char[] cArray = word.toCharArray();
        StringBuilder newString = new StringBuilder();
        for (char c : cArray) {
            if (c == gone) {
                newString.append(here);
            } else {
                newString.append(c);
            }
        }
        return newString.toString();
    }
}
