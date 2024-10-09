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
public class CompareNames {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter a name");
        String output = name;
        
        while(!name.equals("XXX")){
            
            name = JOptionPane.showInputDialog("Enter a name");
          
            
           if(name.compareTo(output) < 0){
               output = name;
           }
          
          
        }
        
        System.out.println("mostAlpha"  +  output);
    }
    
}
