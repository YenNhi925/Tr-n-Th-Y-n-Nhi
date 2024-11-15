/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author macbookpro
 */
import java.util.Date;

public class Student {
    private String studentId;
    private String fullName;
    private Date dateOfBirth;
    private String major;
    private float gpa;

    public Student(String studentId, String fullName, Date dateOfBirth, String major, float gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
        this.gpa = gpa;
    }

    Student() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public void enterStudentInfo() {
        
    }

    public void displayStudentInfo() {
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Họ tên: " + fullName);
        
    }
}