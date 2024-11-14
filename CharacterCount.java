/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author macbookpro
 */
public class CharacterCount {
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String str = "hello world";
        char ch = 'o';
        int count = countOccurrences(str, ch);
        System.out.println("The character '" + ch + "' appears " + count + " times in the string.");
    }
}