package com.nupurjaiswal.problems;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("I have selected a random number from between 1 to 100.");
        System.out.println("Try to guess the number. You have 10 guesses");

        boolean hasFound = false;


        for (int i = 1; i <= 10; i++) {

            Scanner s = new Scanner(System.in);
            int guess = s.nextInt();

            if (randomNumber < guess) {
                System.out.println("It is smaller than " + guess);
            }

            if (randomNumber > guess) {
                System.out.println("It is bigger than " + guess);
            }

            if (randomNumber == guess) {
                hasFound = true;
                break;
            }


        }

        if (hasFound){
            System.out.println("You have guessed the number");
        }else {
            System.out.println("Game Over");
            System.out.println("You lost the game. The random number was "+randomNumber);
        }


    }


}
