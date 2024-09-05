/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basics;

/**
 *
 * @author kyrad
 */
import javax.swing.JOptionPane;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        
        StartApp();
        
    } 
     public static void StartApp() {
         String InputNum = JOptionPane.showInputDialog( "Enter length");
         double num1 = Double.parseDouble(InputNum);
         
         String InputNum2 = JOptionPane.showInputDialog(" Enter breath");
         double num2 = Double.parseDouble(InputNum);
         
         double area;
         area = (num1 * num2);
         System.out.println(area);
     }
          
}
