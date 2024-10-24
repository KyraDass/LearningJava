/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term4ExamPractice;

import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class ReplaceColour {
    
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("enter a sentance");
        
        while(input.contains("orange")){
            
            int orangeIndex = input.indexOf("orange");
            
            String before = input.substring(0, orangeIndex);
            
            String after = input.substring(orangeIndex + 6);
            
            input = before + "red" + after;
            
        }
        
        System.out.println(input);
        
    }
    
}
