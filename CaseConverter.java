/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author macbookpro
 */
public class CaseConverter {
    public static String convertCase(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c)); 

            } else {
                result.append(Character.toUpperCase(c));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String inputString = "Hello World";
        String convertedString = convertCase(inputString);
        System.out.println(convertedString); 
    }
}
