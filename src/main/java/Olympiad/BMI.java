/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Olympiad;

import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class BMI {

    public static void main(String[] args) {

        String inputMass = JOptionPane.showInputDialog("Enter a Mass");
        double mass = Integer.parseInt(inputMass);

        String inputHeight = JOptionPane.showInputDialog("Enter a Mass");
        double height = Double.parseDouble(inputHeight);

        double BMI = mass / Math.pow(height, 2);
        BMI = Math.round(BMI);
        
        System.out.println(BMI);
    }

}
