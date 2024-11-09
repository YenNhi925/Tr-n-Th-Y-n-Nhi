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

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();

        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(50);

        Integer[] numbersArray = numbersList.toArray(new Integer[numbersList.size()]);

        for (Integer number : numbersArray) {
            System.out.println(number);
        }
    }
}