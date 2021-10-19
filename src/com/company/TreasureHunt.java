package com.company;

import java.util.Random;

public class TreasureHunt {

    private static String[][] board;

    public static void main(String[] args) {
        board = new String[5][5];
        buildBoard();
        addTreasure();
        printBoard();

    }

    public static void buildBoard() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = "[xx]";
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static void addTreasure() {
        Random random = new Random();
        for (int i = 0; i < 6; i++){
            board[random.nextInt(5)][random.nextInt(5)] = "[" + ((random.nextInt((99-10)+1)+10))+"]";
        }
    }

    public static void placeCoins(int x, int y) {
        board[x][y] = "o";
    }
}
