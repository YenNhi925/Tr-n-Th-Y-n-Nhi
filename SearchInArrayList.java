/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author macbookpro
 */
import java.util.ArrayList;

public class SearchInArrayList {
    public static void main(String[] args) {
       
        ArrayList<String> keywords = new ArrayList<>();

        
        keywords.add("Java");
        keywords.add("Python");
        keywords.add("C++");
        keywords.add("JavaScript");

        
        boolean isPythonPresent = keywords.contains("Python");

        
        if (isPythonPresent) {
            System.out.println("Python is present in the list.");
        } else {
            System.out.println("Python is not present in the list.");
        }
    }
}