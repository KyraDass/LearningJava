/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class TenNumbers {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter 10 numbers");
        Scanner scInput = new Scanner(input);

        int num = scInput.nextInt();

        int lowest = num;
        int highest = num;
        double avg = 0;
        double total = 0;
       

        for (int i = 0; i < 9; i++) {
           num = scInput.nextInt();

            if (num > highest) {
                highest = num;
                
            } else if (num < lowest) {
                lowest = num;
            }

            total += num;

        }
        avg = total / 10;
        System.out.println("Highest:" + highest);
         System.out.println("Lowest:" + lowest);
          System.out.println("Average:" + avg);

    }

}
