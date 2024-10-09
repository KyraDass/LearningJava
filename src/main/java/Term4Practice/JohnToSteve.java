/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term4Practice;

/**
 *
 * @author kyrad
 */
public class JohnToSteve {
    public static void main(String[] args) {
        String input = "Hello John,how is Johns mum";
        
        String name = "John";
        String replace = "Steve";
        
        while(input.contains(name)){
            int pos = input.indexOf("John");
            String before = input.substring(0, pos);
            String after = input.substring(pos + 4);
           
            input = before + "Steve" + after;
        }
        
        System.out.println(input);
    }
    
}
