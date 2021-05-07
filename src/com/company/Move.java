package com.company;

public class Move {
    public static int vertical(int y, boolean up) {

        if (up) y -= 1;
        else y += 1;

        return y;
    }

    public static int horizontal(int x, boolean left) {

        if (left) x -= 1;
        else x += 1;

        return x;
    }
}
