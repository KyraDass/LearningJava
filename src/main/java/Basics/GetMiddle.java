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
public class GetMiddle {
    
    public static void main(String[] args) {
         StartApp();
         
    }
    
    public static void StartApp() {
        String inputWord = JOptionPane.showInputDialog("Enter a word");
        int mid = inputWord.length()/2;

        System.out.println(inputWord.charAt(mid));
       
        
        
        
        
    }
}
