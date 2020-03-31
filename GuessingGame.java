/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Random;
import java.util.Scanner;

/**
 * program that generates a random number between 0 and 100 and asks the user
 * to guess it. The user can have at maximum 10 trials. If the number is guessed, 
 * the user should be asked if she/he wants to play again. If the number is 
 * not guessed and 10 trials were used, the user is not lucky,
 * @author vincent benesen
 */
public class GuessingGame {
    public static void main(String[] args) {

        System.out.println("\n*****WELCOME TO GUESSING GAME*****");
        System.out.println("RULES OF THE GAME");
        System.out.println("(1)Try to guess the number");
        System.out.println("(2)You have atleast 10 tries");
        System.out.println("(3)If you try 10 times without getting the right"
                           + "answer then its GAMEOVER!!!");

        final int TRIAL = 10;
        int numberOfGuess = 1;
        Random rd = new Random();
        int randomNumber = rd.nextInt(101);

        Scanner sc = new Scanner(System.in);
        System.out.println("\nNOW PLAYING....");
        System.out.print("Enter your guess > ");
        int guess = sc.nextInt();

        while (numberOfGuess < TRIAL) {
            if (guess == randomNumber) {
                System.out.println("CONGRATULATION!!! You guessed the right number");
                System.out.println("Would you like to play again? (YES) or (NO)");
                String response = sc.next();
                if (response.equalsIgnoreCase("Yes")) {
                    randomNumber = rd.nextInt(101);
                    System.out.print("Enter your guess > ");
                    guess = sc.nextInt();
                } else if (response.equalsIgnoreCase("No")) {
                    numberOfGuess = 10;
                }
            } else if (guess != randomNumber) {
                System.out.print("Enter your guess > ");
                guess = sc.nextInt();
                numberOfGuess++;
            }
        }
        System.out.println("\nGameOver");
        System.out.println("Thank You for playing the game!!!");
    }
}