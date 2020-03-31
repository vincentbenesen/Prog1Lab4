/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 * Program that count how many multiples of seven are
 * between 33 and 97
 * @author vincentbenesen
 */
public class BookQuestion48 {
    public static void main(String[] args) {

        int i;
        int multipleOfSeven = 0;
        int total;

        for (i = 33; i <= 97; i++) {
            total = i % 7;

            if (total == 0) {
                multipleOfSeven++;
            }
        }
        System.out.println("The number of multiples of seven" +
                           " from 33 to 97 are " + multipleOfSeven);
    }
}
