package com.company;

public class Direction {
    public static boolean vertical(int y, boolean up) {

        if (y == 8) up = true;
        if (y == 1) up = false;

        return up;
    }

    public static boolean horizontal(int x, boolean left) {

        if (x == 8) left = true;
        if (x == 1) left = false;

        return left;
    }
}