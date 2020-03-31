/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 * program that receives a word as an input from the user 
 * and checks if it is a palindrome
 * @author vincent benesen
 */
public class Palindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text to check if it is a Palindrome > ");
        String text = sc.nextLine().trim();

        int numberOfLetters = text.length();
        int letters = 0;
        int comparedLetters = numberOfLetters - 1;
        int palindromeLetters = 0;
        int notPalindomeLetters = 0;

        while (letters < comparedLetters) {
            if (text.charAt(letters) != text.charAt(comparedLetters)) {
                letters++;
                comparedLetters--;
                notPalindomeLetters++;
            }else if (text.charAt(letters) == text.charAt(comparedLetters)) {
                letters++;
                comparedLetters--;
                palindromeLetters++;
            }
        }
        if (palindromeLetters > 0) {
            System.out.println("The Word is a Palindrome");
        } else if (notPalindomeLetters > 0) {
            System.out.println("The Word is not a Palindrome");
        }
    }
}