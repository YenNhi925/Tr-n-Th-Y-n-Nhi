/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author macbookpro
 */
import java.util.Arrays;

public class WordSplitter {
    public static String[] splitWords(String str) {
        return str.split("\\s+");
    }

    public static void main(String[] args) {
        String inputString = "Java is fun";
        String[] words = splitWords(inputString);
        System.out.println(Arrays.toString(words)); 
    }
}