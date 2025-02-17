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
public class PasswordStrength {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter a password");

        boolean isUpper = false;
        boolean isLower = false;
        boolean isDigit = false;
        boolean isLong = false;

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                isUpper = true;

            } else {

                if (Character.isLowerCase(ch)) {
                    isLower = true;
                } else {

                    if (Character.isDigit(ch)) {
                        isDigit = true;
                    }
                }
            }

            if (input.length() >= 8) {
                isLong = true;
            }

            if (isDigit && isLong && isLower && isUpper) {
                System.out.println("Pass is strong");
            } else {
                System.out.println("Pass is weak");
            }

        }
    }
}
