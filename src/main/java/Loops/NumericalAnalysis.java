/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class NumericalAnalysis {

    public static void main(String[] args) {
        String numLoopsStr = JOptionPane.showInputDialog("How many numbers");
        int numLoops = Integer.parseInt(numLoopsStr);
        
        String input = JOptionPane.showInputDialog("enter a new num");
        int inputNum = Integer.parseInt(input);
        int highest = inputNum;
        int lowest = inputNum;
        int total = inputNum;

        for (int i = 1; i < numLoops; i++) {

            input = JOptionPane.showInputDialog("enter a new num");
            inputNum = Integer.parseInt(input);

            if(inputNum<lowest){
                lowest = inputNum;
            }
            if(inputNum>highest){
                highest = inputNum;
                
               
            }
            
                            }

    }
}
