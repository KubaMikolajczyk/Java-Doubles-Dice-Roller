package com.diceroller;

import java.util.Scanner;

/**
 * Application class contain main loop of the program
 */

public class Application {

    public void startApp(){
        boolean is_running = true;
        Scanner input = new Scanner(System.in);

        Dices dices = new Dices();
        int diceRolls;

        while(is_running){

            int userMenuChoice = input.nextInt();
            switch(userMenuChoice){
                case 1:
                    System.out.println("Roll two dices");
                    diceRolls = dices.howManyTimes();
                    dices.rollTwoDices(diceRolls);
                    break;
                case 2:
                    System.out.println("Roll three dices");
                    diceRolls = dices.howManyTimes();
                    dices.rollThreeDices(diceRolls);
                    break;
                case 3:
                    System.out.println("Count average doubles in rolls");
                    dices.countAverage();
                    break;
                case 4:
                    System.out.println("Exit");
                    is_running = false;
                    break;

                    default:
                        System.out.println("Please choose on of options listed above");
                        break;

            }
        }
    }
}


