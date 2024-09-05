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
public class RandomLetter {
   
    public static void main(String[] args) {
        
        StartApp();
         
    }
    
    public static void StartApp() {
        
        String inputWord = JOptionPane.showInputDialog("Enter word");
        int length = inputWord.length(); 
        int random = (int)(Math.random()* length);
        
        System.out.println(inputWord.charAt(random));
        
        
    }
  

}
