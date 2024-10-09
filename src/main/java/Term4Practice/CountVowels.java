/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term4Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kyrad
 */
public class CountVowels {
    public static void main(String[] args) throws FileNotFoundException {
        
        File f = new File("greatgatsby.txt");
         Scanner sc =  new Scanner(f);
        
        int totalCount = 0;
        int totalVowels = 0;
        double percentage = 0;
        
        while(sc.hasNext()){
            
            String line = sc.nextLine();
            
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                
                if(Character.isLetter(ch)){
                    
                    totalCount++;
                    
                    if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
                        
                        totalVowels++;
                        
                    }
                }
                
            }
        }
        
        percentage = (totalVowels *0.1)/(totalCount);
        percentage = Math.round(percentage)*100;
        
        System.out.println(percentage);
    }
    
}
