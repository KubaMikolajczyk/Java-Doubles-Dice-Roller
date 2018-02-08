package com.diceroller;

import java.util.Scanner;
import java.util.Random;

public class Dices {

    private int firstDie;
    private int secondDie;
    private int thirdDie;
    private int totalCountDoubles;
    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    public void rollTwoDices(int diceRolls){
        int countDoubles = 0;

        for (int i=0; i<diceRolls; i++){
            firstDie = random.nextInt(6)+1;
            secondDie = random.nextInt(6)+1;


            if (firstDie == secondDie){
                countDoubles++;
                totalCountDoubles++;
            }
        }
        System.out.println("With " + diceRolls + " rolls, you got " + countDoubles + " doubles.");
    }

    public void rollThreeDices(int diceRolls){
        int countDoubles = 0;

        for (int i=0; i<diceRolls; i++){
            firstDie = random.nextInt(6)+1;
            secondDie = random.nextInt(6)+1;
            thirdDie = random.nextInt(6)+1;


            if (firstDie == secondDie || secondDie == thirdDie || thirdDie == firstDie){
                countDoubles++;
                totalCountDoubles++;
            }
        }
        System.out.println("With " + diceRolls + " rolls, you got " + countDoubles + " doubles.");
    }

    public void countAverage(){
        totalCountDoubles = 0;

        System.out.println("Please enter how many times to repeat the test: ");
        int testRepetition = input.nextInt();

        System.out.println("\nPlease choose one of option below: " +
                            "\n1. Roll with two dices" +
                            "\n2. Roll with three dices");

        int userOptionChoice = input.nextInt();
        int diceRolls = howManyTimes();
        switch(userOptionChoice){
            case 1:
                for(int i=0;i<testRepetition;i++){
                    rollTwoDices(diceRolls);
                }
                break;
            case 2:
                for(int i=0;i<testRepetition;i++){
                    rollThreeDices(diceRolls);
                }
        }
        float avgDoubles = (totalCountDoubles/testRepetition);
        System.out.println("On average during " + testRepetition + " tries. We got " + avgDoubles + " doubles.");
    }

    public int howManyTimes(){
        System.out.println("How many times do you want to roll dices? : ");
        int timesRoll = input.nextInt();
        System.out.println(timesRoll);
        return timesRoll;
    }
}
