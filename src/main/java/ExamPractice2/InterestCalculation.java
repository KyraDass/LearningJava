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
public class InterestCalculation {
    public static void main(String[] args) {
        
        String inputPrinciples = JOptionPane.showInputDialog("Enter your peincipal amount");
        int Principal = Integer.parseInt(inputPrinciples);
        
        double randomPercent = 0;
        randomPercent = (double)Math.random()* 7 + 2  ;
        
        int valueA = 0;
        
        valueA = (int) (Principal * 1 + randomPercent);
        valueA = (int)Math.pow(valueA,8 );
        
        
        System.out.println("Your future value is" + valueA);
        
                 
    }
}
