/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basics;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class Email {
    public static void main(String[] args) {
        
        String input = "Viggo Bob Harry Lund";
        Scanner scInput = new Scanner(input);

        String first = scInput.next();
        String last = "";
        
        while (scInput.hasNext()) {            
             last = scInput.next();
        }
        
        System.out.println(first + last + "S");
       
    }
}
