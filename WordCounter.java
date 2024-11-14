/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author macbookpro
 */
public class WordCounter {
    public static int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String inputString = "Java is fun";
        int wordCount = countWords(inputString);
        System.out.println("The number of words in the string is: " + wordCount); 
    }
}
