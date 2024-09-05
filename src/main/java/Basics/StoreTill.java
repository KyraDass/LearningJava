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
public class StoreTill {
    
    public static void main(String[] args) {
        
        StartApp();
        
        
    }
     
    public static void StartApp() {
        String inputChips = JOptionPane.showInputDialog("Enter num chips");
        int numChips = Integer.parseInt(inputChips);
        
        String inputChocs = JOptionPane.showInputDialog("Enter num chocs");
        int numChocs = Integer.parseInt(inputChocs);
        
        String inputCooldrink = JOptionPane.showInputDialog("Enter num cooldrink");
        int numCooldrink = Integer.parseInt(inputCooldrink);
        
        double cost = numChips * 13.75 + numChocs * 14 + numCooldrink * 18.50;
        
        System.out.println(cost);
        
    }
}
