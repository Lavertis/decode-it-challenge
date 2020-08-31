package com.lavertis;

import java.util.*;

public class Quest_4 {

    public static int find(List<Integer> parent, int i) {
        if (parent.get(i).equals(i))
            return i;
        parent.set(i, find(parent, parent.get(i)));
        return parent.get(i);
    }

    public static void Union(List<Integer> parent, int x, int y) {
        int setX = find(parent, x);
        int setY = find(parent, y);
        parent.set(setX, setY);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mode, IP1, IP2;
        int IP1INT, IP2INT;
        String line;
        Map<String, Integer> map = new HashMap<>();
        List<Integer> array = new ArrayList<>();

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            Scanner sc1 = new Scanner(line);
            if (sc1.hasNext()) {
                mode = sc1.next();
                IP1 = sc1.next();
                IP2 = sc1.next();
            } else
                break;

            if (mode.equals("B")) {
                if (map.containsKey(IP1)) {
                    IP1INT = map.get(IP1);
                } else {
                    IP1INT = map.size();
                    map.put(IP1, map.size());
                    array.add(IP1INT);
                }

                if (map.containsKey(IP2)) {
                    IP2INT = map.get(IP2);
                } else {
                    IP2INT = map.size();
                    map.put(IP2, map.size());
                    array.add(IP2INT);
                }

                Union(array, IP1INT, IP2INT);
            } else if (mode.equals("T")) {
                if (map.containsKey(IP1) && map.containsKey(IP2)) {
                    if (find(array, map.get(IP1)) == find(array, map.get(IP2)))
                        System.out.print("T\n");
                    else
                        System.out.print("N\n");
                } else
                    System.out.print("N\n");
            }
        }
    }
}