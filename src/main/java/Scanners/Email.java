/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Scanners;

import java.util.Scanner;

/**
 *
 * @author kyrad
 */
public class Email {

    
    public static void main(String[] args) {
        
        String input = "Kyra Nick Dee harry";
        Scanner scInput = new Scanner(input);
        
        String first = scInput.next();
        String last = "";
        
        while(scInput.hasNext()){
            last = scInput.next();
        }
        System.out.println(first + last + "@reddam.house");
  
            
            
            
        }
      
    
    
    }
