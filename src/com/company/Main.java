package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int y = 1;
        int x = 1;
        boolean up = false;
        boolean left = false;

        while (true) {
            Screen.print(x, y);

            up = Direction.vertical(y, up);
            left = Direction.horizontal(x, left);

            y = Move.vertical(y, up);
            x = Move.horizontal(x, left);

            Thread.sleep(1000);
        }
    }
}