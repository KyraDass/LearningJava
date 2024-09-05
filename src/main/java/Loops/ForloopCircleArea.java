/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class ForloopCircleArea {

    public static void main(String[] args) {

        // ask the user for radius values 
        // add the values and find the average
        double total = 0;

        for (int radius = 1; radius <= 10; radius++) {

            total += Math.PI * radius * radius;

        }

        System.out.println(total);

    }

}
