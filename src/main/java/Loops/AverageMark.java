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
public class AverageMark {

    public static void main(String[] args) {
        String inputNumtests = JOptionPane.showInputDialog("How many tests?");
        int tests = Integer.parseInt(inputNumtests);

        double sum = 0;

        for (int i = 1; i < tests; i++) {

            String inputMark = JOptionPane.showInputDialog("Enter mark");
            double mark = Double.parseDouble(inputMark);

            sum += mark;

        }

        double avg = sum / tests;
        avg = (int) (avg * 100) / 100.0;
        System.out.println("Avg:" + avg);
    }

}
