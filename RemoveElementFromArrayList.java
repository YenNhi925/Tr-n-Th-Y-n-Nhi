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

public class RemoveElementFromArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        
        numbers.remove(Integer.valueOf(5));

        
        System.out.println("List after removing 5: " + numbers);
    }
}