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
public class Circle {
    
    public static void main(String[] args) {
        
        String inputx = JOptionPane.showInputDialog("Enter a value for x");
        double x = Double.parseDouble(inputx);
         String inputy = JOptionPane.showInputDialog("Enter a value for y");
         double y = Double.parseDouble(inputy);
         
         double distance = 0;
         
         distance = Math.pow(x, 2) + Math.pow(y, 2);
         distance = Math.sqrt(distance);
         
         if(distance > 1){
             System.out.println("BLUE");
         }else
             System.out.println("RED");
        
    }
    
}
