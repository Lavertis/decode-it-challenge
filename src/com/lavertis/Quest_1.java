package com.lavertis;

import java.util.Scanner;

public class Quest_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int s = sc.nextInt();
        int[] tab = new int[r];

        int above = (int) Math.pow(2, r);
        int remaining = s;

        while (remaining != 0) {
            for (int i = 0; i < r && remaining != 0; i++) {
                tab[i]++;
                remaining--;
            }
        }

        int result = 1;
        for (int i = 0; i < r; i++)
            if (tab[i] != 0)
                result *= (tab[i] + 1);

        result *= above;
        System.out.println(result);
    }
}
