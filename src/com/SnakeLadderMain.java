package com;

import java.util.Random;

public class SnakeLadderMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder");
        int StartPos = 0;
        int Ladder = 1;
        int Snake = 2;
        int player_position=0;
        int WINNING_POSITION = 100;
        int diceCount = 0;
        System.out.println("Game Starts Now");
        System.out.println("Starting position of player is: "+StartPos);

        while (player_position < WINNING_POSITION) {
            Random rd = new Random();
            int diceroll = rd.nextInt(7);//0-6
            System.out.println("Player gets Dice Number :: " + diceroll);
            diceCount++;
            System.out.println("DiceCount :: " + diceCount);

            int toss = rd.nextInt(3);
            System.out.println("case..." + toss);

            switch (toss) {
                case 0:
                    System.out.println("No Play");
                    break;
                case 1:
                    player_position = player_position + diceroll;
                    if(player_position > WINNING_POSITION) {
                        player_position -= player_position;
                    }
                    System.out.println("Ladder : " + player_position);
                    break;
                case 2:
                    player_position = player_position - diceroll;
                    System.out.println("Snake : " + player_position);
                    if(player_position<0)
                    {
                        player_position = 0;
                    }
                    break;
                default:
                    System.out.println("invalid choice");

            }
        }
        System.out.println("Congratulation you Won ... ");
        System.out.println("Number of times the Dice was played." + diceCount);
    }
}
