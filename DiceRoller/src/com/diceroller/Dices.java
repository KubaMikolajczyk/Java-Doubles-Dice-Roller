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
    private View view = new View();

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
        view.doublesDisplay(diceRolls,countDoubles);
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
        view.doublesDisplay(diceRolls,countDoubles);
    }

    public void countAverage(){
        totalCountDoubles = 0;

        view.testRepetitionDisplay();
        int testRepetition = input.nextInt();

        view.userChoiceDisplay();
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
        view.avgDoublesDisplay(testRepetition,avgDoubles);
    }

    public int howManyTimes(){
        view.rollTimesDisplay();
        int timesRoll = input.nextInt();
        return timesRoll;
    }
}
