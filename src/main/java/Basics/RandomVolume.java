/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basics;

import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class RandomVolume {
    
    public static void main(String[] args) {
       
        StartApp();
    }
    
    public static void StartApp() {
        
        String inputRadius = JOptionPane.showInputDialog("Enter num Radius");
        double radius = Double.parseDouble(inputRadius);
        
        double volume;
        volume = 1/3.0 * (Math.PI * Math.pow(radius, 2) * 15.68);
        
        System.out.println(volume);
    }
}
