package com.company;

public class Hexakodvalto {
    public static void main(String[] args) {
        String s = "1bf";
        System.out.println(hexToDec(s));

    }

    public static int hexToDec(String hex) {
        int sum = 0;

        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int chaValue;
            if (c < 97) {
                chaValue = c - 48;
            } else {
                chaValue = c - 87;
            }
            sum += chaValue * Math.pow(16, hex.length() - i - 1);
        }
        return sum;
    }

}
