/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term1Practice2025;

/**
 *
 * @author kyrad
 */
public class Password {

    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&";

        String output = "";
        for (int i = 0; i < input.length(); i++) {
           int ran = (int)Math.random() * input.length();
            
           output += input.charAt(ran);
        }
        
        System.out.println(output);
    }
}
