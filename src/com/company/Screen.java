package com.company;

public class Screen {
    public static void print(int x, int y) {
        String[][] screen = {
                {" . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ",},
                {" . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ",},
                {" . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ",},
                {" . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ",},
                {" . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ",},
                {" . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ",},
                {" . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ",},
                {" . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ",},
                {" . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ",},
                {" . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ", " . ",},
        };
        screen[y - 1][x - 1] = "  D";
        screen[y - 1][x] = " V ";
        screen[y - 1][x + 1] = "D  ";
        screen[y][x - 1] = "  -";
        screen[y][x] = "=o=";
        screen[y][x + 1] = "-  ";
        screen[y + 1][x - 1] = "  v";
        screen[y + 1][x] = "ide";
        screen[y + 1][x + 1] = "o  ";

        for (int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[i].length; j++) {
                System.out.print(screen[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }
}
