/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term4Practice;

import java.util.Scanner;

/**
 *
 * @author kyrad
 */
public class ReplaceName {

//    public static void main(String[] args) {
//        String input = "John eats apples John like apples";
//        Scanner sc =  new Scanner(input);
//        
//        String word = sc.next();
//        String name = "John";
//        
//        while(sc.hasNext()){
//            
//            word = sc.next();
//            
//            if(word.equals(name)){
//                
//                name = "Steve";
//                
//                
//            }
//                
//            
//            
//        }
//        
//        System.out.println();
    public static String changeJohn(String input) {
        int johnIndex = input.indexOf("John");
        String beforeJohn = input.substring(0, johnIndex);

        String afterJohn = input.substring(johnIndex + 4);

        return beforeJohn + "Peter" + afterJohn;
    }
}

