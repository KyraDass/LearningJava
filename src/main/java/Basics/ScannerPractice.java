/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basics;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author kyrad
 */
public class ScannerPractice {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter 10 numbers");
        Scanner scInput = new Scanner(input).useDelimiter(",");

        int num = scInput.nextInt();
        int highest = num;
        int lowest = num;
        double avg = 0;
        
        for (int i = 0; i < 9; i++) {
            num = scInput.nextInt();

            if (num > highest) {
                highest = num;
            }
            else if (num < lowest) {
                lowest = num;
            }
            
            avg = avg + num;
        }
        
        avg = avg / 10;
        System.out.println(highest);

    }

}
