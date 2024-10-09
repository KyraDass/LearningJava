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
public class Modenizer {

    public static String main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter your word");
       
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char current
                    = input.toLowerCase().charAt(i);
            if (current == 'e') {
                output += '3';
            } else if (current == 't') {
                output += '7';
            } else if (current == 's') {
                output += '5';
            } else if (current == 'i') {
                output += '1';
            } else if (current == 'o') {
                output += '0';
            } else {
                output += input.charAt(i);
            }
        }
        return output;
    }

}
