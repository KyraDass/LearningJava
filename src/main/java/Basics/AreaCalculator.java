package Basics;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Labuser
 */
 import javax.swing.JOptionPane;
public class AreaCalculator {
    public static void main(String[] args) {
        StartApp(); 
    }
    public static void StartApp() {
         
        String inputNum = JOptionPane.showInputDialog( " Enter num ");
         double num = Double.parseDouble(inputNum);
         
        double area;
        area = Math.PI * Math.pow(num, 2);
        System.out.println (area);
        
         
    }
}
