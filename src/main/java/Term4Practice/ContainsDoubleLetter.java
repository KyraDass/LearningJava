/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term4Practice;

import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class ContainsDoubleLetter {
    
    public static boolean main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter pass");
        for (int i = 0; i < input.length()-1; i++) {
           char current = input.charAt(i);
            char next = input.charAt(i + 1);
            
            if(current == next){
                return true;
            }
           
            
        }
        return false;
    }
}
