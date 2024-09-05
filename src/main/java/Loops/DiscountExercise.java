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
public class DiscountExercise {
    
    public static void main(String[] args) {
        
        
        double price = 0;
        double discount = 0;
        
        String inputPrice = JOptionPane.showInputDialog("Enter total money spent");
        price = Double.parseDouble(inputPrice);
        
        if(price > 100){
            
        discount = price*10/100;
            System.out.println("The discount is" + discount);
            System.out.println( price - discount);
        }
        else {
            System.out.println("No discount");
        }
    }
    
}
