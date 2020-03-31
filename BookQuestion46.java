/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 * Program that uses a for loop to output the sum of all the integers 
 * between 10 and 20 
 * (Example 10 + 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20)
 * @author vincent benesen
 */
public class BookQuestion46 {

    public static void main(String[] args) {

        int i;
        int total = 0;

        for (i = 10; i <= 20; i++) {
            total += i;
        }
        System.out.println("\nThe sum of all integer numbers"
                            + "between 10 and 20 is " + total);
    }

}
