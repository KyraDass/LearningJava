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
public class Symbols {

    public static void main(String[] args) {

        String inputMark = JOptionPane.showInputDialog("Enter a num");
        double mark = Double.parseDouble(inputMark);


        if (mark >= 80) {
         System.out.println("Mark is" + "A");
        }
        else if (mark < 80 && mark >= 70) {
            System.out.println("Mark is" + "B");
        } 
        else if (mark < 70 && mark >= 60) {
            System.out.println("Mark is " + "C");
        } 
        else if (mark < 60 && mark >= 50) {
            System.out.println("Mark is " + "D");
        } 
        else if ( mark < 50 ) {
            System.out.println("Mark is" + "F");
    }

}

}
