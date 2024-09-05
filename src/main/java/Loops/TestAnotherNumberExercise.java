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
public class TestAnotherNumberExercise {

    public static void main(String[] args) {

        int num = 0;
        
        String inputNum = JOptionPane.showInputDialog("Enter a number");
        num = Integer.parseInt(inputNum);

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");

        }

        if (num >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        if (num % 7 == 0) {
            System.out.println("It is a multiple of 7");

        } else {
            System.out.println("It is not a multiple of 7");
        }
        
        if(Math.pow(num, 2)>100)
            System.out.println("Greater");
    }
}
