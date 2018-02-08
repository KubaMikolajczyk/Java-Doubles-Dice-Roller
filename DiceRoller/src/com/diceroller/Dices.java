package com.diceroller;

import java.util.Scanner;
import java.util.Random;

public class Dices {

    private int firstDie;
    private int secondDie;
    private int thirdDie;
    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    public void rollTwoDices(){
        int diceRolls = howManyTimes();
        int countDoubles = 0;

        for (int i=0; i<diceRolls; i++){
            firstDie = random.nextInt(6)+1;
            secondDie = random.nextInt(6)+1;


            if (firstDie == secondDie){
                countDoubles++;
            }
        }
        System.out.println("With " + diceRolls + " rolls, you got " + countDoubles + " doubles.");
    }

    public void rollThreeDices(){
        int diceRolls = howManyTimes();
        int countDoubles = 0;

        for (int i=0; i<diceRolls; i++){
            firstDie = random.nextInt(6)+1;
            secondDie = random.nextInt(6)+1;
            thirdDie = random.nextInt(6)+1;


            if (firstDie == secondDie || secondDie == thirdDie || thirdDie == firstDie){
                countDoubles++;
            }
        }
        System.out.println("With " + diceRolls + " rolls, you got " + countDoubles + " doubles.");
    }

    private int howManyTimes(){
        System.out.println("How many times do you want to roll dices? : ");
        int timesRoll = input.nextInt();
        System.out.println(timesRoll);
        return timesRoll;
    }
}
