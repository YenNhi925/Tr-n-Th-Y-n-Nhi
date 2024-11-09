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

public class TraverseArrayList {
    public static void main(String[] args) {
       
        ArrayList<String> cities = new ArrayList<>();

        
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("Sydney");

        
        for (String city : cities) {
            System.out.println(city);
        }
    }
}