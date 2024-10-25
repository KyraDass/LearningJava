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
public class LargerOfTwoExercise {

    public static void main(String[] args) {

        String inputNum = JOptionPane.showInputDialog("Enter a num");
        int num = Integer.parseInt(inputNum);

        String inputNum2 = JOptionPane.showInputDialog("Enter a num");
        int num2 = Integer.parseInt(inputNum2);

        if (num > num2) {
            System.out.println("Num one is greater than num 2");
        } else if (num < num2) {
            System.out.println("Num two is grater than num one");
        } else if (num == num2)
            System.out.println("Num one is equal to num two");
    }

}


