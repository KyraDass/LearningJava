/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term3Practice;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class HLAScanners {

    public static void main(String[] args) {

        String input = "Bob 15 Jame 16 Kyle 21";
        Scanner scInput = new Scanner(input);

        String name = scInput.next();
        int num = scInput.nextInt();

        int highest = num;
        int lowest = num;
        double avg = 0;
        int total = 0;
        int count = 0;

        while (scInput.hasNext()) {
            name = scInput.next();
            num = scInput.nextInt();
            total += num;
            count++;

            if (num > highest) {
                highest = num;

            } else if (num < lowest) {
                lowest = num;
            }

        }
        avg = total / count;
       
        System.out.println("Highest: " + highest + lowest + avg);
        System.out.println("Highest: " + highest + lowest + avg);
        System.out.println("Highest: " + highest + lowest + avg);
    }

}
