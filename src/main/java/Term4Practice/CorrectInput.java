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
public class CorrectInput {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter a sentence");
        String output = "";
        
        for (int i = 0; i < input.length(); i++) {
            
            char currentL = input.charAt(i);
            if(currentL == '3'){
                output += "e";
                
            }else if(currentL == '7'){
                output += "t";
            }else{
                output += currentL;
            }
        }

        System.out.println(output);
    }

}
