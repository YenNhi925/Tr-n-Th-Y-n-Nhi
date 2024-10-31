/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author macbookpro
 */


import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập tên: ");
            String name = scanner.nextLine();

            System.out.print("Nhập tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Nhập giới tính: ");
            String gender = scanner.nextLine();

            System.out.print("Nhập chuyên ngành: ");
            String major = scanner.nextLine();

            System.out.print("Nhập GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Nhập quê quán: ");
            String hometown = scanner.nextLine();

            System.out.println("\nThông tin sinh viên:");
            System.out.println("Tên: " + name);
            System.out.println("Tuổi: " + age);
            System.out.println("Giới tính: " + gender);
            System.out.println("Chuyên ngành: " + major);
            System.out.println("GPA: " + gpa);
            System.out.println("Quê quán: " + hometown);
        }
    }
}