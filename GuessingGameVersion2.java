/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Random;
import java.util.Scanner;

/**
 * Program that generates a random number between 0 and 100 and asks the user
 * to guess it. The user can have at maximum 10 trials. If the number is guessed, 
 * the user should be asked if she/he wants to play again. If the number is 
 * not guessed and 10 trials were used, the user is not lucky, the program will 
 * ask the user again if he or she wants to try again.
 * @author vincent benesen
 */
public class GuessingGameVersion2 {

    public static void main(String[] args) {
        System.out.println("\n*****WELCOME TO GUESSING GAME*****");
        System.out.println("RULES OF THE GAME");
        System.out.println("(1)Try to guess the number");
        System.out.println("(2)You have atleast 10 tries");
        System.out.println("(3)If you try 10 times without getting the right answer then its GAMEOVER!!!");

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        String response;
        int guess, randomNumber;
        int rightAnswer = 0;
        int numberOfGuess = 1;
        final int TRIAL = 10;

        System.out.println("\nWould you like to play now? (YES) or (NO)");
        response = sc.next();

        while (response.equalsIgnoreCase("YES")) {
            randomNumber = rd.nextInt(101);

            System.out.println("\nNOW PLAYING....");
            System.out.print("Enter your guess > ");
            guess = sc.nextInt();

            while (numberOfGuess != TRIAL) {
                if (guess == randomNumber) {
                    rightAnswer++;
                    numberOfGuess = 10;
                } else {
                    numberOfGuess++;
                }
                System.out.print("Enter your guess > ");
                guess = sc.nextInt();
            }
            if (rightAnswer > 0) {
                System.out.println("\nCONGRATULATION YOU HAVE ENTERED THE RIGHT VALUE");
                System.out.println("Would you like to play again? (YES) or (NO)");
                response = sc.next();
                if (response.equalsIgnoreCase("No")) {
                    System.out.println("\nTHANK YOUR FOR PLAYING THE GAME");
                }
            } else if (rightAnswer == 0) {
                System.out.println("\nSORRY! you have exceeded the number of guess");
                System.out.println("BETTER LUCK NEXT TIME!");
                System.out.println("Would you like to try it again? (YES) or (NO)");
                response = sc.next();
            }
        }
        System.out.println("GAMEOVER!!!");
    }
}
