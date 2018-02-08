package com.diceroller;

import java.util.Scanner;

/**
 * Application class contain main loop of the program
 */

public class Application {
    private View view = new View();


    public void startApp(){
        view.welcomeMessage();
        mainMenuLoop();
    }

    private void mainMenuLoop(){
        boolean is_running = true;
        Scanner input = new Scanner(System.in);

        Dices dices = new Dices();
        int diceRolls;

        while(is_running){
            view.mainMenuDisplay();
            int userMenuChoice = input.nextInt();

            switch(userMenuChoice){
                case 1:
                    diceRolls = dices.howManyTimes();
                    dices.rollTwoDices(diceRolls);
                    break;
                case 2:
                    diceRolls = dices.howManyTimes();
                    dices.rollThreeDices(diceRolls);
                    break;
                case 3:
                    dices.countAverage();
                    break;
                case 4:
                    is_running = false;
                    break;

                    default:
                        break;

            }
        }
    }
}


