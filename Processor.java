/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author macbookpro
 */
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        int choice; 


        do {
            System.out.println("Menu:");
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Sửa thông tin sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> studentList.enterStudents();
                case 2 -> studentList.displayAllStudents();
                
            }
        } while (choice != 0);
    }
}

