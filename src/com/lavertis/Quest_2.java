package com.lavertis;

import java.util.Arrays;
import java.util.Scanner;


public class Quest_2 {

    public static Pair sort(String number) {
        number = "0".repeat(4 - number.length()) + number;

        char[] arr = number.toCharArray();
        Arrays.sort(arr);

        int ascending = Integer.parseInt(String.valueOf(arr));
        int descending = Integer.parseInt(new StringBuffer(String.valueOf(arr)).reverse().toString());

        return new Pair(ascending, descending);
    }

    public static int check(String number) {
        if (Integer.parseInt(number) == 6174)
            return 0;

        Pair pair = sort(number);
        int result = Integer.parseInt(number);

        int counter = 0;

        while (result != 6174) {
            pair.descending -= pair.ascending;
            result = pair.descending;
            counter++;
            pair = sort(String.valueOf(pair.descending));
            if (result == 0)
                return -1;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String number;

        for (int i = 0; i < t; i++) {
            number = sc.next();
            System.out.println(check(number));
        }
    }

    static class Pair {

        private final int ascending;
        private int descending;

        public Pair(int ascending, int descending) {
            this.ascending = ascending;
            this.descending = descending;
        }
    }
}
