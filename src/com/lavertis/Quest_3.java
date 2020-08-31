package com.lavertis;

import java.util.Scanner;

public class Quest_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String numbers, tempString;

        for (int i = 0; i < t; i++) {
            sc.nextInt();
            numbers = sc.next();
            for (int j = 0; j < numbers.length(); j += 4) {
                tempString = numbers.substring(j, j + 4);
                int a = (tempString.charAt(0) - '0') * 10 + (tempString.charAt(2) - '0');
                int b = (tempString.charAt(1) - '0') * 10 + (tempString.charAt(3) - '0');
                int sum = a + b;
                System.out.print((char) sum);
            }
            System.out.println();
        }
    }
}
