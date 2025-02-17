/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term1Practice2025;

import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class ContainsDoubleLetter {
    
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter a sentence");
        boolean containsDoubleLetter = false;
        
        for (int i = 0; i < input.length()-1; i++) {
           
            char ch = input.charAt(i);
            
            char first = ch;
            char second = input.charAt( i + 1);
            
            if(first == second){
                
                containsDoubleLetter = true;
            }else{
                
                containsDoubleLetter = false;
            }
            
            
            
        }
        System.out.println(containsDoubleLetter);
    }
    
}
