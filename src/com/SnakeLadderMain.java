package com;

import java.util.Random;

public class SnakeLadderMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder");
        int StartPos = 0;
        System.out.println("Game Starts Now");
        System.out.println("Starting position of player is: "+StartPos);
        Random rd = new Random();
        int diceroll = rd.nextInt(7);//0-6
        System.out.println("Player gets Dice Number :: " + diceroll);
    }
}
