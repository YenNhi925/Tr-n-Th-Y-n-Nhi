/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author macbookpro
 */
public class SpaceRemover {
    public static String removeExtraSpaces(String str) {
        str = str.trim();

        return str.replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String inputString = "  Hello  World  ";
        String outputString = removeExtraSpaces(inputString);
        System.out.println(outputString); 
    }
}
