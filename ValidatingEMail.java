/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 * Program to validate email addresses
 * Program that uses a loop to go over each character, and find an @ sign, 
 * followed by two or more words separated by dots.
 * @author vincent benesen
 */
public class ValidatingEMail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Email > ");
        String eMail = sc.nextLine();

        int lengthOfEmail = eMail.length();
        int letters = 0;
        int isValid = 0;
        int comparedLetters = lengthOfEmail;
        int dot1 = eMail.indexOf('.');
        int dot2 = eMail.indexOf('.');
        char hasAt = '@';

        while (letters < comparedLetters) {
            if (eMail.charAt(letters) == hasAt) {
                isValid++;
            }
            if (eMail.charAt(letters) == dot1) {
                isValid++;
            }
            if (eMail.charAt(letters) == dot2) {
                isValid++;
            }
            letters++;
        }
        if (isValid == 3) {
            System.out.println("It is a valid email");
        } else if (isValid != 3) {
            System.out.println("It is not a valid email");
        }
    }
}