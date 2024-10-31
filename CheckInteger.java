/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author macbookpro
 */
import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập một số nguyên: ");
                            if (scanner.hasNextInt()) {
                                int number = scanner.nextInt();
                                System.out.println("Số nguyên bạn nhập là: " + number);
                            } else {
                                System.out.println("Chuỗi nhập vào không phải là một số nguyên.");
                            }
        }
    }
}