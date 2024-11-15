/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author macbookpro
 */
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    private final ArrayList<Student> studentList = new ArrayList<>();

    
    public void enterStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.enterStudentInfo();
            studentList.add(student);
        }
    }

    public void displayAllStudents() {
        for (Student student : studentList) {
            student.displayStudentInfo();
        }
    }

    public void findStudentById(String idToFind) {
        
    }

    public void deleteStudentById(String idToDelete) {
        
    }

    public boolean editStudentById(String idToEdit) {
        
        return false;
        
    }
}
