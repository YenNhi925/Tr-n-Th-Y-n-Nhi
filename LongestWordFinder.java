/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author macbookpro
 */
public class LongestWordFinder {
    public static String findLongestWord(String str) {
        String[] words = str.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;

    }

    public static void main(String[] args) {
        String inputString = "I love programming in Java";
        String longestWord = findLongestWord(inputString);
        System.out.println("The longest word is: " + longestWord); 
    }
}
