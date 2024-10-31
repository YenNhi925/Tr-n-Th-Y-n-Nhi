/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author macbookpro
 */
import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập  một chuỗi: ");
                    String inputString = scanner.nextLine();
                    
                   
                    if (scanner.hasNext()) {
                        System.out.println("Chuỗi nhập vào là: " + inputString);
                    } else {
                        System.out.println("Không có dữ liệu nào được nhập vào.");
                    }
        }
    }
}
