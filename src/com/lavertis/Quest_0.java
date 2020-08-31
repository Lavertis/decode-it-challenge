package com.lavertis;

import java.util.Scanner;

public class Quest_0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double c, k, w;
        double fertilizerWeight;

        for (int i = 0; i < t; i++) {
            c = sc.nextInt();
            k = sc.nextInt();
            w = sc.nextInt();

            fertilizerWeight = c * w;

            if (fertilizerWeight <= k)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
