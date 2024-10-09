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
public class PasswordChecker {

    public static void main(String[] args) {

        String pass = JOptionPane.showInputDialog("Enter your password");

        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasOther = false;

        for (int i = 0; i < args.length; i++) {
            int currentL = pass.charAt(i);
            if (Character.isDigit(currentL)) {
                hasDigit = true;

            } else if (Character.isUpperCase(currentL)) {
                hasUpper = true;
                
            }else if (Character.isLowerCase(currentL)){
                hasLower = true;
            }else 
                hasOther = true;
        }
        
        if(hasDigit && hasUpper && hasLower && hasOther){
            System.out.println("Password is strong!");
        }else{
            System.out.println("Password is weak");
        }
    }

}
