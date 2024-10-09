/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term4Practice;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class PasswordStrength {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter your password");

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        boolean isLong = false;
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (Character.isLowerCase(current)) {
                hasLower = true;
            } else if (Character.isUpperCase(current)) {
                hasUpper = true;
            } else if (Character.isDigit(current)) {
                hasDigit = true;

            } else {
                hasSpecial = true;
            }

        }
        
       if(input.length() >= 8) {
           isLong = true;
           
           
       }
        
        System.out.println();
    }
}
