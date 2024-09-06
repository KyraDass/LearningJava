/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kyrad
 */
public class NamesWeights {
    
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter your name and weight");
        Scanner sc = new Scanner(input);
        
        String name = sc.next();
        double weight = sc.nextDouble();
        
        double highweight = weight;
        double lowweight = weight;
        String highname = "";
        String lowname = "";
        
        while(sc.hasNext()){
            
            name = sc.next();
            weight = sc.nextDouble();
            
            if(weight > highweight){
               highweight = weight;
               highname = name;
            }else if(weight < lowweight ){
                lowweight = weight;
                lowname = name;
            }
            
            
        }
        System.out.println(name + highweight + lowweight);
    }
    
}
