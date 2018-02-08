package com.diceroller;

/**
 * View class contain code related to displaying information back to user.
 */

public class View {

    public void welcomeMessage(){
        System.out.println("Welcome to dice roll simulator!" +
                            "\nYou can recieve random rolls with two or three dices and their doubles count" +
                            "\nas well as average count of doubles in a series of rolls." +
                            "\n\nAll credits by Kuba Mikolajczyk\n\n");
    }

    public void mainMenuDisplay(){
        System.out.println("\nChoose one from options below:" +
                "\n1. Roll two dices" +
                "\n2. Roll three dices" +
                "\n3. Count average doubles in rolls" +
                "\n4. Exit");
    }

    public void doublesDisplay(int diceRolls, int countDoubles){
        clearScreen();
        System.out.println("\nWith " + diceRolls + " rolls, you got " + countDoubles + " doubles.");
    }

    public void testRepetitionDisplay(){
        clearScreen();
        System.out.println("\nPlease enter how many times to repeat the test: ");
    }

    public void userChoiceDisplay(){
        clearScreen();
        System.out.println("\nPlease choose one of option below: " +
                "\n1. Roll with two dices" +
                "\n2. Roll with three dices");
    }

    public void avgDoublesDisplay(int testRepetition, float avgDoubles){
        clearScreen();
        System.out.println("\nOn average during " + testRepetition + " tries. We got " + avgDoubles + " doubles.");
    }

    public void rollTimesDisplay(){
        clearScreen();
        System.out.println("\nHow many times do you want to roll dices? : ");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
