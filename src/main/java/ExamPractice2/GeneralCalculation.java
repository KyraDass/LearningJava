/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamPractice2;

import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class GeneralCalculation {
    public static void main(String[] args) {
       
        
        //1.2
      
        String inputNum1 = JOptionPane.showInputDialog("Enter a number");
        int num1 = Integer.parseInt(inputNum1);
        
        String inputNum2 = JOptionPane.showInputDialog("Enter a number");
        int num2 = Integer.parseInt(inputNum2);
        
        if( num1 > num2)
            System.out.println("number 1 is larger");
       
        else{
            System.out.println("number 2 is larger");
            
        }
        
        if(num1%2 == 0){
            System.out.println("number 1 is even");
        }else 
            System.out.println("number 1 is odd");
       
        if(num2%2 == 0){
            System.out.println("number 2 is even");
            
        } else 
            System.out.println("number 2 is odd");
        
        int product = 0;
        
        product = num1 * num2;
        System.out.println("The product is"  +  product);
        
    }
    
}
