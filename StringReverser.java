/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author macbookpro
 */
public class StringReverser {
    public static String reverseString(String str) {
        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));

        }
        return reversedStr.toString();
    }

    public static void main(String[] args) {
        String str = "hello";
        String reversedStr = reverseString(str);
        System.out.println("Reversedstring: " + reversedStr);
    }
}
