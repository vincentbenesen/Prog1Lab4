/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 * Program that uses a for loop to output the product of all integers between 3
 * and 7 (Example 3 * 4 * 5 * 6 * 7)
 *
 * @author vincent benesen
 */
public class BookQuestion47 {
    public static void main(String[] args) {

        int i;
        int total = 3;

        for (i = 4; i <= 7; i++) {
            total *= i;
        }
        System.out.println("The product of number 3 to 7 is " + total);
    }
}