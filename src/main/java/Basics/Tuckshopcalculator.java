/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basics;

/**
 *
 * @author Labuser
 */
import javax.swing.JOptionPane;
public class Tuckshopcalculator{
    public static void main(String[] args) {
        StartApp();
    }
    
    public static void StartApp(){
    
       String inputCoke = JOptionPane.showInputDialog(" Enter num Cokes");
       int numCokes = Integer.parseInt( inputCoke );
       
       String inputChips = JOptionPane.showInputDialog(" Enter num Chips");
       int numChips = Integer.parseInt( inputChips );
       
       String inputChocs = JOptionPane.showInputDialog(" Enter num Chocs");
       int numChocs = Integer.parseInt( inputChocs );
       
       double cost = numCokes * 11.50 + numChips * 8.50 + numChocs * 10;
       
       System.out.println(" the total cost is " + cost);
       
 
       
        
    }
      
        
    
   
}

