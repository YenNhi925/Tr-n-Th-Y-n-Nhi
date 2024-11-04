/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author macbookpro
 */
public class SumddEven {
    public static void main(String[] args) {
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
System.out.println("Sum of odd numbers: " + sumOdd);
System.out.println("Sum of even numbers: " + sumEven);

            }
}