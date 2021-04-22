package com.practice;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        //drawing number from 0 to 99
        int numberToGuess = new Random().nextInt(100);

        int tries = 5;
        int counter = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! Welcome to the guessing number game. You have " + tries + " tries to guess.");
        System.out.println("Guess the number between 0 and 99: ");

        while (counter <= tries) {
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("This is not the integer number, please try once again:");
            }
            // get the user's number
            int userNumber = sc.nextInt();

            //results
            if (userNumber < numberToGuess) {
                System.out.println("Your number is LOWER than the one you are trying to guess. You have " + (tries - counter) + " tries left.");
                counter++;
                if (counter <= tries) System.out.println("Please try again!");
            } else if (userNumber > numberToGuess) {
                System.out.println("Your number is GREATER than the one you are trying to guess. You have " + (tries - counter) + " tries left.");
                counter++;
                if (counter <= tries) System.out.println("Please try again!");
            } else if (userNumber == numberToGuess) {
                System.out.println("You guessed it! CONGRATULATIONS!!! You guessed for the " + counter + " time");
                break;
            }
            if (counter > tries)
                System.out.println("Sorry, you didn't guess the number, the answer was: " + numberToGuess);
        }
    }
}
