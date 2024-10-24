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
public class CheckPassword {

    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog("enter a password");

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean isDigit = false;
        boolean isLong = false;

        for (int i = 0; i < password.length(); i++) {

            char letter = password.charAt(i);

            if (Character.isDigit(letter)) {
                isDigit = true;
            } else {
                if (Character.isLowerCase(letter)) {
                    hasLower = true;
                } else {
                    if (Character.isUpperCase(letter)) {
                        hasUpper = true;
                    } else {
                        if (password.length() > 8) {
                            isLong = true;
                        }
                    }
                }
            }

        }
        
        if(isDigit && hasLower && hasUpper && isLong){
            System.out.println("Password is strong!");
        }else{
            System.out.println("Password is weak!");
        }
        
    }

}
