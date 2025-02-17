/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term1Practice2025;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class Email {
    
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter names");
        
        Scanner sc = new Scanner(input);
        String name = sc.next();
        String lastname = sc.next();
        int random = 0;
        
        while (sc.hasNext()) {            
            
            lastname = sc.next();
            
            name = name.substring(0, 3);
            lastname = lastname.substring(0, 3);
            
            random = (int)Math.random() * 900 + 100;
            
        }
        
        System.out.println(lastname + name +random + "@gmail.com");
    }
    
}
