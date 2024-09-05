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
public class StoreAdmin {
    
    public static void main(String[] args) {
        
        StartApp();
        
       
    }
    
    public static void StartApp() {
        
        String inputCola = JOptionPane.showInputDialog("Enter num Coca-Cola");
        int numCoke = Integer.parseInt(inputCola);
        
        
        String inputBarone = JOptionPane.showInputDialog("Enter num BarOne");
        int numChocs = Integer.parseInt(inputBarone);
        
        String inputWater = JOptionPane.showInputDialog("Enter num Coca-Cola");
        int numWater= Integer.parseInt(inputWater);
        
        double cost = numCoke * 13.90 + numChocs * 12 + numWater * 9.50;
        
        System.out.println(cost);
        
         
        
    }
}
