/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term4Practice;

/**
 *
 * @author kyrad
 */
public class ChangeJohn {
    public static String changeJohn(String input){
        
        int johnIndex = input.indexOf("John");
        
        String beforeJohn = input.substring(0, johnIndex);
        String afterJohn = input.substring(johnIndex, 4);
        
        return beforeJohn + "peter" + afterJohn;
    }
}
