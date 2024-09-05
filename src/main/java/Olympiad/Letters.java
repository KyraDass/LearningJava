/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Olympiad;

import javax.swing.JOptionPane;

/*
 *
 * @author kyrad
 */
public class Letters {
    
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter a letter");
        char letter =input.charAt(0);
     
        while(letter >= 'a'){
            System.out.print(letter  +  " ");
            letter = (char)(letter - 2);
            
            
        }
          
            
        
    }
    
}
